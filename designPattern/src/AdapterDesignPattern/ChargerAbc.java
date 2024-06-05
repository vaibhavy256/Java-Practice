package AdapterDesignPattern;

public class ChargerAbc implements AndroidCharger{
    @Override
    public void chargerAndroidPhone() {
        System.out.println( "Iphone is charging");
    }
}
