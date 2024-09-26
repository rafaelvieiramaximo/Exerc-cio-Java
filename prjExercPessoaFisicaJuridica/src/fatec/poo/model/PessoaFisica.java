package fatec.poo.model;

/**
 *
 * @author rafav
 */
public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private double base;
    
    public PessoaFisica (String n, String c, int ai){
        super(n, ai);
        cpf = c;
    }
    
    public double calcBonus(int anoAtual){
         
        double bonus = 0;
        
        if( super.getTotalCompras() > 12000 ){
           bonus =  (anoAtual - super.getAnoInscricao()) * base;
           
        }
        return bonus;
     
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setBase(double ba){
        base = ba;
    }
    
    public double getBase(){
        return base;
    }
      
}
