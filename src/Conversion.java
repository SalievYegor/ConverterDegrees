import com.google.gson.Gson;
import java.util.Scanner;

/**
 * Created by Halvasan on 11.10.2017.
 */
public class Conversion {

    private String str;
    private String number = "";
    private String degree = "";

    void conversionDegrees() { //method for converting our results into JSON format
        reader();
        double value = Double.parseDouble(number);
        Converter converter = new Converter(value, degree);

        Gson gson = new Gson(); //using Gson lib
        String json = gson.toJson(converter);
        System.out.println(json);
    }

    void reader(){  //method for reading written initial conditions
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature format (20C, 240K, 79F): ");
        str = scan.next();
        splitValue();
    }

    void splitValue() {  //method for splitting string and int
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);

            if (Character.isDigit(a)) {
                number = number + a;
            } else {
                degree = degree + a;
            }
        }

    }

}
