package ch5;

public class ArrayEx12 {

  /*
    String 배열 . 참조형배열. 객체배열, 각 요소의 값은 객체의 주소값이다
    =>메모리 그림과 함꼐 정리 => 기본형 타입의 메모리 그림과의 차이를 이해
   */

  public static void main(String[] args) {

    //     주소값       100      200     300
    String[] names = {"홍길동", "이문수", "아무개"};

    for (int i = 0; i < names.length; i++) {
      System.out.println("names[" + i + "]" + names[i]);
    }

    String tmp = names[2];
    System.out.println("tmp :" + tmp);

    //  주소값   400
    names[0] = "HGD";
     /*
      names 는 {100, 200, 300} 이었는데 위에를 거치면
      -> name{400,200,300}이 되면서
      "홍길동"이라는 String 객체는 가비지 컬렉트대상이 된다
      */

    for (String str : names) {
      System.out.println(str);
    }
  }

}
