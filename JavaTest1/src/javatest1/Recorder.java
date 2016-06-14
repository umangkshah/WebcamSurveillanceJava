/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest1;

import com.googlecode.javacv.FrameGrabber;
import com.googlecode.javacv.FrameRecorder;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.OpenCVFrameRecorder;
import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_core.CV_SVD;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Recorder extends Thread{
    FrameRecorder recorder1;
    OpenCVFrameGrabber grabber=null;
    
    String savePath;
    
    Recorder(String s)
    {          
        savePath = s;
    }
    
    public void run()
    { 
        try {
        recorder1 = new OpenCVFrameRecorder(savePath,640,480);
        recorder1.setCodecID(CV_SVD);
        
	recorder1.setFrameRate(15);
	recorder1.setPixelFormat(1);
        recorder1.start();
        
        while(true)
        {
         
            
                IplImage im = grabber.grab();
                if (im != null) {
                     recorder1.record(im);
                }
              // Thread.sleep(1);            
   
        }
        }
        catch (Exception e)
            { e.printStackTrace(); }
            }
    
   protected void getGrabber(OpenCVFrameGrabber g)
   {
       grabber = g;
        try {
            grabber.start();
        } catch (FrameGrabber.Exception ex) {
            Logger.getLogger(Recorder.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   protected void endrec()
   {
        try {
            
            recorder1.stop();
            recorder1.release();
            //recorder1 = null;
            
            
        } catch (Exception ex) {
            System.out.println("Exception");
        }
   }
   
   
}
