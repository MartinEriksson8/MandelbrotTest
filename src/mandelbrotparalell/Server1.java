package mandelbrotparalell;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Server1 {
    
    public static void main(String args[]) throws IOException
    {
        String parameters;
        //setting up new connections
        ServerSocket socket1 = new ServerSocket(1341);
        Socket serSocket1 = socket1.accept();
        
        //taking parameters sent from client
        Scanner scanner = new Scanner(serSocket1.getInputStream());
        parameters = scanner.next();
        
        //using parameters sent from client to perform part of mandelbrot set
        Mandelbrot(parameters);
        
        PrintStream print = new PrintStream(serSocket1.getOutputStream());
        print.println(parameters);
        
    }
}
