package desafio_DIO_loop;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
       label: while (true) { 

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            
            switch(opcao) {
            case 1:
            	System.out.println("Informe o valor a ser depositado: ");
            	double valor = scanner.nextDouble();
            	saldo += valor;
            	System.out.println("Saldo atual: " + saldo	);
            	break;
         
            case 2:
            	
            	System.out.println("Informe o valor a ser sacado: ");
            	valor = scanner.nextDouble();
            	
            	if (saldo >= valor) {
            		
            		saldo -= valor;
            		System.out.println("Saldo atual:" + saldo);
            		
            	}else {
            		
            		System.out.println("Saldo insuficiente.");
            	}
            	break;
            
            case 3:
            	
            	System.out.println("Saldo atual:" + saldo);
            	break;
            	
            case 0: 
            	
            	System.out.println("Programa encerrado.");
            	break label;
            	
            	default:
            	// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                
                System.out.println("Opção inválida. Tente novamente."); 
        }
            
            
            }
            
            	
            	
        
        scanner.close();
        }
    }

	


