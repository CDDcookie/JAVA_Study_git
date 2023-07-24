package studyJava2;

public class Tv {
  private String color;
  private boolean power;
  private int channel;


  static int aa = 10;


//  public Tv() {
//  }
//
//  public Tv(String color, boolean power) {
//    this.color = color;
//    this.power = power;
//  }

  public Tv(String color, boolean power, int channel) {
    this.color = color;
    this.power = power;
    this.channel = channel;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }

  public int getChannel() {
    boolean power1 = power;

    int aa1 = this.aa;

    return channel;
  }

  static void test() {
//    String color1 = this.color;
    int aa1 = aa;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }
}
