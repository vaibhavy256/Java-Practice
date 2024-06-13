package AdapterDesignPattern;

public class Main {
    public static void main(String args[]){
        AppleCharger charger=new AdapterCharger(new ChargerAbc());
        Iphone iphone13=new Iphone(charger);
        iphone13.chargeIphone();
    }


}
