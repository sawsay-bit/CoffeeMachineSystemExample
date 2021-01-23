import java.util.Scanner;
public class Coffee{
    public static void main(String[] args){
        int menu;
        int coffeeP = 2;
        int milchCP = 3;
        int blackCP = 4;
        System.out.println("Coffee Menu");
        System.out.println("1 for coffee");
        System.out.println("2 for milchCoffee");
        System.out.println("3 for blackCoffee");
        System.out.println("Enter a number you want");
        Scanner scanner = new Scanner(System.in);
        menu = scanner.nextInt();
        if(menu == 1){
            System.out.println("Coffee      : " + coffeeP + "€");
            System.out.println("Enter 1 to Buy or 2 to Exist");
            int input = scanner.nextInt();
            if(input == 1){
                System.out.println("Put money between 2 to 5");
                int money = scanner.nextInt();
                if(money > 2 && money <= 5){
                    int ChangeM = money - coffeeP;
                    System.out.println("Change Money : " + ChangeM + "€");
                    System.out.println("Here is your coffee.");
                }else if(money == 2){
                    System.out.println("No change and here your coffee.");
                }else{
                    System.out.println("Money is less than 2 or greater than 5");
                }
            }else if(input == 2){
                System.out.println("Exit");
            }else{
                System.out.println("Press only 1 or 2");
            }
        }else if(menu == 2){
            System.out.println("MichCoffee  : " + milchCP + "€");
            System.out.println("Enter 1 to buy or 2 to Exist");
            int input1 = scanner.nextInt();
            if(input1 == 1){
                System.out.println("Put money between 3 to 7");
                int money1 = scanner.nextInt();
                if(money1 > 3 && money1 <= 7){
                    int changeM1 = money1 - milchCP;
                    System.out.println("Change Money : " + changeM1 + "€");
                    System.out.println("Here is your milchCoffee.");
                }else if(money1 == 3){
                    System.out.println("No change and here is your milchCoffee.");
                }else{
                    System.out.println("Money is less than 3 or greater than 7.");
                }
            }else if(input1 == 2){
                System.out.println("Exist");
            }else{
                System.out.println("Press only 1 or 2");
            }
        }else if(menu == 3){
            System.out.println("BlackCoffee : " + blackCP + "€");
            System.out.println("Enter 1 to buy or 2 to Exist.");
            int input2 = scanner.nextInt();
            if(input2 == 1){
                System.out.println("Enter money between 4 to 10");
                int money3 = scanner.nextInt();
                if(money3 > 4 && money3 <= 10){
                    int changeM2 = money3 - blackCP;
                    System.out.println("Change Money : " + changeM2 + "€");
                    System.out.println("Here is your blackCoffee.");
                }else if(money3 == 4){
                    System.out.println("No change and here is your blackCoffee.");
                }else{
                    System.out.println("Money is less than 4 or greater than 10.");
                }
            }else if(input2 == 2){
                System.out.println("Exist");
            }else{
                System.out.println("Press only 1 or 2");
            }
        }else{
            System.out.println("Try again");
        }
    }
}