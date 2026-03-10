import java.util.Scanner;

/*
Nome: Matheus Gonçalves dos Santos RA:10439447
Nome: Jean Carlos Antunes Rocha RA: 10431939
*/

public class jogoHanoi{        
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Bem-vindo ao Jogo da torre de Hanoi!\n");

    System.out.println("Digite o tamanho da Torre: ");
    int tamanho = sc.nextInt();

    Torres[] torres = new Torres[3];
    torres[0] = new Torres(tamanho);
    torres[1] = new Torres(tamanho);
    torres[2] = new Torres(tamanho);

    for(int i = tamanho; i >= 1; i--){
        torres[0].empilha(new Disco(i));
    }

    System.out.println("Digite a sua escolha: ");
    int escolha = sc.nextInt();

    while(escolha)

    switch(escolha){
        case 1:
            //mover disco
            System.out.println("Torre de origem: ");
            int origem = sc.nextInt();
            Torres torreOrigem = torres[origem - 1];
            System.out.println("Torre de destino: ");
            int destino = sc.nextInt();
            Torres torreDestino = torres[destino - 1];

            if(origem < 1 || origem > 3 || destino < 1 || destino > 3){
                System.out.println("Torre inválida. Tente novamente.");
                break;
            }
            if(torreOrigem.estaVazia()){
                System.out.println("Torre de origem vazia. Tente novamente.");
                break;
            }
            if(torreOrigem.topo().getTamanho() > torreDestino.topo().getTamanho()){
                System.out.println("Não é permitido mover um disco maior para cima de um disco menor. Tente novamente.");
                break;
            }
            torreDestino.empilha(torreOrigem.desempilha());
            break;
        case 2:
            //mostrar torres
                for(int i = 0; i < torres.length; i++){
                    System.out.println("Torre " + (i + 1) + ": " + torres[i].toString());
                }
            break;
        case 3:
            //reiniciar jogo
                for(int i = 0; i < torres.length; i++){
                    torres[i] = new Torres(tamanho);
                }
            break;
        case 4:
            //sair
            
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
        }
    }
}
