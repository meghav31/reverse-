import java.lang.*;

import java.io.*;

import java.util.*;

public class strReverse {

    public static void main(String[] args)

    {    
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String stringInput = sc.nextLine();  

    //Get the String length

    int iStrLength=stringInput.length();    

    //Using While loop
System.out.print("Reverse string is : "); 
while(iStrLength >0)

{

System.out.print(stringInput.charAt(iStrLength -1)); 

iStrLength--;

}

    }

}
