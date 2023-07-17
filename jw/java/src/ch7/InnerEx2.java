package ch7;

/*
  Outer class(맴버(인스턴스)메서드, 클레스(static)매서드) 에서
  Innerclass(맴버클레스, static class , 로컬클레스) 사용=접근 에대한 예제
 */

public class InnerEx2 {//이부분이 outer class이고 이 안에-> 맴버변수만들기

  //inner class :instance class => 맴버변수처럼 접근해야한다
  class InstanceInner{}

  //inner class :Static class => 클레스변수처럼 접근해야한다
  static class StaticInner{}




  /*
  iv, cv, cv2 => Outer class level의 참조변수 이다
   */
  //outer class의 InstanceInner type의 인스턴스변수
  InstanceInner iv = new InstanceInner();

  //outer class의 StaticInner type의 인스턴스변수
  StaticInner cv = new StaticInner();

  //outer class의 StaticInner type의 static 변수
  static StaticInner cv2 = new StaticInner();




  /*
    Outer class의 Method Level의 참조변수
  */
  //outer class의 static메소드//static메소드라는 걸주의!!
  static void staticMethod(){
    //InstanceInner obj1 = new InstanceInner(); => InstanceInner는 outer클레스가 가지고있어서 바로 못만듬
    //즉, 메소드 내부에서 InstanceInner class객체를 만들수 없다->outer클레스의 객체를 먼저 만든후
    //InstanceInner class 의 객체를 생성해야함
    //따라서, InstanceInner class 는 outer클레스의 객체를 먼저 생성해야한다

    //InnerEx2 의 객체를 생성해야 사용가능함
    InnerEx2 outer = new InnerEx2();
    InstanceInner obj2 = outer.new InstanceInner();

    StaticInner obj3 = new StaticInner(); // 얘는 static inner class라서 객체생성해서 사용가능
  }



  //outer class의 instance메소드
  void instanceMethod(){
    InstanceInner obj1 = new InstanceInner();
    StaticInner obj3 = new StaticInner();

  }

  //지역클레스를 위한 메소드
  void myMethod2(){
    //local class : intstance class
    class LocalInner{}
    LocalInner Iv = new LocalInner();
  }





  //지역클레스를 위한 메소드
  void myMethod(){
  }



  public static void main(String[] args) {

  }

}//outer class
