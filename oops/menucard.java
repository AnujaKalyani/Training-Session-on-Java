package sak.com;
import java.util.*;
public class menucard {

	public static void main(String[] args) {
		String res;
		System.out.println("***********************************");
		System.out.println("Menu Card");
        System.out.println("------------------------------------");
        System.out.println("1. Pizza - $10.99");
        System.out.println("2. Burger - $8.99");
        System.out.println("3. Sandwich - $7.99");
        System.out.println("4. Salad - $6.99");
        System.out.println("5. Drink - $2.99");
        System.out.println("--------------------------------------");
        System.out.println("*************************************");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

       
        double totalCost = 0.0;
        String item = "";
        do {
        switch (choice) {
            case 1:
                item = "Pizza";
                totalCost = 10.99 * quantity;
                break;
            case 2:
                item = "Burger";
                totalCost = 8.99 * quantity;
                break;
            case 3:
                item = "Sandwich";
                totalCost = 7.99 * quantity;
                break;
            case 4:
                item = "Salad";
                totalCost = 6.99 * quantity;
                break;
            case 5:
                item = "Drink";
                totalCost = 2.99 * quantity;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        
        System.out.println("You have ordered " + quantity + " " + item + "(s)");
        System.out.println("Total cost: $" + String.format("%.2f", totalCost));
        
        System.out.println("do yo want to order again (y/n):");
		res=scanner.next();
	} while(res.equals("y"));

	}
}


