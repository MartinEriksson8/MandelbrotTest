package mandelbrotparalell;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.awt.image.BufferedImage;


/**
 *
 * @author Martin Eriksson
 */
public class MandelbrotParalell {

    
    public static void main(String[] args) throws IOException {
        //input parameters for Mandelbrot genereation
        String parameters, temp;
        
        //Setting up sockets. This could probably be done by implementing some kind of class that creates the servers
        //on demand
        Scanner inputScan1 = new Scanner(System.in); 
        Socket socket1 = new Socket("127.0.0.1", 1341);
        Scanner inputScan2 = new Scanner(System.in); 
        Socket socket2 = new Socket("127.0.0.1", 1342);
        Scanner inputScan3 = new Scanner(System.in);
        Socket socket3 = new Socket("127.0.0.1", 1343);
        Scanner inputScan4 = new Scanner(System.in); 
        Socket socket4 = new Socket("127.0.0.1", 1344);
        
        //getting arguments from user input
        Scanner socketScan = new Scanner(socket1.getInputStream());
        System.out.println("Enter parameters separated by commas");
        parameters = inputScan.next();
        
        //getting output from sockets
        PrintStream mandelOutput = new PrintStream(socket1.getOutputStream());
        
        //we need a way to join our x separate images into one complete image,
        //this method would need to look at how many images we've got, and join those images together
        //either where there is blank space, or if we can refine the mandelbrot method to trim images from blank spaces
       
     
    }
    
}
