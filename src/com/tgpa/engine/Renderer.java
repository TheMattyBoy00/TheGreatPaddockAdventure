package com.tgpa.engine;

import java.awt.image.DataBufferInt;
import java.util.Random;

public class Renderer {

    private int pixelWidth, pixelHeight;
    private int[] pixel;
    private Random rand;

    public Renderer(Container gc) {

    	this.rand = new Random();
        pixelWidth = gc.getWidth();
        pixelHeight = gc.getHeight();
        pixel = ((DataBufferInt)(gc.getWindow().getImage().getRaster().getDataBuffer())).getData();

    }

    public void clear() {
    	emil();
    }
    
    private void emil() {
    	for(int i = 0; i < pixel.length; i++) {
            pixel[i] += i;
        }
    }
    
    private void organic() {
    	for(int i = 0; i < pixel.length; i++) {
            pixel[i] += this.rand.nextFloat() * 10;
        }
    }
    
    private void organicEmil() {
    	for(int i = 0; i < pixel.length; i++) {
            pixel[i] += this.rand.nextFloat() * i;
        }
    }
    
    private void galaxy() {
    	try {
    		pixel[(int)(this.rand.nextGaussian() * pixel.length / 10) + pixel.length / 2] = 16777215;
    	} catch(ArrayIndexOutOfBoundsException e) {}
    }
}