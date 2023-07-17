package ch7;
/*
  Outer 및 Inner class 의 instance 변수를 this 참조변수를 이용하여 사용해보는 예제
 */

class Outer3{
  //Outer class의 instance 변수
  int value =10;

  //Inner class
  class Inner{
    //instance변수
    int value =20;

    //instance 메소드
    void method1(){
      //지역변수
      int value =30;

      System.out.println("value : " +value);//지역변수
      System.out.println("this.value :" +this.value);//inner class의 범위
      System.out.println("Outer3.this.value :" + Outer3.this.value);//outer3의 value값
    }
  }

}



public class InnerEx5 {

  public static void main(String[] args) {
    Outer3 outer = new Outer3();
    Outer3.Inner inner = outer.new Inner();  //???????????????????????????????????????
    inner.method1();
  }
}
