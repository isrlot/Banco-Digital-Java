package banco2;

import java.util.ArrayList;
import java.util.Scanner;


public class Banco2 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String aux;
        String aux2;
        String aux3;
        String aux4;
        
        int opcao = 0;
        double valor = 0;
        
        ArrayList<Conta> conta = new ArrayList();
        
        Conta Conta = null;
        Adm Adm = null;
        do{
            System.out.println("");
            System.out.println("--- Menu Banco ---");
            System.out.println("1) Criar Conta Titular");
            System.out.println("2) Dados Bancários");
            System.out.println("3) Depósito");
            System.out.println("4) Saque");
            System.out.println("5) Adm");
            System.out.println("6) Sair");
            
            System.out.println("Escolha uma das opções: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o  seu nome do Titular: ");
                    aux = teclado.nextLine();
                    
                    System.out.println("Digite seu Cpf: ");
                    aux2 =teclado.nextLine();
                    
                    System.out.println("Digite seu E-mail: ");
                    aux3 = teclado.nextLine();
                    
                    System.out.println("Digite sua Senha: ");
                    aux4 = teclado.nextLine();
                    
                    Conta = new Conta(aux);
                    
                    Adm = new Adm(aux);
                    
                    Adm.setTitular(aux);
                    
                    Adm.setCpf(aux2);
                    
                    Adm.setEmail(aux3);
                    
                    Adm.setSenha(aux4);
                    
                    Adm.setSaldo(valor);
                    
                    conta.add(Conta);
                    break;  
  
                
                case 2:
                    System.out.println("Digite o numero da conta: ");
                    int numero = teclado.nextInt();
                    
                    Conta = conta.get(numero-1);
                    
                   
                  
                   Conta.DadosBancariosTitular();
                   
                    break;
                
                case 3:
                    System.out.println("Digite o numero da conta: ");
                    numero = teclado.nextInt();
                    
                    Conta = conta.get(numero-1);
                    
                     System.out.println("Digite o valor do depósito: ");
                     
                valor = teclado.nextDouble();
                
                Adm.setSaldo(valor);
                Conta.Depositar(valor);
                
                    break;
                
                case 4:
                    System.out.println("Digite o numero da conta: ");
                    numero = teclado.nextInt();
                    
                    Conta = conta.get(numero-1);
                    
                     System.out.println("Digite o valor do Saque: ");
                valor = teclado.nextDouble();
                
                
                Conta.Sacar(valor);
               
                    break;
                
                case 5:
                    
                    System.out.println("Digite o login:  ");
                String login = teclado.nextLine();
                
                    System.out.println("Digite a senha: ");
                String senha = teclado.nextLine();
                    
                if(login.equals("admin") && senha.equals("123456")){
           System.out.println("Login e Senha validas!");
       }else{
           System.out.println("Login ou Senha invalida!");
       }
               
                    System.out.println("Digite o numero da conta: ");
                    numero = teclado.nextInt();
                    
                    Conta = conta.get(numero-1);
                    
                    
                    Adm.DadosClientes();
                    Adm.AcessoAdm();  
                  break;
                  
                  
                case 6:
                    System.out.println("Obrigado volte sempre!");
                System.exit(1);
                    break;
                    
                default:
                    if(opcao != 0)
                     System.out.println("Opção invalida!");
                    break;
            }
            System.out.println("");    
        }while(opcao != 0);
        
}
    
    }
    
    

