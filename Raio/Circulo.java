package Raio;

public class Circulo {
    
    private double raio;

    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double calcArea(){
      return Math.PI * (raio * raio);  
    }
    
    public double Perimetro(){
        return 2 * Math.PI * raio;
    }
    
    public double Diametro(){
        return 2 * raio;
    }
}   
