import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class FafaAndGates //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here

        int n = nextInt();
        String s = next();

        int x = 0, y = 0, coin = 0;

        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'R'){
                x++;
            }else{
                y++;
            }
            if(s.charAt(i) == s.charAt(i+1) && y == x){
                coin++;
            }
        }
        



        out.println(coin); // print out ans;
        out.close();
        //System.exit(0);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()){ st = new StringTokenizer(in.readLine());
        return st.nextToken();}
        return null;
    }

    // read input as integer
    static int nextInt() throws IOException {return Integer.parseInt(next());}

    // read input as long
    static long nextLong() throws IOException {return Long.parseLong(next());}

    // read input as double
    static double nextDouble() throws IOException {return Double.parseDouble(next());}
}