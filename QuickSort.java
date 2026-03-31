import java.util.Arrays;

public class QuickSort {
  public static int[] quicksort(int[] arr) {
    if (arr.length <= 1) return arr;

    int pivo = arr[0];
    int[] menores = Arrays.stream(arr).skip(1).filter(x -> x < pivo).toArray();
    int[] maiores = Arrays.stream(arr).skip(1).filter(x -> x >= pivo).toArray();

    int[] resultado = new int[arr.length];
    int i = 0;

    for (int x : quicksort(menores)) resultado[i++] = x;
    resultado[i++] = pivo;
    for (int x : quicksort(maiores)) resultado[i++] = x;

    return resultado;
  }

  public static void main(String[] args) {
    int[] nums = {5,3,8,1};
    System.out.println(Arrays.toString(quicksort(nums)));
  }
}
