import java.util.Scanner;
class Ques09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

           System.out.println("Enter size ");
		   int size = sc.nextInt();
           
		   int sum = 0;
		   int avg =0;
		     System.out.println("Enter "+ size+" Element");
		   for (int i=0;i<size;i++)
		   {
			   int arr []= new int[size];
                arr[i] = sc.nextInt();
				int length = arr.length;
                sum +=arr[i];
				avg = (sum / length);
				
				}  
				  System.out.println("Avg is :"+avg);
    	
	}
}
/*Question 9:
 Find Average of Array Elements.
 Input as: 1 2 3 4 5
 Output as: 3*/