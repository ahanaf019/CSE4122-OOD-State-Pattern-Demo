public class IdleState implements State {

    @Override
    public void insertMoney(VendingMachine vendingMachine) {

        if(vendingMachine.getProductCount() <= 0) {
            System.out.println("Vending machine is out of stock. Returning money. . .");
            vendingMachine.setState(new OutOfStockState());
            return;
        }

        System.out.println("Money Inserted. Please Select the product. Going into Select Item State.");
        vendingMachine.setState(new SelectItemState());
    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Moeny needs to be inserted first");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Money needs to be inserted first");
    }
    
}
