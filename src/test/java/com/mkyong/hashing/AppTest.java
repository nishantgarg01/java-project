package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

public void testevenodd()
{
App ob = new App();
String result = ob.checkevenodd(10);
String excepted = "Even";
assertEquals(result,excepted);

}
public void testevenodd1()
{
App ob = new App();
String result = ob.checkevenodd(9);
String excepted = "odd";
assertEquals(result,excepted);

}
}