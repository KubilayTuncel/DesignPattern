package CreationalDP.ProtoTypeDP;

public class ProtoTypeDPDemo {

    public static void main(String[] args) {
        Soldier avaliableSoldier  = new Soldier(100,45,20,50,
                60,5,"Kilic",true);

        Soldier notAvaibleSodier1 = new Soldier(100,45,20,50,
                60,5,"Kilic",false);

        Soldier notAvaibleSodier2 =  avaliableSoldier.clone();
        notAvaibleSodier2.setAvailableForWar(false);

        System.out.println("****************************");

        System.out.println("notAvaibleSoldier1 icin cikti");
        notAvaibleSodier1.showSoldierInfo();
        System.out.println("*****************************");
        System.out.println("notAvaibleSoldier2 icin cikti");
        notAvaibleSodier2.showSoldierInfo();

    }
}
