package studyJava;

public class StudyJava16 {

  public static void main(String[] args) {

    int i = 0;
    int j = 0;
    int a = 0;

//    for (i = 1; i < 5; i++) {
//      for (j = 3; j > 0; j--) {
//        System.out.print(" ");
//      }
//      for (a = 1; a < 5-j; a++) {
//        System.out.print("*");
//      }
//      System.out.println();
//    }
//
//  }}

    for(i=0;i<4;i++){

      for(j=4;j>0;j--){
        if(j-1>i){
          System.out.print(" ");
        }  else
        System.out.print("*");


      }

      System.out.println();

    }




  }}