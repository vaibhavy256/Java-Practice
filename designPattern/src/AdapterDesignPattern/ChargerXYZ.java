package AdapterDesignPattern;

public class ChargerXYZ  implements  AppleCharger{
    @Override
    public void chargePhone() {
            System.out.println( "Iphone is charging");
    }
}
