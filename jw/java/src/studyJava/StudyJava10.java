package studyJava;

public class StudyJava10 {

  public static void main(String[] args) {

    int a=0;

    for(int i=2;i<10;i++){
      System.out.println("=="+i+" 단 입니다==");

      for(int j=1;j<10;j++){
        a=i*j;
        System.out.println(i+ "*" +j+  "= " + a);
      }
    }
  }
}
