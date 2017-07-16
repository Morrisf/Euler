/**
 * Created by MorrisPC on 5/28/2017.
 */
public class Euler7 {
    public static int calculate(){
        int count = 0;
        int x = 1;
        int prime = 0;
        while(count < 10001){
            x ++;
            if(isPrime(x)){
                count++;
                prime = x;
            }

        }
        return prime;
    }
    public static boolean isPrime(long x){
        double sqrt = Math.abs(Math.sqrt(x));
        for(long i = 2; i <= sqrt; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
