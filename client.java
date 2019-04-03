import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.io.*;

public class client{
    public static void main(String [] args) throws IOException{
        Socket sc = new Socket("localhost", 9000);  //establishes connection
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(sc.getOutputStream()));
        String str;
        String a, b;
        // System.out.println("enter a string");
        // str = br.readLine();
        System.out.println("enter two numbers");
        a = br.readLine();
        b = br.readLine();
        // writer.println(str);
        writer.println(a);
        writer.println(b);
        writer.flush();
        try{
            Thread.sleep(10000);  
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }  
    }
}