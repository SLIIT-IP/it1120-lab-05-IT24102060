import java.util.Scanner;

public class IT24102060Lab5Q1{
	public static void main(String[] args)
	{
	int fNum, sNum, tNum, smallNum, largeNum;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first integer: ");
	fNum = input.nextInt();
	System.out.print("Enter the sceond integer: ");
	sNum = input.nextInt();
	System.out.print("Enter the third integer: ");
	tNum = input.nextInt();
	System.out.println("  ");
	System.out.println("User entered numbers are : " + fNum + " " + sNum + " " + tNum);
	
	smallNum = fNum;
	largeNum = fNum;

	if(sNum<fNum)
	{
	smallNum = sNum;
	}
	
	if(tNum<fNum)
	{
	smallNum = tNum;
	}

	if(sNum>fNum)
	{
	largeNum = sNum;
	}

	if(tNum>fNum)
	{
	largeNum = tNum;
	}

	System.out.println("The Smallest number is: " +smallNum);
	System.out.println("The Largest number is: " +largeNum);
	}
}