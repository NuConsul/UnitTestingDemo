package com.chemwater.unittestingdemo;

public class StringUtil {
    public static String concatTwoString(String stringOne, String stringTwo) {
        return stringOne + " " + stringTwo ;
        //say if fifth line is changed to
        //return (stringOne + " " + stringTwo).toUpperCase() ;
        //How will this change features in application in other areas?
    }

    public static boolean stringLengthGreaterThanFive(String stringToCheck) {
        if(stringToCheck.length() > 5) {
            return true ;
        } else {
            return false ;
        }
    }


    //Not a good demo because of its simplicity
    public String returnString(String stringToReturn) {
        return stringToReturn ;
    }


    public static String processStudentName(Student student) {
        return student.getStudentName() + " has a gpa of " + student.getStudentGPA() ;
    }

    public static String processGPA(Student student) {
        student.processGPA() ;
        return "GPA Processed" ;
    }


}

//Creating multiple instances of application and making sure that all of those instances are
//running as expected. It will make sure that the unit testing builds. If the unit test fails it will not build.
//The most common one used is Jenkins.
//If you use Jenkins you can link it to your repository and run testing online with Jenkins

/*
Most companies if not all will have some type of continuous integration.
 */


//Unit testing is done to make sure our code is running as expected
//We have instrumental testing and unit testing
//(androidTest) Instrumental Testing for Android.
// Espresso is generally used

//Unit Testing is used to make sure methods or data settings are working as expected
//Mockito is generally used

//Instrumental testing is testing UI components to make sure its running as expected
//Test running development: You write your test first then you write your code to write your test


/*
Employers like to hear that you implement test driven development.

It makes sure that changes to the code don't effect changes elsewhere.
This is generally good for enterprise level development.
So if their was changes that was not expected it can be found out using unit testing


//Any code written as a Senior Developer one is expected to write UnitTesting as well
 */



//The most basic tests for JUnit are assert tests
//In the Gradle you can see the library called Junit for unit testing
//You can also see another testing library with espresso