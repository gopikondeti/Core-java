import java.lang.*;
import java.io.*;
import java.math.*;
class Main
{
    public static void main(String args[])throws IOException 
    {
        InputStreamReader I=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(I);
        int r;
        double Ci,a;
        System.out.print("enter radius..:");
        r=Integer.parseInt(br.readLine());
        Ci=2*Math.PI*r;
        System.out.println("circumfernce of circle="+Ci);
        a=Math.PI*r*r;
        System.out.println("area of circle="+a);
    }
    
}	