package ch9;
/*
1 . Object class의 clone() 사용방법
2   깊은복사
    -깊은 복사


    -약은 복사
      Clble
 */


public class CloneEx1 {

  public static void main(String[] args) {
    Point original = new Point(7,10);
    Point copy =(Point)original.clone();  //clone은 새로운 인스턴스를 만든다
    System.out.println(original);
    System.out.println(copy);
  }

}

class  Point implements Cloneable {
  int x;
  int y;
  //인스턴스변수가 있는 경우는 깊은복사해야함
  //현제는 얕은복사임
  //깊은 복사를 구현해야한다

  Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public String toString(){
    return "x=" + x + ", y" + y; //이부분을 주석처리하면
  }
  //clone() override 함
  //  1. 접근제어지시자 public
  //  2. super.clone() 호출
  //  3. tyr... catch... 구현


  //이건 깊은복사 얕은복사중에 ->
  public Object clone(){ //무슨부위지,,,???????????
    Object obj = null;

    try {
      obj = super.clone();
    }catch (CloneNotSupportedException e){
    }
    return obj;
  }

}
