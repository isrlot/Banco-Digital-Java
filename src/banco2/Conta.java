package banco2;


public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    static int qtdcounter = 0;
    
    public Conta(String pTitular){
        this.titular = pTitular;
        qtdcounter++;
        this.numero = qtdcounter;
        this.saldo = 0;
    }
    
    public void DadosBancariosTitular(){
        System.out.println("");
        System.out.println("-- Seus Dados Bancarios --");
        System.out.println("- Numero da Conta: " + this.numero);
        System.out.println("- Seu nome titular: " +this.titular);
        System.out.println("- Saldo: " +this.saldo);
        System.out.println("--- Fim das Informações Bancaris ---");
        System.out.println("");
    }
    
    public void Depositar(double pValor){
        System.out.println("");
        System.out.println("--- Ralização de Depósito");
        System.out.println("- Saldo Anterior: " +this.saldo);
        
        this.saldo += pValor;
        
        System.out.println("Saldo Posterior: " +this.saldo);
        System.out.println("--- !FIM DO DEPÓSITO!");
        System.out.println("");
    }
    
    public void Sacar(double pValor){
        if(pValor <= this.saldo){
            this.saldo -= pValor;
            System.out.println("- Saldo Posterior: " +this.saldo);    
}else{
            System.out.println("- Saldo Insuficiente");
        }
        System.out.println("--- FIM DO SAQUE! ---");
        System.out.println("");
    }
   
}
    

