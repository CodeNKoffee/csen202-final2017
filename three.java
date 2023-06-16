// Exercise 3
public class three {
  public static void main(String[] args) {
    int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
    System.out.println(isUnique(list, 9));
    System.out.println(isUnique(list, 3));
    System.out.println(isUnique(list, 0));
  }

  public static boolean isUnique(int[] list, int num) {
    return isHelper(list, num, 0, false);
  }

  public static boolean isHelper(int[] list, int num, int index, boolean x) {
    if (index == list.length) {
      return x;
    }
    else if (list[index] == num && x) {
      return false;
    }
    else if (list[index] == num) {
      return isHelper(list, num, ++index, true);
    }
    else {
      return isHelper(list, num, ++index, x);
    }
  }
}
