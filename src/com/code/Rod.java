package com.code;
import java.lang.*;
import java.util.ArrayList;

public class Rod implements Cloneable {

    boolean rod[];
    int delay;

    public Rod()
    {

        rod = new boolean[Main.rodNum];
        System.out.println("creating Array with: " + Main.rodNum);
        //just to make it zero right now






    }

    public Rod(Rod copy){
        this.rod = copy.rod;
        this.delay = copy.delay;
        System.out.println("making copied Rod");

    }
    public String flipRod(int x){

        try {
            rod[x] = !rod[x];
            String word;

            if (rod[x]) {
                word = "ON";
            } else
                word = "OFF";

            return (x + 1) + ": " + word;
        } catch (Exception e){
            //int tempRand = Math.random() * 3;
            return "NOT A ROD";
        }

    }

    public boolean get1Rod(int x){
        return rod[x];
    }

    public boolean[] getRod() {
        return rod;
    }


    public void setAll(boolean[] rod) {
        this.rod = rod;
    }

    public int getDelay() {

        return delay;
    }

    public void setRod(boolean x, int y) {
        rod[y] = x;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void getShit(){

        for(int i = 0; i > Main.rodNum; i++)  {
            System.out.println(rod[i]);
        }

    }

}
