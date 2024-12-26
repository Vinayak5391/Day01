import java.util.Scanner;

class Ques05 
{
	public static void main(String[] args) 
	{

    Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size of the Element ");
	  int size = sc.nextInt();

      int arr [] = new int[size];
	  System.out.println("Enter "+size+" Element");
	     for (int i=0;i<size;i++)
	     {
			 arr[i] = sc.nextInt(size);

	     }

         if (size % 2!=0)
         {
			 int mid = size/2;
			 System.out.println(arr[mid]);
         }else {
			int mid1 = size / 2-1;
			int mid2 = size / 2;
			System.out.println("middle Element are :"+ arr[mid1]+ ","+arr[mid2]);
         }

sc.close();
  } 

}


/*Question 5:
 Write a java program to find the middle elements of a given array. 
 If array is odd then print only the middle element, if array is even then
 print both the middle elements.

 Input as : 1 2 3 4 5  
 Output is : 3
 Input is :1 2 3 4 5 6 
 Output is :3 4
*/
