package lsp;

public class ElectricalDuck extends DuckImpl {

    private boolean isPowerOn;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void turnPowerOn() {
        isPowerOn = true;
    }


    @Override
    public void swim() {
        if (!this.isPowerOn()) {
            throw new UnsupportedOperationException("The electrical duck is off");
        } else {
            System.out.println("The electrical duck is swimming");
        }
    }
}
