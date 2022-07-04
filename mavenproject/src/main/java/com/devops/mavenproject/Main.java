package com.devops.mavenproject;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( checkIfInputIsAnEvenNumber(122) );
    }

	static boolean checkIfInputIsAnEvenNumber(int number) {
		// TODO Auto-generated method stub
		return number %2 ==0;
	}
}
