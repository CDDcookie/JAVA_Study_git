public class _02_Quiz {
  public static void main(String[] args) {
    int HeightCut = 120;
    int A = 119;
    int B = 130;

    String result1 = (HeightCut > A) ? "탑승가능" : "탑승불가능";
    System.out.println(A + "이므로" + result1);

    String result2 = (HeightCut > B) ? "탑승가능" : "탑승불가능";
    System.out.println(B + "이므로" + result2);

  }
}
