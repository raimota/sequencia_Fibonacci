import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int N, a=0, b = 1, c=0, cont = 0;
    try(Scanner leia = new Scanner(System.in);){
      System.out.printf("Digite um número: ");
    N = leia.nextInt();
    while(cont < N){
      c = a + b;
      a = b;
      b = c;
      cont++;
      if(c == N){
        System.out.printf("Verdadeiro\n");
        break;
      }else{
        if(c > N){
        System.out.printf("Falso\n");
        break;
      }
      }
    }
    if(c ==0){
      System.out.printf("Verdadeiro\n");
    }
  }
    }
}