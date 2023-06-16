// Exercise 4
public class four {
  public static void main(String[] args) {
    int[][] scores = {
      {10, 20, 30, 40, 50, 60},     // 6 unique scores
      {15, 15, 20, 20, 25, 30}, // 4 unique scores
      {5, 5, 5, 5},             // 1 unique score
      {1, 2, 3, 4, 5}           // 5 unique scores
    };

    int maxUnique = four.mostUnique(scores);
    System.out.println("Max unique scores: " + maxUnique);
  }

  public static int mostUnique(int[][] x) {
    int max = 0;
    for (int i = 0; i < x.length; i++) {
      int unique = 1;
      for (int j = 0; j < x[i].length - 1; j++) {
        if (x[i][j] != x[i][j + 1]) {
          unique++;
        }
      }
      System.out.println("Row " + (i + 1) + ": " + unique + " unique scores");
      if (unique > max) {
        max = unique;
      }
    }
    return max;
  }
}
