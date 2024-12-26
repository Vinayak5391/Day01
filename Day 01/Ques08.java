import java.util.Scanner;

class Ques08 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size :");

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter "+ size+" Element");
         for (int i=0;i<size;i++)
         {
			 arr[i] = sc.nextInt();
         }
 
		  int sum =0;
		  for (int i=0;i<size;i++)
		  {
			  sum += arr[i];
			  }System.out.println("Sum of the number "+sum);
		  
		 
			 
			  
			 
  }
}
/*Question 8:
 Calculate Sum of Array Elements.
 Input as: 1 2 3 4 5
 Output as: 15*/
