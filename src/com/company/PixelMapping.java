package com.company;

public class PixelMapping {

    int R;
    int G;
    int B;
    int Radius;

    int circleMapping(int r, int g, int b){

        return Radius;
    }

    public PixelMapping(int r, int g, int b){
         R = r;
         G = g;
         B = b;

    }


    public PixelMapping setPixelSlider(){
         return this;
    }

    public PixelMapping setRGB(){
        return this;
    }

    public PixelMapping increaseRGB(){
        return this;
    }

    public int[] giveThat(){
        return new int[]{this.R, this.G, this.B};
    }

}
