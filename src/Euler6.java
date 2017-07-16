
public class Euler6 {
    public static long calculate(){
        long sumSquare = 0;
        long squareSumTemp = 0;
        for(int i = 1; i <= 100; i++){
            sumSquare += (i*i);
        }
        for(int u = 1; u <= 100; u++){
            squareSumTemp += u;
        }
        long squareSum = (squareSumTemp*squareSumTemp);
        long result = squareSum - sumSquare;
        return result;
    }

}
