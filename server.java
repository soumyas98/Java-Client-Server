import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server{
    public static void main(String[] args)throws Exception{
        int sum = 0;
        ServerSocket sc = new ServerSocket(9000);
        System.out.println("server socket started and waiting for client");
        Socket connection = sc.accept(); 
        System.out.println("connected to client"+ connection.getInetAddress().getHostAddress());
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        try {
            String line;
            do {
                try {
                    line = reader.readLine();
                    sum = Integer.parseInt(line) + sum;    
                } catch(Exception e){
                    System.out.println("client closed the connection");
                    break;
                }
            } while (line != null);
    }catch(Exception e){
        System.out.println("nothing to read from client");
    }
    System.out.println(sum);
  }
}