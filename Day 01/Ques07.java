import java.util.Scanner;
class Ques07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
            
			System.out.println("Enter size :");
			int size = sc.nextInt();

			int arr[] = new int[size];

			System.out.println("Enter the "+size+" Element");
			for(int i=0;i< size;i++)
		{
				arr[i] = sc.nextInt();
		}

     System.out.print("Even number are :");
		for(int i=0;i<size;i++)
		{
			if (arr[i]%2 ==0)
			{
				System.out.print(arr[i]+ "  ");
				}
				}


           System.out.print("\nOdd are :");
		       for (int i=0;i<size;i++)
					{
					if(arr[i]%2 !=0){
				System.out.print(arr[i] +" ");
					}
				}
				sc.close();

		 }
}
/*Question 7:
 Write a java program to print all even elements and odd elements separately
 from an array.

 Input as  : 1 2 3 4 5 6 7
 Even elements are : 2 4 6
 Odd elements are : 1 3 5 7
*/