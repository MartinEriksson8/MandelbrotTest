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
public class Server3 {
    
    public static void main(String args[]) throws IOException
    {
        String parameters;
        //setting up new connections
        ServerSocket socket3 = new ServerSocket(1343);
        Socket serSocket3 = socket3.accept();
        
        //taking parameters sent from client
        Scanner scanner = new Scanner(serSocket3.getInputStream());
        parameters = scanner.next();
        
        //using parameters sent from client to perform part of mandelbrot set
        Mandelbrot(parameters);
        
        PrintStream print = new PrintStream(serSocket3.getOutputStream());
        print.println(parameters);
        
    }
}
