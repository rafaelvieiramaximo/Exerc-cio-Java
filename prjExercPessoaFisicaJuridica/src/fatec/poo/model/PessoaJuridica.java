package fatec.poo.model;

/**
 *
 * @author rafav
 */
public class PessoaJuridica extends Pessoa{
    
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String n, String c, int ai ){
        super(n, ai);
        cgc = c;
    }
    
    public double calcBonus(int anoAtual){
        
        double bonus = (taxaIncentivo * super.getTotalCompras()) * (anoAtual - super.getAnoInscricao());
        
        return bonus;
    }
    
    public void setTaxaIncentivo(double taxaI){
        
        taxaIncentivo = taxaI/100;
    }
    
    public String getCgc(){
        return cgc;
    }
    
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
}
