package ch8;
/*
  try catch가 동작하는 메커니즘을 이해하는 예제.
 */

public class ExceptionEx5 {

  public static void main(String[] args) {

    int number =100;
    int result = 0;

    System.out.println(1);
    System.out.println(2);

    try {
      System.out.println(3);
      result =number/0; //여기 exception발생함 try할 대상임
      System.out.println(4);
    } catch (ArithmeticException ae) {
      if (ae instanceof ArithmeticException) //Exception으로 catch가 됨으로
      //실제객체가 누구인지 확인
        System.out.println(true);

      System.out.println("ArithmeticException");

      System.out.println("Exception 상세정보");
      System.out.print("printStackTrace : 호출 스텍의 정보 : " );
      ae.printStackTrace();

      System.out.println();
      System.out.println("getMessage() : Exception 인스턴스의 메세지 : " );
      ae.getMessage();


      System.out.println(5);

    }catch (Exception e){ //Exception도 catch가 되는지 확인
                          //ArithmeticException 외의 Exception이 대상이다
      System.out.println("Exception");
    }

    System.out.println(6);
  }
}
