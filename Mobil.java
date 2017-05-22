package Mobil;

public class Mobil {
    
    public static void main(String[] args) {
        MobilLagi Mobil = new MobilLagi();
       
        MobilKU.setmerkMobil("Toyota");
        MobilKU.settipeMobil("Mini Bus");
        MobilKU.setKmMobil(2000);
        System.out.println("nama saya : "+MobilKU.getmerkMobil());
        System.out.println("nama pacar : "+MobilKU.gettipeMobil());
        System.out.println("lama jadian : "+MobilKU.getKmMobil()+" tahun");
              
    }

}