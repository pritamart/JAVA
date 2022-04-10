
// Java program to illustrate max of three numbers using ternary operator.
import java.io.*;

public class Max_of_Three_Number {
    public static void main(String[] args) {
        int a = 4, b = 7, c = 9,result,minr;
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        minr = ((a<b) ? (a < c)? a: c: (b>c)?b:c);
        System.out.println("MAx is "+result);
        System.out.println("MIN is "+minr);

    }
}
