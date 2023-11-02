public class DispenseItemState implements State {

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money is already inserted. Returning money. . .");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Product is already selected. Please press \"Dispense\"");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        vendingMachine.updateProductCount();
        vendingMachine.setState(new IdleState());
        System.out.println("Item dispensed. Returning to Idle State.");
    }
    
}
