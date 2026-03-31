 public class Somatorio {
  public static int somatorio(int[] lista) {
    int soma = 0;

    for (int i = 0; i < lista.length; i++) {
      soma += lista[i];
    }

    return soma;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    System.out.println(somatorio(nums));
  }
}

