package com.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int rodNum;
    public static int listNum; //states the current point in the rod.
    private JButton b1;
    private JPanel window;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton runButton;
    private JTextField delayInput;
    private JButton backwards;
    private JButton forward;
    private static Rod r;// for making a temoporary rod
    private static List rod = new ArrayList <Rod> (); //stores all the objects of Rod

    public static void main(String[] args) {

        String tempnum = JOptionPane.showInputDialog(null,
                "how many rod?",
                "how many rod?",
                JOptionPane.QUESTION_MESSAGE);

        rodNum = Integer.parseInt(tempnum);

        System.out.println(rodNum);
        r = new Rod();

        for(int i = 0; i < rodNum; i ++){
            System.out.println("settting:" + i);
            r.setRod(false, i);
        }

        rod.add(new Rod());



        JFrame frame = new JFrame();
        frame.setContentPane(new Main().window);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);









    }

    public Main()
    {
        setAllButtons();
        listNum = 0;
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b1.setText(r.flipRod(0));


            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b2.setText(r.flipRod(1));


            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b3.setText(r.flipRod(2));

            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b4.setText(r.flipRod(3));

            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b5.setText(r.flipRod(4));


            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b6.setText(r.flipRod(5));

            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            b7.setText(r.flipRod(6));

            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b8.setText(r.flipRod(7));

            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b9.setText(r.flipRod(8));

            }
        });

        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b10.setText(r.flipRod(9));


            }
        });

        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b11.setText(r.flipRod(10));

            }
        });

        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b12.setText(r.flipRod(11));

            }
        });

        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b13.setText(r.flipRod(12));

            }
        });

        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                b14.setText(r.flipRod(13));

            }
        });

        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                r.getShit();
            }




            }
        });

        forward.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                System.out.println("Rod.set" +listNum + " "  + rod.size());
                rod.set(listNum, new Rod(r));



                if(listNum == rod.size() - 1){

                    System.out.println("creating new rod");

                    //System.out.println("Rod is at the end");
                    rod.add(new Rod(r));
                    //System.out.println("adding to rod");
                    listNum ++;

                    //System.out.println("setting Rod");



                }else{

                    System.out.println("Array already created");

                    listNum ++;
                    r = new Rod((Rod) rod.get(listNum));

                }

                setAllButtons();


            }
        });

        backwards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //System.out.println("Rod.set" +listNum + " "  + rod.size());
                rod.set(listNum, new Rod (r));


                try {

                    listNum--;
                    //System.out.println("going down");
                    r = new Rod((Rod) rod.get(listNum));
                    System.out.println("Settin");
                    setAllButtons();

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"U probably are at the beginning","U haz problem",1);
                    listNum ++;

                }
                //System.out.println(listNum);

            }
        });




    private String buttonText(int x){


        try {

            String wrd;

            if (r.get1Rod(x)) {
                wrd = "ON";
            } else
                wrd = "OFF";

            return (x + 1) + ": " + wrd;
        } catch (Exception e) {
            //int tempRand = Math.random() * 3;
            return "NOT A ROD";
        }

    }

    private void setAllButtons(){

        System.out.println("setting all the buttons");

        b1.setText(buttonText(0));
        b2.setText(buttonText(1));
        b3.setText(buttonText(2));
        b4.setText(buttonText(3));
        b5.setText(buttonText(4));
        b6.setText(buttonText(5));
        b7.setText(buttonText(6));
        b8.setText(buttonText(7));
        b9.setText(buttonText(8));
        b10.setText(buttonText(9));
        b11.setText(buttonText(10));
        b12.setText(buttonText(11));
        b13.setText(buttonText(12));
        b14.setText(buttonText(13));

    }


}

