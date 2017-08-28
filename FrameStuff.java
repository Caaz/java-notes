import javax.swing.*;
import java.awt.*;
class FrameStuff {
  public static void main(String[] args) {
    JFrame frame = new JFrame("FrameDemo");

    //2. Optional: What happens when the frame closes?
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //3. Create components and put them in the frame.
    //...create emptyLabel...
    // frame.getContentPane().add(BorderLayout.CENTER);

    //4. Size the frame.
    frame.pack();

    //5. Show it.
    frame.setVisible(true);
  }
}