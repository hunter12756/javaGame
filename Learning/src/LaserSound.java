import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;



public class LaserSound {


    public LaserSound(){
        try{
            File effect = new File("src/laser2.wav");
            AudioInputStream input = AudioSystem.getAudioInputStream(effect);

            Clip soundClip = AudioSystem.getClip();

            soundClip.open(input);
            soundClip.start();
        }
        //catches errors
        catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

        }
        public static void main(String[] args){
        new LaserSound();
        }
    }

