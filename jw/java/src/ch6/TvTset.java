package ch6;
/*
  사용자 정의 타입
  클레스 에서 인스턴스화가 되고 그담에 객체(object)가된다
  변수->배열->구조체(c언어)->클레스()->객체배열

 JAVA 언어에는 수많은 클래스로 구성되어 있는 상태임.
  클래스 간의 관계를 만들어 놓아져 있음. 최상위에 있는 클래스가 있음.
  => Object class, 여러가지의 메소드.

 */

class Tv {

  ///[맴버변수] => 속성,필드,상태
  ///인스턴스(객체)변수 => new 한 경우에만 사용 가능
  String color;
  boolean power;
  int channel;
  //ㄴ 나중엔 맴버변수인데 참조변슈 type, 겍체

  /*
    ///[맴버메소드] => 함수,행위,기능,동작
    ///인스턴스(객체) 메소드 => new 한경우만 사용 가능

      void : 반환이 없음 , 함수 body에서 처리한 결과를 return 하지 않음
      parameter 가 없음. => 함수만 호출하면 바디가 실행
          => 기본형,참조형*,객체배열*
      power = !power; => on.off 기능  ,return이 없다
  */

  void power() {
    power = !power;
  }

  void channelUp() {
    ++channel;
  }

  void channeldown() {
    --channel;
  }
}


public class TvTset {

  public static void main(String[] args) {
    Tv tv; //참조변수 선언
    tv = new Tv();    // 인스턴스 생성 (=기본 생성자라고 한다,함수 형태)
    tv = new Tv();      // 인스턴스 생성. ( 기본 생성자, 함수 형태 )
    tv.channel = 7;    // 인스턴스 변수를 초기화 함.
    tv.channeldown(); // 인스턴스 메소드를 사용.

    System.out.println("현재 채널은 " + tv.channel + "입니다.");

  }

}
