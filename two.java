public class two {
  public static void main(String[] args) {
    // int[] a = {21, 8, 15, 0, -3, 32};
    // int n = 3;
    // int[] expandedArr = expand(a, n);
    // for (int element : expandedArr) {
    //   System.out.print(element + " ");
    // }
    int n = Integer.parseInt(args[args.length - 1]);
    int[] a = new int[args.length - 1];
    for (int  i = 0; i < args.length - 1; i++) {
      a[i] = Integer.parseInt(args[i]);
    }

    int[] expandedArr = expand(a, n);
    for (int element : expandedArr) {
      System.out.print(element + " ");
    }
  }

  public static int[] expand(int[] arr, int num) {
    if (num <= 0) {
      return new int[0];
    }
    else if (num == 1) {
      return arr;
    }
    else {
      int[] newArr = new int[arr.length * num];
      int index = 0;
      for (int i = 0; i < arr.length; i++) {
        int digit = arr[i] / num;
        for (int j = 0; j < num; j++) {
          newArr[index] = digit;
          index++;
        }
      }
      return newArr;
    }
  }
}