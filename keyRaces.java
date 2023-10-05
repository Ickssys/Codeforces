import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
// The two standard imports that cover most useful classes.
import java.util.*;
import java.io.*;

// import java.math.*; // BigInteger
public class KeyRaces //problem name here
{
    // These two classes are rather fast for input and output.
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    // throw an IOException here so there is no need to handle errors later
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // code here
        int s = nextInt(), v1 = nextInt(), v2 = nextInt(), t1 = nextInt(), t2 = nextInt();
        int time1 = (s * v1) + (t1 * 2);
        int time2 = (s * v2) + (t2 * 2);

        if(time1 < time2){
            out.println("First");
        }else if(time2 < time1){
            out.println("Second");
        }else{
            out.println("Friendship");
        }


        // out.println(); // print out ans;
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