package ch9;
import static java.lang.Math.*;

public class MathEx1 {

  public static void main(String[] args) {

    double val =90.7552;

    //round() 의 특징이 소숫점 첫쨰자리에서 반올림한다
    System.out.println("round(val) : " +round(val)); // 그냥하면 91나옴

    //반올림. (소숫점 셋째자리에서)
    //1. 100을 곱한다
    val *=100;
    System.out.println("val *=100 : " + val); //9075.52

    //2. round() 함수 사용
    System.out.println("round(val) : " +round(val)); //9076

    //3. 100.0 으로 나눈다
    System.out.println("round(val)/100" + round(val)/100); //90.76

    //-------------------------------------------------------------

    //올림.
    System.out.printf("ceil(1.1) : %3.1f%n" , ceil(1.1) ); //2.0

    //버림.
    System.out.printf("floor(1.5) : %3.1f%n" , floor(1.5) ); //1.0

    //rint. (가장 가까운 정수값으로)
    System.out.printf("rint(1.5) : %3.1f%n" , rint(1.5) ); //2
    System.out.printf("rint(1.3) : %3.1f%n" , rint(1.3) ); //1

    //음수들로 해보기!
    System.out.printf("round(-1.5) : %f%n" , round(-1.5) ); //-1
    System.out.printf("ceil(-1.5) : %f%n" ,ceil(-1.5) );    //-1.000000
    System.out.printf("floor(-1.5) : %f%n" , floor(-1.5) ); //-2.000000



    //-------------------------------------------------------------



  }
}
