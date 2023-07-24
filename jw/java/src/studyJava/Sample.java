package studyJava;

class Calculator {
  int value;

  Calculator() {
    this.value = 0;
  }

  void add(int val) {
    this.value += val;
  }

  int getValue() {
    return this.value;
  }
}

class UpgradeCalculator extends Calculator{

//  int value;

  void minus(int val){
    this.value -= val;
    test();
  }

  private void test() {
    System.out.println("hello");
  }

  String aMethod5(String a){
    return a.toUpperCase();
  }

  static String aMethod(String a) {
    return a.toLowerCase();
  }


}

public class Sample {
  public static void main(String[] args) {
//    Calculator cal = new Calculator();
//    cal.add(10);
//
//    System.out.println(cal.getValue());  // 10 출력
//
//    UpgradeCalculator cal2 = new UpgradeCalculator();
//    cal2.add(10);
//    cal2.minus(3);
//    System.out.println(cal2.getValue());
//
//    String s = cal2.aMethod5("hello");

//    Sample sample =
//    test();

    String str = UpgradeCalculator.aMethod("HELLO");
//    cal2.aMethod5();

  }

  public void test() {
    System.out.println("hello");
  }
}