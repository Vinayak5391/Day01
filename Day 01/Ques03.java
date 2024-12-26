 import java.util.Scanner;
 import java.util.Random;
 class Ques03 
{
	public static void main(String[] args) 
	{
		//create a Scanner object to read input
      Scanner sc= new Scanner(System.in);
	  // Read the size of array 
	  System.out.println("Enter size of the array :");
	   int num = sc.nextInt();
        
		 int arr[] = new int[num];

       Random r1 = new Random();
 
      for (int i=0;i<num;i++)
      {
		  arr[i] = r1.nextInt(100)+1;
      }
       System.out.println("Element are :");
 
		  for (int i=0;i<num;i++)
		  {
			  System.out.println(arr[i]);
		  }
}
}
 /*Question 3:
 Create a program that accepts the size of an array from the user,
 initializes the array with random numbers between 1 and 100, and 
 prints the array.*/