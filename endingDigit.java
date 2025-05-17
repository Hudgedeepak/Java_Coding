public class endingDigit {
  public static void main(String[] args) {
    int start = 1;
    int end = 20000;
    for (int i = start; i < end; i++) {
      if (i % 10 == 7) {
        System.out.println(i);
      }
    }
  }

}
