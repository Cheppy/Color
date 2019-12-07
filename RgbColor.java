package pgdp.color;

public class RgbColor {
  final int bitDepth;
  final int R, G, B;

  public RgbColor(int bitDepth, int red, int green, int blue) {
    this.bitDepth = Math.min(Math.max(1, bitDepth), 31);
    R = clampColorComponent(red);
    G = clampColorComponent(green);
    B = clampColorComponent(blue);
  }

  public RgbColor8Bit toRgbColor8Bit() {
    return new RgbColor8Bit(convertComponentTo8bit(R), convertComponentTo8bit(G), convertComponentTo8bit(B));
  }

   protected int clampColorComponent(int inputComponent) {
    return clamp(inputComponent, 0, getMaxRange());
  }

   int convertComponentTo8bit(int val) {
    long targetMax = (long) getMaxRange(8);
    long vl = (long) val * targetMax;
    long maxRange = (long) getMaxRange();
    return (int) (vl / maxRange);
  }


   protected int getMaxRange() {
    return getMaxRange(this.bitDepth);
  }

  static private int getMaxRange(int targetBitDepth) {
    return (int) (Math.pow(2l, (long) targetBitDepth) - 1l);
  }


  static private int clamp(int val, int min, int max) {
    return val < min ? min : val > max ? max : val;
  }

  public int getRed() {
    return R;
  }

  public int getGreen() {
    return G;
  }

  public int getBlue() {
    return B;
  }
}
