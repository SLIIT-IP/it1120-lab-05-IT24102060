import java.util.Scanner;
public class IT24102060Lab5Q3{
	public static void main(String[] args)
	{
	int startDate, endDate, daysReserved;
	double shouldPay, totalAmount;
	double discountRate = 0;
	final double room_Charge_per_Day = 48000.0;
	final double discount_3to4_Days = 0.1;
	final double discount_5or_More = 0.2;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter Start Date (1-31):");
	startDate = input.nextInt();
	System.out.print("Enter End Date (1-31):");
	endDate = input.nextInt();

	if(startDate<1 || startDate>31 || endDate<1 || endDate>31)
	{
	System.out.print("Error: Days must be between 1 and 31");
	return;
	}
	
	if(startDate>=endDate)
	{
	System.out.print("Error: Start Date must be less than End Date");
	return;
	}

	daysReserved = endDate - startDate;
	
	if(daysReserved<3)
	{
	discountRate = 0;
	}
	else if(3 <= daysReserved || daysReserved <= 4)
	{
	discountRate = discount_3to4_Days;
	}
	else
	{
	discountRate = discount_5or_More;
	}

	shouldPay =  daysReserved * room_Charge_per_Day;
	totalAmount = shouldPay - (shouldPay*discountRate);

	System.out.println("Room Charge per Day : Rs" + room_Charge_per_Day);
	System.out.println("Number of Days Reserved:" + daysReserved);
	System.out.println("Total Amount to be Paid:" + totalAmount);
	}
}