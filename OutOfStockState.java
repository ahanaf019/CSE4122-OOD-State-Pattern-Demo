public class OutOfStockState implements State {

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Sorry, The machine is out of stock. Returning money. . .");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Sorry, The machine is out of stock. Returning money. . .");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Sorry, The machine is out of stock. Returning money. . .");
    }
    
}
