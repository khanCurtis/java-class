/******************************************************************************

3grocStore
Khanon Curtis
4/21/25

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
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
        
        System.out.printf("HOUSTON STORE\nApples Sold - %d\nApple Retail Cost - $%.2f\n\nOranges Sold - %d\nOrange Retail Cost - $%.2f\n\nGross Revenue: $%.2f\n\n", 
            houstonStore.appleSales, houstonStore.applePrice, houstonStore.orangeSales, houstonStore.orangePrice, houstonStore.grossRevenue());
        
        System.out.printf("SEATTLE STORE\nApples Sold - %d\nApple Retail Cost - $%.2f\n\nOranges Sold - %d\nOrange Retail Cost - $%.2f\n\nGross Revenue: $%.2f\n\n", 
            seattleStore.appleSales, seattleStore.applePrice, seattleStore.orangeSales, seattleStore.orangePrice, seattleStore.grossRevenue());
        
        System.out.printf("ORLANDO STORE\nApples Sold - %d\nApple Retail Cost - $%.2f\n\nOranges Sold - %d\nOrange Retail Cost - $%.2f\n\nGross Revenue: $%.2f\n\n", 
            orlandoStore.appleSales, orlandoStore.applePrice, orlandoStore.orangeSales, orlandoStore.orangePrice, orlandoStore.grossRevenue());
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
}
