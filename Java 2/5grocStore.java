/******************************************************************************

5grocStore
Khanon Curtis
4/23/25

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        groceryStore houstonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();
        
        houstonStore.appleSales = 534;
        houstonStore.applePrice = 0.99;
        houstonStore.orangeSales = 429;
        houstonStore.orangePrice = 0.87;
        
        seattleStore.appleSales = 765;
        seattleStore.applePrice = 0.86;
        seattleStore.orangeSales = 842;
        seattleStore.orangePrice = 0.91;
        
        orlandoStore.appleSales = 402;
        orlandoStore.applePrice = 0.77;
        orlandoStore.orangeSales = 398;
        orlandoStore.orangePrice = 0.79;
        
        System.out.print("Target Apple Revenue: $");
        double target1 = input.nextDouble();
        
        System.out.print("Target Orange Revenue: $");
        double target2 = input.nextDouble();
        
        System.out.printf("\n\nHOUSTON STORE\nApples Sold - %d\nApple Retail Cost - $%.2f\n\nOranges Sold - %d\nOrange Retail Cost - $%.2f\n\nGross Revenue: $%.2f\n\nTarget $%.2f of apples sales: %,.0f\nTarget $%.2f of oranges sales: %,.0f\n\n", 
            houstonStore.appleSales, houstonStore.applePrice, houstonStore.orangeSales, houstonStore.orangePrice, houstonStore.grossRevenue(), target1, houstonStore.appleRevenueTarget(target1), target2, houstonStore.orangeRevenueTarget(target2));
        
        System.out.printf("SEATTLE STORE\nApples Sold - %d\nApple Retail Cost - $%.2f\n\nOranges Sold - %d\nOrange Retail Cost - $%.2f\n\nGross Revenue: $%.2f\n\nTarget $%.2f of apples sales: %,.0f\nTarget $%.2f of oranges sales: %,.0f\n\n", 
            seattleStore.appleSales, seattleStore.applePrice, seattleStore.orangeSales, seattleStore.orangePrice, seattleStore.grossRevenue(), target1, seattleStore.appleRevenueTarget(target1), target2, seattleStore.orangeRevenueTarget(target2));
        
        System.out.printf("ORLANDO STORE\nApples Sold - %d\nApple Retail Cost - $%.2f\n\nOranges Sold - %d\nOrange Retail Cost - $%.2f\n\nGross Revenue: $%.2f\n\nTarget $%.2f of apples sales: %,.0f\nTarget $%.2f of oranges sales: %,.0f\n\n", 
            orlandoStore.appleSales, orlandoStore.applePrice, orlandoStore.orangeSales, orlandoStore.orangePrice, orlandoStore.grossRevenue(), target1, orlandoStore.appleRevenueTarget(target1), target2, orlandoStore.orangeRevenueTarget(target2));
    }
}

class groceryStore {
    int appleSales;
    double applePrice;
    int orangeSales;
    double orangePrice;
    
    double grossRevenue() {
        return (appleSales * applePrice) + (orangeSales * orangePrice);
    }
    
    double appleRevenueTarget(double appleTarget) {
        double applesToSell = appleTarget / applePrice;
        return applesToSell;
    }
    
    double orangeRevenueTarget(double orangeTarget) {
        double orangesToSell = orangeTarget / orangePrice;
        return orangesToSell;
    }
    
}
