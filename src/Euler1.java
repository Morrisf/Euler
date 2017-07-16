/**
 * Created by MorrisPC on 5/27/2017.
 */
public class Euler1 {

   public static int calculate(){
        int count = 0;
        for(int i = 1; i < 1000; i++){
            if((i % 3 == 0) || (i % 5 == 0)){
                count += i;
            }
        }
        return count;
    }
}
