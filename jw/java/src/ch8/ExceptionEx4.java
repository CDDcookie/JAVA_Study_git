package ch8;
/*
  try catch가 exception이 발생하지 않은 경우의 동작을 확인하는 예제
 */


public class ExceptionEx4 {

  public static void main(String[] args) {

    int number =100;
    int result = 0;

    System.out.println(1);
    System.out.println(2);

    try {
      System.out.println(3);
      result =number/0; //여기 exception발생함 try할 대상임
      System.out.println(4);
    } catch (Exception e) {
      System.out.println(5);

    }
    System.out.println(6);
  }

}
