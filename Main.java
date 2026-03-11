import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo da Torre de Hanoi!");
        System.out.println("Digite o número de discos: ");
        int totalDiscos = sc.nextInt();
        jogoHanoi jogo = new jogoHanoi();
        jogo.jogohanoi(totalDiscos);
        jogo.jogar();
        sc.close();
        
    }
}