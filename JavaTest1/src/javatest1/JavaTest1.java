/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest1;
import com.googlecode.javacv.FrameGrabber;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage; import static com.googlecode.javacv.cpp.opencv_highgui.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
/**
 *
 * @author user
 */
public class JavaTest1 {
    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            OpenCVFrameGrabber grabber1 = new OpenCVFrameGrabber(0);
            OpenCVFrameGrabber grabber2 = new OpenCVFrameGrabber(1);
            grabber1.start();
          grabber2.start();
            Front f = new Front(grabber1,grabber2);
            f.setVisible(true);
            
            VideoIn v = new VideoIn(grabber1);
          VideoIn v2 = new VideoIn(grabber2);
            Thread view = new Thread(v);
          Thread view2 = new Thread(v2);
            view.start();
           view2.start();
        } catch (Exception ex) {
            Logger.getLogger(JavaTest1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
