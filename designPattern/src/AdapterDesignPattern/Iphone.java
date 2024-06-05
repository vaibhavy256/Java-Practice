package AdapterDesignPattern;

public class Iphone {

    private AppleCharger appleCharger;

    public Iphone(AppleCharger charger) {
        this.appleCharger=charger;
    }

    public void chargeIphone(){
        appleCharger.chargePhone();
    }
}
