package com.example.admin.stuffed8;

/**
 * Created by Vaishali on 12/06/2017.
 */
public class Config {
    //URL that will link to database which has our login.php file
    public static final String LOGIN_URL = "https://web.cs.dal.ca/~arulappan/ubicomp/login.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";


    //Compares response obtained from server and enetered  credentials 
	//If the credentials matches, login is successfully achieved
    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "myloginapp";

    //This would be used to store the email of current logged in user
    public static final String EMAIL_SHARED_PREF = "email";


    //To check if logged in enteries
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";

    //gmail login credentials set by default for the emails to be sent
    public static final String EMAIL ="ubicompgroup8.stuffed@gmail.com";
    public static final String PASSWORD ="Ubicomp2017";
}
