import java.util.Collections;

public class Strings {

    public static void main(String[] args) {
        
        //Java 8 will need to be used for this approach.
        for(int i = 1; i <= 5 ; i++){
            String period = String.join("", Collections.nCopies((5 - i), "."));
            String number = String.join("", Collections.nCopies(i, Integer.toString(i)));
            
            System.out.println(period + number);
        }
        
    }

}
