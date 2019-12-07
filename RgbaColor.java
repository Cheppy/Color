package pgdp.color;

public class RgbaColor extends RgbColor {
  final int A;

  public RgbaColor(int bitDepth, int red, int green, int blue, int alpha) {
    super( bitDepth,  red,  green,  blue);
    A = clampColorComponent(alpha);
  }

  public int getAlpha() {
    return A;
  }

  @Override
  public RgbColor8Bit toRgbColor8Bit() {
    if (A != getMaxRange()) {
      ExceptionUtil.unsupportedOperation("Couldn't convert rgba to 8 bit color since the alpha doesn't have the max value");
    }
    return super.toRgbColor8Bit();
  }

}
