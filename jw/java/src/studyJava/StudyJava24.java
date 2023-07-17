package studyJava;

public class StudyJava24 {

  public static void main(String[] args) {
    char[] abc = {'A', 'B', 'C'};
    char[] num = {'1', '2', '3', '4'};

    char[] arr = new char[7];
    for (int i = 0; i < abc.length; i++) {
      arr[i] = abc[i];

    }

    for (int j = 0; j < num.length; j++) {
      arr[j + abc.length] = num[j];

    }
    System.out.println(arr);
  }
}