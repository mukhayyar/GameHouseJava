package module;

import javax.swing.JFrame;

public class FrameNavigator {
    
    public JFrame currentFrame;
    public JFrame previousFrame;
    
    public FrameNavigator() {
        
    }

    public static void closeFrame(JFrame currentFrame) {
        currentFrame.dispose();
    }
    
    public static void switchToFrame(JFrame currentFrame, JFrame nextFrame) {
        nextFrame.setVisible(true);
        currentFrame.setVisible(false);    
    }
    
}
