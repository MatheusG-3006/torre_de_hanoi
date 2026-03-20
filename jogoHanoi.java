//Nome: Matheus Gonçalves dos Santos RA:10439447
//Nome: Jean Carlos Antunes Rocha RA: 10431939
//Nome: Arthur Cezar da Silveira Lima RA:10409172

import java.util.Scanner;


public class jogoHanoi{        
    
    private Torre[] torres;
    private int totalDiscos;
    private int movimentos;

    public void jogohanoi(int totalDiscos){
        this.totalDiscos = totalDiscos;
        this.movimentos = 0;
        this.torres = new Torre[3];

        for(int i = 0; i<this.torres.length; i++){
            this.torres[i] = new Torre(this.totalDiscos);
        }
        for(int i = this.totalDiscos; i >= 1; i--){
            this.torres[0].empilha(new Disco(i));
        }
    }

    public void jogar(){
    
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        do {

            System.out.println("\n--- MENU TORRE DE HANOI ---");
            System.out.println("1 - Mover disco\n2 - Mostrar torres\n3 - Reiniciar jogo\n4 - Sair");

            System.out.println("Digite a sua escolha: ");
            escolha = sc.nextInt();

            switch(escolha){
                case 1:
                    //mover disco
                    moverDisco(sc);
                    break;
                case 2:
                    //mostrar torres
                    mostrarTorres();
                    break;
                case 3:
                    //reiniciar jogo
                    reiniciarJogo();
                    break;
                case 4:
                    //sair
                    System.out.println("Obrigado por jogar!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }while (escolha != 4);
    }

    public void moverDisco(Scanner sc){

        System.out.println("Torre de origem: ");
        int origem = sc.nextInt();
        
        System.out.println("Torre de destino: ");
        int destino = sc.nextInt();
        
        if(origem < 1 || origem > 3 || destino < 1 || destino > 3){
            System.out.println("Torre inválida. Tente novamente.");
            return;
        }

        Torre torreOrigem = torres[origem - 1];
        Torre torreDestino = torres[destino - 1];

        if(torreOrigem.torreVazia()){
            System.out.println("Torre de origem vazia. Tente novamente.");
            return;
        }
        if(!torreDestino.torreVazia() && torreOrigem.topo().getTamanho() > torreDestino.topo().getTamanho()){
            System.out.println("Não é permitido mover um disco maior para cima de um disco menor. Tente novamente.");
            return;
        }
        torreDestino.empilha(torreOrigem.desempilha());
        movimentos++;
        verificarVitoria();
    }

    public void mostrarTorres() {
    System.out.println("\nESTADO ATUAL DAS TORRES:");
    
        for (int nivel = totalDiscos - 1; nivel >= 0; nivel--) {
            for (int t = 0; t < 3; t++) {
                Disco d = torres[t].obterDisco(nivel);
                
                if (d != null) {
                    
                    String visualDisco = "";
                    for(int i = 0; i < d.getTamanho(); i++) visualDisco += "*";
                    
                    System.out.printf("%-15s", visualDisco);
                } else {
                    
                    System.out.printf("%-15s", "|");
                }
            }
            System.out.println(); 
        }
        
        System.out.println("   TORRE_1        TORRE_2        TORRE_3\n");
    }


    public void reiniciarJogo(){
        jogohanoi(this.totalDiscos);
        System.out.println("Jogo reiniciado com " + this.totalDiscos + " discos.");
    }

    public void verificarVitoria(){
        if(torres[1].getQuatidade() == this.totalDiscos || torres[2].getQuatidade() == this.totalDiscos){
            System.out.println("Parabéns! Você venceu o jogo em " + this.movimentos + " movimentos!");
            return;
        }
    }
}
