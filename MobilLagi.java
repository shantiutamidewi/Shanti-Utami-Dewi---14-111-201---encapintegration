package Mobil;

public class MobilLagi {
    String merkMobil;
    protected String tipeMobil;
    private int kmMobil;

void setmerkMobil(String saya){
    this.merkMobil=saya;
}
void settipeMobil(String pacar){
    this.tipeMobil=pacar;
}
void setkmMobil(int lama){
    this.kmMobil=lama;
}
String getmerkMobil(){
    return merkMobil;
}
String gettipeMobil(){
    return tipeMobil;
}
int getkmMobil(){
    return kmMobil;
}  
}