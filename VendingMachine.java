public class VendingMachine {

    private int productCount;
    private State currentState;

    public VendingMachine(int productCount) {
        this.productCount = productCount;
        currentState = new IdleState();
    }

    public int getProductCount() {
        return productCount;
    }


    public void setState(State state) {
        currentState = state;
    }


    public State getState() {
        return currentState;
    }


    public void updateProductCount() {
        productCount -= 1;
    }

    public void insertMoney() {
        this.currentState.insertMoney(this);
    }

    public void selectItem() {
        this.currentState.selectItem(this);
    }

    public void dispenseItem() {
        this.currentState.dispenseItem(this);
    }

}



