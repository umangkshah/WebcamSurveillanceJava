/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest1;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core;

/**
 *
 * @author user
 */
public class VideoIn extends Thread{
    
OpenCVFrameGrabber grabber;
opencv_core.IplImage img;
CanvasFrame win;
String winname;
static int i=0;
    /**
     * Creates new form VideoIn
     */
    public VideoIn(OpenCVFrameGrabber g) {
        i++;
        winname = "Webcam In " + i;
        grabber = g;
        win = new CanvasFrame(winname);
    }

    public void run()
    {
         try 
       {
           while(true)
           {
           img = grabber.grab();
           if (img != null) {
                    //cvSaveImage("C:\\Users\\user\\Desktop\\capture.jpg", img);
                    //jLabel1.setIcon(new ImageIcon(img.getBufferedImage()));
                    win.showImage(img);
                }
                 //Thread.sleep(300);             
            }
       }
       catch(Exception exx){}
       
    }
}
