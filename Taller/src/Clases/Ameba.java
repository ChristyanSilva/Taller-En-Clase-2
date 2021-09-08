package Clases;


public class Ameba {
    //Atributos
    private int peso;
    
  
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Ameba() {
        this.peso = 3;
        
    }
    public void come(int peso) {
        this.peso= this.peso+peso-1 ;
    }
    public void come(Ameba a) {
    
        //this.peso= a.getPeso()+this.peso-1; 
        this.come(a.getPeso());
        a.setPeso(0);
    }
    @Override
    public String toString() {
        return  "Soy una ameba y peso "+this.peso+" microgramos"  ;  
                
    }
    
}
