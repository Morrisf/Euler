/**
 * Created by MorrisPC on 5/27/2017.
 */
public class Euler2 {
public static int calculate(){
    int c = 0;
    int count = 2;
    int a = 1;
    int b = 2;
    while(c < 4000000){
        c = a + b;
        if(c % 2 == 0){
            count += c;
        }
        a = b;
        b = c;
    }

    return count;
}

}
