package ch8;
/*
RuntimeException class : unchecked 예외
ㄴ>컴파일러가 예외처리를 확인 (try... catch...)하지 않음

Exception class : checked 예외
ㄴ>컴파일러가 예외처리를 확인 (try... catch...)한다

개발자에게 선택권을 부여함. RuntimeException 의 자식으로
사용자 정의 Exception을 만들어서 사용하게되면
컴파일러 확인을 하지 않으니,개발자가 좀 더 자유롭게 코딩을 할 수 있게됨
 */


public class ExceptionEx10 {

  public static void main(String[] args) {

//    throw new Exception(); --> check예외이다

    throw  new RuntimeException(); // --> uncheck예외이다
  }

}
