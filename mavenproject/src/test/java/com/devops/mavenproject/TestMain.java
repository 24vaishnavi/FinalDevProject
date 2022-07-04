package com.devops.mavenproject;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestMain 
    extends TestCase
{
    
    public void testInputIsEven() {
    	assertTrue(Main.checkIfInputIsAnEvenNumber(22));
    }
    public TestMain( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestMain.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
