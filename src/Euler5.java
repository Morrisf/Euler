/**
 * Created by MorrisPC on 5/27/2017.
 */
public class Euler5 {
    public static int calculate(){
        int x = 0;
        int last;
        while(true){
            x += 1;
            if(divChecker(x)){
                last = x;
                break;
            }

        }
    return last;
    }

    public static boolean divChecker(int x){
        int count = 0;
        boolean divisible = true;
        for(int i = 1; i < 21; i++){
            if(x % i == 0){
               count++;
            }
            else divisible = false;
        }
        if(count == 20) {
        divisible = true;
        }
        return divisible;
    }
}
