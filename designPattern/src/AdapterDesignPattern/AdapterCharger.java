package AdapterDesignPattern;

public class AdapterCharger  implements  AppleCharger{

    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        androidCharger.chargerAndroidPhone();
        System.out.println( "Your phone is charging with adapter ");

    }
}
