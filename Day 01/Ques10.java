import java.util.Scanner;
class Ques10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

           System.out.println("Enter size ");
		   int size = sc.nextInt();

           int arr[] = new int[size];
            int sum = 0;

           System.out.println("Enter "+size+" Elements");
		   for (int i=0;i<size;i++)
		   {
			   arr[i] = sc.nextInt();
		   }
		   for (int i=size-1 ;i >= 0;i--)
		   {
			System.out.print( arr[i]+" ");
		    
		   }
		    }
}
/*Question 10:
 Print all elements in reverse order of an Array.
                    
 Input as: 1 2 3 4 5
 Output as: 5 4 3 2 1*/