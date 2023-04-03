package banco2;


public class Adm {
    private int numero;
    private String titular;
    private String cpf;
    private String email;
    private String senha;
    private double saldo;
    static int qtdcounter = 0;
    
    public Adm(String aux){
        this.titular = titular;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        qtdcounter++;
        this.numero = qtdcounter;
        this.saldo = 0;
        
    }

    
public String getTitular(){
        return titular;
    }
   public void setTitular(String titular){
       this.titular = titular;
   }
   public String getCpf(String cpf1){
       return cpf;
   }
   public void setCpf(String cpf){
       this.cpf = cpf;
   }
   public String getEmail(){
       return email;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public String getSenha(){
       return senha;
   } 
   public void setSenha(String senha){
       this.senha = senha;
   }
   public double getSaldo(){
       return saldo;
   }
   public void setSaldo(double saldo){
        this.saldo = saldo;
   }
    
    public void DadosClientes(){
        System.out.println("");
        System.out.println("-- Dados Bancarios dos Clientes --");
        System.out.println("- Numero da Conta do cliente: " + this.numero);
        System.out.println("- Nome titular do cliente: " +this.titular);
        System.out.println("- CPF do clinte: " +this.cpf);
        System.out.println("- Email do cliente: " +this.email);
        System.out.println("- Senha de acesso do cliente: " +this.senha);
        System.out.println("- Saldo: " +this.saldo);
        System.out.println("--- Fim do Acesso! ---");
        System.out.println("");
    }
    
    public void AcessoAdm(){
       String login = null;
       String senha = null;
       
       
       if(login.equals("admin") && senha.equals("123456")){
           System.out.println("Login e Senha validas!");
       }else{
           System.out.println("Login ou Senha invalida!");
       }
       this.AcessoAdm();
        
    }
}
