package ch8;
/*
  1. Exception class의 상속관계도의 이햬
  2. Unchecked Exception, Checked Exception 의 이해
  3. Exception class 의 상속관계도를 바탕으로 한 각 클레스 생성자의 이해
  4. 연결된 예외의 이햬
  5. Exception class의 설계에 대한 이해
  -----------------------------------------------------------------------
  상속관계도
  Object <- Throwable <- Exception <- RuntimeException
  -----------------------------------------------------------------------
  생성자
  RuntimeException(Throwable cause){
    super(); //super가 cause이다
  }

  Exception(Throwable cause){
    super(); //super가 cause이다
  }

  Throwable(Throwable cause){
   this.cause = cause //타고타고 올라오면 이런구조라 하나로 예외가 합쳐진다
  }
  -----------------------------------------------------------------------
*///1~12까진 앞에꺼 가져온것->15부터 시작한다

public class ChainedExceptionEx {

  public static void main(String[] args) {
    //9////17 mains 쪽 수정하기
    try {
      install();
    } catch (InstallException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  ////17. install 이라는 메소드로 설치하는거 다묶기-> 위에꺼 가져옴
  static void install() throws InstallException {
    try {
      startInstall();
      copyFile();
    } catch (SpaceException e) {
      ////18.연결된 예외 구현
      ////18.두개의 Exception을 하나의 Exception(대표Exception :InstallException)으로 만드는 작업
      InstallException ie = new InstallException("설치중 예외 발생");
      ////18.SpaceException을 대표Exception에 포함시키기
      ie.initCause(e);
      throw  ie; //예기 에러는 자동으로 해주는걸로 처림함

//      System.out.println("에러메세지 : "+e.getMessage());
//      e.printStackTrace();//10
//      System.out.println("공간이 부족함으로 공간을 확보한후 재설치 해주세요.");//12.
//      ie.initCause(e);
//      throw  ie;
//
//    } catch (MemoryException me) {
//
//      InstallException ie = new InstallException("설치중 예외 발생");

//      System.out.println("에러메세지 : "+ me.getMessage()); //12.
//      me.printStackTrace();//10
//      System.out.println("메모리가 부족함으로 메모리를 확보한후 재설치 해주세요.");//12.
    } finally {
      deleteFile();
    }
  }


  ////19?. checked Exception을 Unchecked Exception 으로 만들기
  //// ->앞으로 checked Exception이 계속 추가되면 try문이나 throw가 추가될 가능성에 정신나가서
  //// ->그래서 RuntimeException class의 생성자를 활용함 (매개변수가 Trowable타입이라서)

//  static void startInstall() throws SpaceException, MemoryException {
    static void startInstall() throws SpaceException{

      if(!enoughSpace())
      throw new SpaceException("설치공간부족");
      if(!enoughMomory()) {
//      체크드
//      throw new MemoryException("Momory공간부족");
      //언체크드
      throw new RuntimeException(new MemoryException("메모리 부족"));
    }
  }


  //4.위가 문제 없으면 local에 복사하기
  static void copyFile() {


  }


  //5.설치 완료 또는 미완료시의 필요없는 file을 삭제하는 메소드
  static void deleteFile() {

  }


  //6.동작테스트를 위한 제어 메소드 (어떨떈 예외발생하고 안하고를 정하기)
  //6-1. 공간제어
  static boolean enoughSpace() {
    return false;
  }

  //6-2. 메모리제어
  static boolean enoughMomory() {
    return true; ////16 true로 바꿈
  }
}

////15.설치중에 발생하는 Exception 을 대표하는 Exception  class
class InstallException extends Exception{//class make
  InstallException(String msg) { //생성자 만들기
    super(msg);
  }
}


//1.설치공간이 부족한 경우를 위한 Exception2 클레스
class SpaceException2 extends Exception{
  SpaceException2(String msg){//생성자만들기
    super(msg);
  }
}


//2.메모리가 부족한 경우를 위한 Exception2 클레스
class MemoryException2 extends Exception{
  MemoryException2(String msg){//생성자만들기
    super(msg);
  }
}