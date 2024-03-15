package Week5;

public class Squared {

    public int num, squared;

    public int squareBF(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }

    public int squareDC(int a, int n) {
        if (n==0) {
            return 1;
        } else {
            if (n%2==1) //odd
                return (squareDC(a, n/2)*squareDC(a, n/2)*a);
            else //even
                return (squareDC(a, n/2)*squareDC(a, n/2));
        }
    }
}