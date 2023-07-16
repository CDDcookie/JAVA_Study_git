package ch7;

//부모클래스
class Tv {

  //인스턴스변수
  boolean power;
  int channel;

  //인스턴스 메소드
  void power() {
    power = !power;
  }

  void channelUp() {
    ++channel;
  }

  void channelDown() {
    --channel;
  }
}

//상속받은 자식클레스
//-> 상속의 장점은 코드 재상용성,유지보수가 용이하다,가독성향상,개발생산성이높다
//  이런 장점때문에 OOP를 배우는것이다.
class CaptionTv extends Tv {

  //인스턴스 변수 만듬
  boolean cation;

  //기본생성자
  //CaptionTv(){}

  //인스턴스 매소드 만듬
  void displayCaption(String text) {
    if (cation) {
      System.out.println(text);
    }
  }
}


public class CaptionTVTest {

  public static void main(String[] args) {
    //기본생성자
    //객체 생성은 생성자를 이용해서 한다. 원칙처럼 생각할것!!
    CaptionTv cTv = new CaptionTv();

    //상속의 장점: 개발생산성
    //부모의 인스턴스 변수 및 메소드를 사용
    cTv.channel = 10;
    cTv.channelUp();
    System.out.println(cTv.channel);

    //내꺼사용
    //!! 기본생성자를 이용할경우 인스턴스변수는 기본타입이면 초기화값으로 초기화된다
    cTv.displayCaption("Hello"); //boolean의 기본값은 false라서 출력이 안되는것-
    // > ture로 바꿔야함

    cTv.cation = true;
    cTv.displayCaption("Hello");

  }
}
