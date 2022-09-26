import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] str = (url.substring(url.lastIndexOf("?") + 1)).split("&");
        for(int i = 0; i < str.length; i++ ) {
            if (str[i].contains("=")) {
                System.out.print((str[i].substring(0, str[i].lastIndexOf("="))) + " ");
            } else {
                System.out.println(str[i]);
            }
        }
        System.out.println();
        for(int i = 0; i < str.length; i++ ) {
            try {
                if( str[i].contains("obj=")) {

                    alert(Double.parseDouble(str[i].substring(str[i].indexOf("=") + 1)));
                }
            }catch(NumberFormatException exep){
                alert(str[i].substring(str[i].indexOf("=") + 1));
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

