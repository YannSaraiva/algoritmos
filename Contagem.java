public class Contagem {
  public static int contagem(int[] lista, int primeiro, int N) {
    int count = 0;

    for (int i = 0; i < lista.length; i++) {
      if (lista[i] >= primeiro && lista[i] <= N) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] nums = {1,5,10,15};
    System.out.println(contagem(nums, 5, 15));
  }
}
