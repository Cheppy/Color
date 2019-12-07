
package pgdp.color;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Vorgegebene Klasse, hier drin wird nichts bewertet !!! &lt;p&gt;
 * Veränderungen werden nicht gewertet.
 */

public class DisplayColor {

  // Zum Testen auskommentieren

  public static void displayColor(RgbColor8Bit c) {
    JFrame jf = new JFrame("Farbtest") {

      @Override
      public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(c.getRed(), c.getGreen(), c.getBlue()));
        g.fillRect(0, 0, getWidth(), getHeight());
      }
    };
    jf.setLocation(300, 300);
    jf.setSize(400, 350);
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jf.setVisible(true);
  }

  public static void main(String[] args) { // Hier eigene Farben ausprobieren
    RgbColor rgbColor = new RgbColor(2, 3, 0, 0);
    RgbColor rgbColor1 = new RgbColor (3, 0b011, 0b000, 0b001);
    RgbColor rgbColor2 = new RgbColor(10, 0b00_1111_1111, 0b00_0000_0000, 0b00_1010_0001);

    displayColor(rgbColor.toRgbColor8Bit());
    displayColor(rgbColor1.toRgbColor8Bit());
    displayColor(rgbColor2.toRgbColor8Bit());
  }

}
