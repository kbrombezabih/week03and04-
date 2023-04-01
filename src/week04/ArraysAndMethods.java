package week04;

import java.util.Arrays;

public class ArraysAndMethods {
  public static void main(String[]args) {
    
    //1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
  
  int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 83};
  //a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
  //(i.e. do not use ages[7] in your code). Print the result to the console.
  //
  //b.  Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
  
  System.out.println( (ages[ages.length-1] - ages[0]));   // Q1 a and b
  
  //c.  Use a loop to iterate through the array and calculate the average age. Print the result to the console.
  int sum = 0;
  for(int i=0; i< ages.length; i++){
      sum += ages[i];
  }
  int average = sum/(ages.length);
 System.out.println("The average age is "+ average); // Q1 c
  
  //2.  Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
  String[] names ={"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //Q2
  
  //a.  Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
  int sumOfCharacters = 0;
  int averageOfCharacters = 0;
  for(int i=0; i< names.length; i++){
      sumOfCharacters += names[i].length();
  }
  averageOfCharacters = sumOfCharacters / (names.length);
 System.out.println("The average number of characters in names is " + averageOfCharacters); //Q2 a
  
  //b.  Use a loop to iterate through the array again and concatenate all the names together, 
  //    separated by spaces, and print the result to the console.
  for (String x : names){
     System.out.print(x + " "); // Q2 b
      }
      System.out.println();
  
 //3.   How do you access the last element of any array?
 System.out.println("The last element in names is " + names[names.length-1]); 
  
  //4.  How do you access the first element of any array?
  System.out.println("The first element in names is " + names[0]); 
  
  //5. Create a new array of int called nameLengths. 
  //  Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
  
  int[] nameLengths = new int[names.length]; 
  for(int i=0; i< names.length; i++){
      nameLengths[i] = names[i].length();
  }
  System.out.println("nameLengths = " + Arrays.toString(nameLengths));
  

//6.    Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.. 
  //    Print the result to the console
  
   int sum2 = 0;
   for(int i=0; i< nameLengths.length; i++) {
     sum2 += nameLengths[i];
   }
   System.out.println("sum of elements in the array = " + sum2);
  }
 // 7.  Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
  //    (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
  
  public String repeatedWord(String word, int n){
       String tripleHello = "";
     for(int i=0; i< n; i++) {
       tripleHello += word;
     }
     return tripleHello;
   }
  //8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
  //(the full name should be the first and the last name as a String separated by a space).
  
   public static String custormerName(String firstName, String lastName) {
     return (firstName + " " + lastName);
   }
   //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
   
   public static boolean isSumGreaterThanHundred(int[] n) {
     int sum3 = 0;
     for(int i = 0; i<n.length; i++) {
       sum3 += n[i];
     }
     if(sum3 >100) {
       return true;
     }else {
       return false;
     }
   }
   //10. Write a method that takes an array of double and returns the average of all the elements in the array.
   public static double average(double[] x) {
     double sum4 = 0.0;
     for(int i = 0; i<x.length; i++) {
       sum4 += x[i];
     }
     return sum4/ x.length;
   }
   //11.    Write a method that takes two arrays of double and returns true if the average of 
   //      the elements in the first array is greater than the average of the elements in the second array.
   
   public static boolean checkAverage(double[] a, double[] b) {
     
     double sum1 = 0.0;
     double sum2 = 0.0;
     double average1 = 0.0;
     double average2 = 0.0;
     
     for(double x: a) {
       sum1 += x;
     }
     for(double y: b) {
       sum2 += y;
     }
     average1 = sum1 / a.length;
     average2 = sum2 / b.length;
     if(average1 > average2) {
       return true;
     } else {
       return false;
     }
   }
   //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and 
   //    returns true if it is hot outside and if moneyInPocket is greater than 10.50.
   
   public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
     if(isHotOutside == true && moneyInPocket > 10.50) {
       return true;
     } else {
       return false;
     }
     
   }
   
  // 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
   // This method checks the customer age if they are qualified to buy an alcohol.
   public static void checkAge(int age) {
     if(age >= 21) {
       System.out.println("good to buy Alchohol");
     } else {
       System.out.println("please come back after " + ( 21- age) + " years for alcohol.");
     }
   }
   
   
  }
