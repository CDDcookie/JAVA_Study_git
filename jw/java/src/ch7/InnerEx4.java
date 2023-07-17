package ch7;

import ch7.Outer.StaticInner;

/*
Outer 의 (instance, static, local class)이런 클레스들을 다른 클레스에서 사용
 */
class Outer {

  class InstanceInner {

    int iv = 100;
  }

  static class StaticInner {

    int iv = 200;
    static int cv = 300;
  }

  void myMethod() {
    class LocalInner {

      int iv = 500;
    }

  }

}


public class InnerEx4 {

  public static void main(String[] args) {

    //Outer class 의 객체를 먼저생성하기
    Outer oc = new Outer();

    //Outer 의 Instance Inner class
    Outer.InstanceInner ii = oc.new InstanceInner(); //객체생성했으니 사용해봐야지

    //Instance Inner class의 instance 변수
    System.out.println("ii.iv :" + ii.iv);
    //Static Inner class의 static 변수
    System.out.println("Outer.StaticInner.cv" + StaticInner.cv);

    //Outer.StaticInner.iv ->ERROR!!
    //Static Inner class의 instance 변수 => 객체 생성후 사용가능!
    Outer.StaticInner si = new Outer.StaticInner();
    System.out.println("si.iv : " +si.iv);


  }


}
