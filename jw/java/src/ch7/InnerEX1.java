package ch7;

public class InnerEX1 {

  //인스턴스 맴버 변수처럼 사용하는 클레스
  class InstanceInner{
    int iv =100;//인스턴스변수
    //static int cv =100; //스택틱클레스에서 만씋수있어사 사용불가?????????? 인스턴스 변수라서
    final static int CONST = 100; //상수  //객체생성 안하기위해서
  }

  //ㅋ클레스 변수처럼 사용하는 클레스
  static class StaticInner{
    int iv =200;
    static int cv =200; //스테틱클레스에선 가능
  }

  //지역변수처럼 사용하는 클레스
  void myMethod(){
    class LocalInner{
      int iv=300;
      final static int CONST =120;
     // static  int cv =500; //클레스변수는 스테틱클레스에서만 사용간으하다
    }
  }

  public static void main(String[] args) {
    System.out.println(InstanceInner.CONST);
    System.out.println(StaticInner.cv);
  }
}//아웃터 클레스
