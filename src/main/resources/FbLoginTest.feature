Feature: To validate the Functionality of the Facebook Login page 

Scenario: To validate the login page by entering invalid username and invalid password

Given To configure the browser that we are going to launch

When To launch the browser

And To pass the invalid username in the email text field

And To pass the invalid password in the password field

And To click the login button

Then To close the browser

Scenario Outline: To validate the login page by entering mixed datas

Given To configure the browser that we are going to launch

When To launch the browser that we need to open

And To pass the value "<username>" to the email text field

And To pass the value "<password>" to the password text field

And To click the login button by using click method

Then To exit the browser by using exit method

Examples:

										|			username								|			password									|
										|			babuq023								|			19272352									|
										|			java@123									|			jasjabdjsbksdk			|
										|			selenium123					|			12wwy2w2wt12		|
										|			kumar12029						|			ksjdnjksdjsadb			|
