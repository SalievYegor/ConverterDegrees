/**
 * Created by Halvasan on 11.10.2017.
 */
public class Converter {

    private double C;
    private double K;
    private double F;

    public Converter(double value, String degree){

        switch (degree){
            case "C":
                celsiusConv(value);
                break;
            case "K":
                kelvinConv(value);
                break;
            case "F":
                fahrenheitConv(value);
                break;
            default:
                System.out.println("Please enter right value of degree like example");
                break;
        }
    }

    private void celsiusConv(double value){
        C = value;
        F = (9.0/5.0)* C + 32;
        K = C +273;
    }

    private void fahrenheitConv(double value) {
        F = value;
        C = (5.0/9.0)*(F - 32);
        K = (F + 459.67) * 5/9;
    }

    private void kelvinConv(double value) {
        K = value;
        F = K * 9/5 - 459.67;
        C = K - 273;
    }

}
