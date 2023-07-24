package ch8;
/*
  사용자 정의 Exception 생성 및 발생하는 예제
 */

public class ExceptionEx6 {

  public static void main(String[] args) {

    try{
//      //Exception객체 생성
//      Exception e =new Exception("고의로 만든 Exception");
//
//      //Exception발생
//      throw e;
      throw  new Exception("고의로 만든 Exception.");

    }catch (Exception e){
      System.out.println("에러 메세지 : " + e.getMessage());
      e.printStackTrace();
    }

    System.out.println("프로그램 종료");

  }

}
