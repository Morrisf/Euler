/**
 * Created by MorrisPC on 5/27/2017.
 */

public class Euler3 {
    public static long calculate(){
        long sub = 600851475143L;
        long longest = 0;
        for(long i = 10000; i > 2; i--){
            if(sub % i == 0){
                if(isPrime(i)){
                        longest = i;
                        break;
                }
            }
        }
        return longest;
    }

    public static boolean isPrime(long x){
        double sqrt = Math.abs(Math.sqrt(x));
        for(long i = 2; i < sqrt; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
 }
