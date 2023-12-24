Feature: Login
Scenario: Successful login with valid credentials
Given browser is open 
When user opens the url "https://www.demoblaze.com/"
Then click on Sign up link and alert prompt appears
Then enter username as "dasarpita0406@gmail.com" and password as "admin"
Then click on Sign Up button
Then Sign up successful message appears in alert box
Then close the browser



