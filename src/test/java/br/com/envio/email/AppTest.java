package br.com.envio.email;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private String userName = "marcellomueno@gmail.com";
	private String password = "fhom xkga ekxn itow";
	//private String password = "fhom xkga ekxn itow";
	
    @Test
    public void testeEnviarEmail() throws Exception{
    	
    	StringBuilder sB = new StringBuilder();
    	
    	sB.append("Olá, <br/><br/>");
    	sB.append("Voce esta recebendo este email");
    	
    	ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("marcellomueno@gmail.com",
    			"MARCELLO",
    			"Testando email java",
    			sB.toString());
    			
    	
    	enviaEmail.enviarEmailAnexo(true);
    	
    	
    }
}
