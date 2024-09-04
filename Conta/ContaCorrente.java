package Conta;

public class ContaCorrente {
    
    int numero;
    double saldo;
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public ContaCorrente(int numero, double saldoDaConta){
        this.numero = numero;
        this.saldo = saldoDaConta;
    }
    
    public void depositar(double valor){
            saldo += valor;
    }
    
    public void sacar(double valor){
            saldo -= valor;
    }
    
}
