package BehavioralDP.ChainOfResponsibilityDP;

public class GenelMüdür extends Approver{


    public GenelMüdür() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {

            System.out.println("Genel Müdür onayladi.");
            System.out.println("***************");

        return true;
    }
}
