package ch7; //p352

/*
  ---------------------------------------------------------------------------------------------
  [싱글톤 패턴]
  -객체를 바로 사용할수있는 상태로 함 => 자기자신의 객체를 static 맴버변수로 선언
  -자기자신의 객체는 맴버변수임으로 캡슐화 => 맴버변수를 외부에서 직접접근하지 못하도록 한다=>private 붙임
  -생성된 자기자신의 객체를 외부에서 접근할수 있도록함 => getter =>getInstance(),public,static
  -객체 생성을 한번만 하면된다
  -상속이랑 상관없이 자기자신만 있으면 된다
  -객체생성을 외부가 아니라 내부에서만 한다

  -자기자신(class)만 있으면 됨 => 상속이 불필요 =>final
  ---------------------------------------------------------------------------------------------
   */

final class Singleton { //상속을 하지 못하도록 제어

  private static Singleton s = new Singleton(); //객체를 바로 사용할수있는 상태

  private Singleton() {
  } //  -객체생성을 외부가 아니라 내부에서만 한다-> 접근제어자를 private으로/현제는 기본생성자
  //ㄴ>만일의 상황을 고려한 객체 생성을 위한 생성자

  public static Singleton getInstance() { //현제 자기자신의 객체가 클래스 맴버변수임으로, 메소드로 클래스 메소드로 만듬
    //ㄴ>언제든지 접근할수있겠금 public쓴다

    if (s == null) {
      //만일을 대비한 안전장치
      //경우에 따라서 만들어진 객체가 없어지거나, 객체를 만들수 없는 비이상적인 경우가 있어서 if로 null확인
      s = new Singleton();
      //객체가 없는 경우는 생성자를 통해서 객체를 생성해야됨
    }
    return s;
  }
}


public class SingletonTest {

  public static void main(String[] args) {

    //Singleton s = new SingletonTest();  //private Singleton(){} 여기에 직접접근을 못하도록 했다
    //ㄴ 기존의 객체생성방법 : 외부에서 접근해서 객체를 생성하는 방법으로 <-이건 싱글톤 패턴이 아니다
    //Singleton s = getInstance(); //이건 인스턴스맴버매소드를 사용하는 방법이고
    Singleton s = Singleton.getInstance();
    //ㄴ> 이 방법이 싱글톤이 제공하는 객체접근방법이다!!!
    //  -클래스 맴버 메소드
    //  -객체생성하지 않고 접근해서 객체를 사용.

  }

}