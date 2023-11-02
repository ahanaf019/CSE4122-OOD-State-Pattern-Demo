public interface State {
    void insertMoney(VendingMachine vendingMachine);
    void selectItem(VendingMachine vendingMachine);
    void dispenseItem(VendingMachine vendingMachine);
}