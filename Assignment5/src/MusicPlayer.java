/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shrajnashetty
 */
public class MusicPlayer {

    public static void main(String[] args) {
        FilePlayer filePlayer = new FilePlayer();

        Thread thread1 = new Thread(() -> {
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/do.wav");
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/mi.wav");
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/sol.wav");
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/si.wav");
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/do-octave.wav");
        });

        Thread thread2 = new Thread(() -> {
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/re.wav");
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/fa.wav");
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/la.wav");
            filePlayer.play("/Users/shrajnashetty/NetBeansProjects/Assignment5/src/do-octave.wav");
        });

        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish before exiting
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

