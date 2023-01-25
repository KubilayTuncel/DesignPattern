package BehavioralDP.ChainOfResponsibilityDP;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        ChainOfResponsibility cor = new ChainOfResponsibility();
        cor.chainOfResponsibilityDemo();
    }

    void chainOfResponsibilityDemo() {
        Approver genelMüdür = new GenelMüdür();
        Approver müdür = new Müdür(genelMüdür);
        Approver memur = new Memur(müdür);

        System.out.println("Kredi verme Limitleri");
        System.out.println("Memur icin max : <100");
        System.out.println("Müdür icin max : <500");
        System.out.println("Genel Müdür icin sinir yok");
        System.out.println("**********************");
        System.out.println("istenen limit : 50");
        memur.approveLoan(50);
        System.out.println("istenen limit : 450");
        memur.approveLoan(450);
        System.out.println("istenen limit : 1050");
        memur.approveLoan(1050);

    }
}
