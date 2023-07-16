package ch7;
/*
  Instanceof 연산자 사용예제
 */

public class InstanceofTest {

  public static void main(String[] args) {

    FireEngine fe = new FireEngine();

    if (fe instanceof FireEngine) {
      System.out.println("FireEngine 이다.");
    }

    if (fe instanceof Car) {
      System.out.println("Car 이다.");
    }

    if (fe instanceof Object) {
      System.out.println("Object 이다.");
    }
    System.out.println(fe.getClass().getName());

  }

}
