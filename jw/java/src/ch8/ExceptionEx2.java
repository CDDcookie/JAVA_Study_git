package ch8;
/*
  현제의 예제는 다음을 확인해보라는 예제
  1. 비정상 종료
      사용자가 종료하고 싶어서 종료한게 아님. => 그래서
  2. Exception 발생후의 내용을 확인 => java.lang.Ar~~ 확인
  3. Exception 이 발생하는 위치를 확인 =>19번 라인 코드에서 발생함을 확인
  4. 그래서, try로 묶어야 하는 코드가 어디인지 확인! =>19번 라인 코드가 대상임을 확인
*/


//public class ExceptionEx2 {
//
//  public static void main(String[] args) {
//
//    int number =100;
//    int result = 0;
//
//    result =number/0;
//  }
//}
