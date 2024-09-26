
package fatec.poo.model;

/**
 *
 * @author rafav
 */
public abstract class Pessoa {
    
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    public Pessoa (String n, int ai){
        nome = n;
        anoInscricao = ai;
    }
    
    abstract public double calcBonus(int d);
    
    public void addCompras(double c){
        totalCompras += c;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getAnoInscricao(){
        return anoInscricao;
    }
    
    public double getTotalCompras(){
        return totalCompras;
    }
    
}
