package com.chemwater.unittestingdemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;


@RunWith(MockitoJUnitRunner.class)
public class StringUtilTest {

    Student mockStudent ;


    //runs before testing is done
    @Before
    public void setup() {
        mockStudent = mock(Student.class) ;
        //when this method is called, then return a name
        Mockito.when(mockStudent.getStudentName()).thenReturn("Bill") ;
    }

    //Normal naming convention is to name the class the name of the class being tested
    //And the methods named after the name of the methods being tested
    @Test
    public void testConcatTwoStrings() {
        final String one = "test" ;
        final String two = "method" ;
        final String expectResult = one + " " + two ;

        Assert.assertEquals(expectResult, StringUtil.concatTwoString(one, two)) ;
    }


    //Use test annotation
    @Test
    public void testStringLengthGreaterThanFive_True() {
        Assert.assertTrue(StringUtil.stringLengthGreaterThanFive("ShepsuMa\'at"));
    }


    //Use test annotation
    //Structure: Test, MethodName, and conditional information we are testing
    @Test
    public void testStringLengthGreaterThanFive_False() {
        Assert.assertFalse(StringUtil.stringLengthGreaterThanFive("blue"));
    }


    @Test
    public void testReturnString_Null() {
        String testString = null ;
        Assert.assertNull(testString) ;
    }


    @Test
    public void testReturnString_NotNull() {
        String testString = "I HAVE A VALUE" ;
        Assert.assertNotNull(testString) ;
    }


    @Test
    public void testProcessStudentName() {
        final String middleText = " has a gpa of " ;
        final String mockGPAValue = "3.5" ;
        final String expectedResult = "Bill" + middleText + mockGPAValue ;

        //If you want the value to be changing you would do Mockito
        Mockito.when(mockStudent.getStudentGPA()).thenReturn(mockGPAValue) ;
        Assert.assertEquals(expectedResult, StringUtil.processStudentName(mockStudent)) ;
    }

    @Test
    public void testProcessStudentGPA() {
        StringUtil.processGPA(mockStudent) ;
        Mockito.verify(mockStudent, times(1)).processGPA() ;
    }

}
