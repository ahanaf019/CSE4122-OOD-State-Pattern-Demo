public class SelectItemState implements State {

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money is already inserted. Please select an item.");
    }


    @Override
    public void selectItem(VendingMachine vendingMachine) {
        if(vendingMachine.getProductCount() <= 0) {
            System.out.println("Vending machine is out of stock. Returning money. . .");
            vendingMachine.setState(new OutOfStockState());
            return;
        }

        System.out.println("Item selected. Going into Dispense Item State");
        vendingMachine.setState(new DispenseItemState());
    }


    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("You need to select an item first.");
    }
    
}
