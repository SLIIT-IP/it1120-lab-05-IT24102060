import java.util.Scanner;

public class IT24102060Lab5Q2{
	public static void main(String[] args) {
        int newMember;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");
        newMember = input.nextInt();
        
        if(newMember<0)
        {
            System.out.print("Input must be a number 0 or greater");
            return;
        }

        switch(newMember)
        {
            case 0: 
                System.out.print("No Prize");
                break;
            case 1:
                System.out.print("Prize is a : Pen");
                break;
            case 2: 
                System.out.print("Prize is an : Umbrella");
                break;
            case 3:
                System.out.print("Prize is a : Bag");
                break;
            case 4:
                System.out.print("Prize is a : Travelling Chair");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.print("Prize is a : Headphone");
                break;
            default:
        }
    }
}