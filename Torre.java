public class Torre{
    private Disco discosEmpilhados[]; 
    private int topo; 
    
    Torre(int tamanho){
        this.discosEmpilhados = new Disco [tamanho];
        this.topo = -1; 
    }

    public boolean empilha(Disco disco){
        if(this.torreCheia()){
            return false; 
        }
        this.discosEmpilhados[++this.topo] = disco;
        return true;
    }

    public int getQuatidade(){
        return this.topo + 1;
    }

    public boolean torreVazia(){
        if(this.topo == -1){
            return true; 
        }
        return false; 

    }

    private boolean torreCheia(){
        if(this.topo == this.discosEmpilhados.length-1){
            return true; 
        }
        return false; 
    }

    public Disco desempilha(){
         if(this.torreVazia()){
            return null;
    }
    return this.discosEmpilhados[this.topo--];
    }

    
    public Disco topo(){
        if(this.torreVazia()){
            return null;
        }
        return this.discosEmpilhados[this.topo];
    }

    public Disco obterDisco(int indice) {
        if (indice >= 0 && indice <= topo) {
            return discosEmpilhados[indice];
        }
        return null; // Retorna null se não houver disco naquela altura
    }

}