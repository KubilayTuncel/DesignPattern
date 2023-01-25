package BehavioralDP.ChainOfResponsibilityDP;

public abstract class Approver {

    //olay variable üzerinden dönüyor
    Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);
}
