import java.util.Scanner;

class Ques02 
{
	public static void main(String[] args) 
	{ 
		//create a Scanner object to read input
      Scanner sc= new Scanner(System.in);
	  // Read the size of array 
	  System.out.println("Enter size of the array :");
	   int num = sc.nextInt();

     // create array with specfied array size
	  int arr[] = new int[num];
    
	// Read th input Element of the array	
      System.out.println("Enter "+num +" Element");
 
       
	   for(int i=0;i<num;i++)
		{
          arr[i] = sc.nextInt();

		  }
       System.out.println("Element are :");
 
		  for (int i=0;i<num;i++)
		  {
			  System.out.println(arr[i]);
		  }

	}
}
/*Question 2:
 Write a program to store array dynamically by reading the size 
 and elements from the user.
 Input as: 
 Enter size of the array:6
 Enter 6 elements: 1 2 3 4 5 6
 Output is: 
 Array elements are: 1 2 3 4 5 6*/