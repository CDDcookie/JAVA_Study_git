package studyJava;

public class StudyJava22 {

  public static void main(String[] args) {
    int[] a = {80, 86, 47, 88, 85};
    int sum =0;

    for(int i=0;i< a.length ;i++ ){
       sum =sum+a[i];

    }

    double avg =(double)sum/a.length;
    System.out.println(avg);

  }

}
