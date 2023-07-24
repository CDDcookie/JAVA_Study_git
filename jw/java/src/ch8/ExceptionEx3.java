package ch8;

public class ExceptionEx3 {


    public static void main(String[] args) {

      int number =100;
      int result = 0;

      try{
        result =number/0; //여기 exception발생함 try할 대상임
        System.out.println("try - exception 발생 감지");
      } catch (ArithmeticException e) {
        System.out.println("catch - exception감지");
        System.out.println("0으로 나누면암됨. 종료");
      }

      result =number/0;
    }
  }
