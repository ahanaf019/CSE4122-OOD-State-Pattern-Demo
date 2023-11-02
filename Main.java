public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.insertMoney();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
    }
}
