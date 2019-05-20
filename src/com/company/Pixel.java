package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Pixel {

    BufferedImage image;
     int width;
     int height;

    public Pixel() throws IOException {
        super();
        File file = new File("C:/Users/ASUS/Desktop/pictures/IMG_20190203_173240.jpg");
        image = ImageIO.read(file);
        width = image.getWidth();
        height = image.getHeight();


        File fileUp = new File("C:/Users/ASUS/Desktop/pictures/img.ser");
                File fileRead = new File("C:/Users/ASUS/Desktop/img.wt");

        FileOutputStream fout = new FileOutputStream(fileUp);
        ObjectOutputStream ou = new ObjectOutputStream(fout);


        FileInputStream fin=new FileInputStream(fileRead);
        int m=0;
        while((m=fin.read())!=-1){
           ou.write(m);
        }

        fin.close();
        for(int i=0; i < height; i++){
            for(int j=0; j < width; j++){
                Color c = new Color(image.getRGB(j, i));
                int red = (int)(c.getRed() * 0.291);
                int green = (int)(c.getGreen() * 0.588);
                int blue = (int)(c.getBlue() *0.115);
                Color newColor = new Color(red+green+blue,

                        red+green+blue,red+green+blue);

                image.setRGB(j,i,newColor.getRGB());
            }
        }

        File out = new File("C:/Users/ASUS/Desktop/pictures/imageAgain.jpg");
        ImageIO.write(image, "jpg", out);

        System.out.println(c(-10));

    }


    public Pixel(int c){

    }


    public  Pixel(int iC, int fC){

    }

    static {
         int c;
         int iC;
         int fC;
    }

private void evaluateRgb(int iR, int iG, int iB, int fR, int fG, int fB){


}

//C = R,G,B
    //i = initial
    //f = final

private int c(int iC){
        int d = 0;
        if(iC < 0){
            d = 0 - iC;
            iC = iC + d;
        }

        if (iC > 255){
            d = iC - 255;
            iC = iC - d;
        }

        return iC;
}



}
