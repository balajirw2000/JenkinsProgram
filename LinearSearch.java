import java.util.Scanner;
class LinearSearch
{
	public static void main(String args[])
	{
		int n,i,target;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("\nEnter the elements of an array:");
		for(i=0; i<n; i++)
			A[i] = sc.nextInt();
		System.out.print("Enter the element you want to search: ");
		target = sc.nextInt();
		for(i=0; i<n; i++)
		{
			if(A[i] == target)
			{
				System.out.println("\nTarget is at index "+i);
			}
		}
	}
}