/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandelbrotparalell;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Martin
 */
public class Mandelbrot {
    
    public static void main(String[] args) throws Exception {
        //we need to know how many parts we divided the image too, and which one of those parts we're dealing with right now
        //don't know how to implement it, but some sort of array creeated with the user input division should do it
        picDivBy[i];
        //set width, hight and max iterations.
        int width = 1000, height = 1000, max = 100 userInputInt = picDivBy[i];
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        int black = 0;
        //array to store color values
        int[] colors = new int[max];
        //filling array with different hues
        for (int i = 0; i<max; i++) {
            colors[i] = Color.HSBtoRGB(i/256f, 1, i/4f);
        }
        
        //we need to set the starting place of the division according to how many times we divided the picture, example if this is the
        //2nd division and the grid is 1000x1000 we need to start at the 250th pixel
        if(picDivBy[i] <1)
        {
            int row = 0
        }
        else int row = (height/picDivBy.length) * userInputInt;
        
        //Iterate trough pixels in width/height       
        for (int row; row < (height/userInputInt); row++) 
        {
            for (int col = 0; col < width; col++) 
            {
                
                //getting real and imaginary numbers from the field
                double c_re = (col - width/2)*4.0/width;
                double c_im = (row - height/2)*4.0/width;
                double x = 0, y = 0;
                int iteration = 0;
                
                //while this condition is met we know it doesnt diverge and we can continue iterating
                while (x*x+y*y < 4 && iteration < max) 
                {
                    double x_new = x*x-y*y+c_re;
                    y = 2*x*y+c_im;
                    x = x_new;
                    iteration++;
                } 
                
                //if iteration is not part of the set, color pixel depending on iteration
                if (iteration < max) image.setRGB(col, row, colors[iteration]);
                
                //if iteration is part of the set color pixel black
                else image.setRGB(col, row, black);
            }
        }

        ImageIO.write(image, "png", new File("mandelbrot.png"));
    }
    }
}