import java.util.Scanner;

class Ques06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

         System.out.println("Enter the size");
	      int size = sc.nextInt();
                
			int arr[] = new int[size];

			
			  System.out.println("Enter "+size+" Elements");
               for (int i=0;i<size;i++)
			{
				arr [i]= sc.nextInt();
			} 
                                               
                int sum = arr[size -1] + arr[0];
				 System.out.println("Sum of first and Last is :"+sum );


		 } 
}
/*Question 6:
 Write a java program to add the last and first element of a given array.

 Input as: [1,2,3,4,5,6]
 Output as: 7
*/