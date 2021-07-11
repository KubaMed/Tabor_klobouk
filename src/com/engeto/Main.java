package com.engeto;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

public class Main {

    JFrame window;
    Container con;
    JPanel buttonPannel;
    JButton havButton;
    JButton zmiButton5;
    JButton nebButton5;
    JButton mrzButton4;
    JButton mrzButton5;


    ButtonHandlerNeb bHandlerNeb = new ButtonHandlerNeb();
    ButtonHandlerHav bHandlerHav = new ButtonHandlerHav();
    ButtonHandlerZmi bHandlerZmi = new ButtonHandlerZmi();
    ButtonHandlerMrz bHandlerMrz = new ButtonHandlerMrz();
    ButtonHandlerIntro bHandlerIntro = new ButtonHandlerIntro();


    String introClip = "./res/UvodniSlovo.wav";
    String havrasparClip1 = "./res/Havraspar1.wav";
    String havrasparClip2 = "./res/Havraspar2.wav";
    String havrasparClip3 = "./res/Havraspar3.wav";
    String havrasparClip4 = "./res/Havraspar4.wav";
    String havrasparClip5 = "./res/Havraspar5.wav";


    String MrzimorClip1 = "./res/Mrzimor1.wav";
    String MrzimorClip2 = "./res/Mrzimor2.wav";
    String MrzimorClip3 = "./res/Mrzimor3.wav";
    String MrzimorClip4 = "./res/Mrzimor4.wav";
    String MrzimorClip5 = "./res/Mrzimor5.wav";


    String NebelvirClip1 = "./res/Nebelvir1.wav";
    String NebelvirClip2 = "./res/Nebelvir2.wav";
    String NebelvirClip3 = "./res/Nebelvir3.wav";
    String NebelvirClip4 = "./res/Nebelvir4.wav";
    String NebelvirClip5 = "./res/Nebelvir5.wav";


    String ZmijozelClip1 = "./res/Zmijozel1.wav";
    String ZmijozelClip2 = "./res/Zmijozel2.wav";
    String ZmijozelClip3 = "./res/Zmijozel3.wav";
    String ZmijozelClip4 = "./res/Zmijozel4.wav";
    String ZmijozelClip5 = "./res/Zmijozel5.wav";


    SoundEffect se = new SoundEffect();


    public static void main(String[] args) {


        new Main();

    }

    public Main(){
        window = new JFrame();
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        con = window.getContentPane();
        window.setVisible(true);

    buttonPannel = new JPanel();
    buttonPannel.setBounds(0, 0, 400, 400);
    buttonPannel.setBackground(Color.blue);

    con.add(buttonPannel);


    mrzButton4 = new JButton("Uvodni Slovo");
    mrzButton4.setFocusPainted(false);
    mrzButton4.addActionListener(bHandlerIntro);
    buttonPannel.add(mrzButton4);


    havButton = new JButton("Havraspar random");
    havButton.setFocusPainted(false);
    havButton.addActionListener(bHandlerHav);
    buttonPannel.add(havButton);


    buttonPannel.add(havButton);


    nebButton5 = new JButton("Nebelvir random");
    nebButton5.setFocusPainted(false);
    nebButton5.addActionListener(bHandlerNeb);
    buttonPannel.add(nebButton5);

    zmiButton5 = new JButton("Zmijozel random");
    zmiButton5.setFocusPainted(false);
    zmiButton5.addActionListener(bHandlerZmi);
    buttonPannel.add(zmiButton5);

    mrzButton5 = new JButton("Mrzimor random");
    mrzButton5.setFocusPainted(false);
    mrzButton5.addActionListener(bHandlerMrz);
    buttonPannel.add(mrzButton5);








    }

    public class SoundEffect{
        Clip myClip;

        public void setFile(String soundFileName){

            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                myClip = AudioSystem.getClip();
                myClip.open(sound);
            }
            catch (Exception e){
                System.out.println("něco je spatne fuck you");
            }



        }

        public void play(){

            myClip.setFramePosition(0);
            myClip.start();

        }


    }
    public class ButtonHandlerNeb implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int min = 1;
            int max = 4;

            Random random = new Random();

            int value = random.nextInt(max + min) + min;

            while(true){
                if (value == 1){
                    se.setFile(NebelvirClip1);
                    se.play();
                    break;
                }
                else if (value == 2){
                    se.setFile(NebelvirClip2);
                    se.play();
                    break;
                }
                else if (value == 3){
                    se.setFile(NebelvirClip3);
                    se.play();
                    break;
                }
                else if (value == 4){
                    se.setFile(NebelvirClip4);
                    se.play();
                    break;
                }
                else if (value == 5){
                    se.setFile(NebelvirClip5);
                    se.play();
                    break;
                }
                else{

                }

            }

        }

    }

    public class ButtonHandlerHav implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int min = 1;
            int max = 4;

            Random random = new Random();

            int value = random.nextInt(max + min) + min;

            while(true){
                if (value == 1){
                    se.setFile(havrasparClip1);
                    se.play();
                    break;
                }
                else if (value == 2){
                    se.setFile(havrasparClip2);
                    se.play();
                    break;
                }
                else if (value == 3){
                    se.setFile(havrasparClip3);
                    se.play();
                    break;
                }
                else if (value == 4){
                    se.setFile(havrasparClip4);
                    se.play();
                    break;
                }
                else if (value == 5){
                    se.setFile(havrasparClip5);
                    se.play();
                    break;
                }

            }

        }
        }



    public class ButtonHandlerZmi implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int min = 1;
            int max = 4;

            Random random = new Random();

            int value = random.nextInt(max + min) + min;

            while(true){
                if (value == 1){
                    se.setFile(ZmijozelClip1);
                    se.play();
                    break;
                }
                else if (value == 2){
                    se.setFile(ZmijozelClip2);
                    se.play();
                    break;
                }
                else if (value == 3){
                    se.setFile(ZmijozelClip3);
                    se.play();
                    break;
                }
                else if (value == 4){
                    se.setFile(ZmijozelClip4);
                    se.play();
                    break;
                }
                else if (value == 5){
                    se.setFile(ZmijozelClip5);
                    se.play();
                    break;
                }

            }
        }

    }

    public class ButtonHandlerMrz implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int min = 1;
            int max = 4;

            Random random = new Random();

            int value = random.nextInt(max + min) + min;

            while(true){
                if (value == 1){
                    se.setFile(MrzimorClip1);
                    se.play();
                    break;
                }
                else if (value == 2){
                    se.setFile(MrzimorClip2);
                    se.play();
                    break;
                }
                else if (value == 3){
                    se.setFile(MrzimorClip3);
                    se.play();
                    break;
                }
                else if (value == 4){
                    se.setFile(MrzimorClip4);
                    se.play();
                    break;
                }
                else if (value == 5){
                    se.setFile(MrzimorClip5);
                    se.play();
                    break;
                }

            }

        }

        }
    public class ButtonHandlerIntro implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            se.setFile(introClip);
            se.play();
        }
    }


    }

