package br.com.alura.viacep.principal;

import java.io.IOException;
import java.util.Scanner;



import br.com.alura.viacep.buscacep.BuscadorViaCep;
import br.com.alura.viacep.buscacep.InformacoesViaCep;


public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner leitor = new Scanner(System.in);
		BuscadorViaCep consultaCep = new BuscadorViaCep();
		
		System.out.println("Digite o CEP:");
		var cep  = leitor.nextLine();
		leitor.close();	
		
        try {
        	InformacoesViaCep novoCep = consultaCep.buscaCep(cep);
        	System.out.println(novoCep);
        } catch (RuntimeException  e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
 		
 		
           
              
     

	}

}
