public class Disco{
    private int tamanho; 

    public Disco(int tamanho){
        this.tamanho = tamanho; 
    }

    public int getTamanho(){
        return this.tamanho; 
    }
    public void exibir() {
    for(int i = 0; i < this.tamanho; i++){
        System.out.print("*");
    System.out.println();
        }
    }
}