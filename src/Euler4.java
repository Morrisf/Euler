/**
 * Created by MorrisPC on 5/27/2017.
 */
public class Euler4 {

    public static String calculate(){
        int count = 0;
        for(int i = 100; i <= 999; i++){
            for(int u = 100; u <= 999; u++){
                int x = u*i;

                StringBuilder xString = new StringBuilder(Integer.toString(x));
                if (xString.reverse().toString().equals(Integer.toString(x))){
                    if(x > count){
                        count = x;
                    }
                }
            }
        }
        return Integer.toString(count);
    }
}
