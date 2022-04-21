/**
 * 
 * @(#)InsuranceSystem.java
 * @authors Rafael Hernandez and Sarah Skinner
 * @version 1.00 2022/04/20 10:57 PM
 *
 * PROGRAM PURPOSE:  ??
 */

import java.util.Scanner;   //imports the scanner class for capturing user input
import java.util.Calendar;  //imports the Calendar class for displaying current date/time
import java.util.ArrayList; //imports the arraylist class 
import java.io.*;           //imports all classes under java.io for IO exceptions, file, and printwriter
//import calendar, arraylist, file, printwriter, ioexception

public class InsuranceSystem
{
  //class data members
  //Earthquake Insurance[] claims = new EarthquakeInsurance();
  //Scanner input = new Scanner(); 
  //Calendar dateTime = new Calendar();
  //Arraylist<String> claimsReport ??
  //String fileName; 
  //char cont; 
  //char correct; 
  private EarthquakeInsurance claims = new EarthquakeInsurance(); //MAY NOT WORK
  private Scanner input = new Scanner(System.in);
  private Calendar dateTime = Calendar.getInstance();
  private ArrayList<String> claimsReport= new ArrayList<String>();
  private String filename = "";
  private char cont = ' ';
  private char correct = ' ';
  
  public InsuranceSystem()
  {
  }
  
  public static void start(String[] args)
  {
  //prompt 1 
  }
  
  public static void processClaims()
  {
    int size = 0;
    int j = 0;
    int k = 0;
    
    String suffix = "";
    String aClaim = "";
    
    processClaims();
    String record = "";
    PrintWriter outputFile = new PrintWriter("File");
    
    outputFile.close();
    
    //checkInputFile();
    
    
  }
  
  public static void writeClaimsRecords(String[] args) 
  {
    //??
  }
  
  public static void checkInputFile(String[] args) 
  {
    //jdnnf
  }
  
  public static void printThankYou()
  {
    System.out.printf("%nThank you for using the Earthquake Coverage Analyzer.");
  }
  
}

