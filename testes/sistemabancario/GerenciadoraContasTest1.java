package sistemabancario;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;


import sistemabancario.ContaCorrente;
import sistemabancario.GerenciadoraContas;


/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * sobre contas, realizadas pela classe {@link GerenciadoraContas}
 * 
 * @author leandro arraes
 * @date 25/08/2023
 * 
 */

public class GerenciadoraContasTest1 {
	/**
	 * Função para fazer o teste basico de tranferencia bancaria de uma conta de origem para uma conta de destino
	 * @author leandro arraes
	 * @date 25/08/2023
	 * 
	 */
	
	@Test
	public void testeTransfereValor() {
		
		
		/*=====Montagem do cenário de teste=====*/
		ContaCorrente conta01 = new ContaCorrente(1, 200, true);
		ContaCorrente conta02 = new ContaCorrente(2, 0, true);
		
		
		
		List<ContaCorrente> contasDoBanco = new ArrayList<ContaCorrente>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		/*=====Montagem do cenário de teste=====*/
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		/*=====execução da regra de negócio a ser testada=====*/
		
			boolean resultadoTransferencia = gerContas.transfereValor(1, 50, 2);
					
		/*=====execução dos testes pelo JUnit para abnálises de Verificações =====*/
			//assertTHat(resultadoTransferencia , is(true)0; //é a mesma coisa que a linha 48
					
			assertTrue(resultadoTransferencia);
			assertThat(conta01.getSaldo(), is(150.0));
			assertThat(conta02.getSaldo(), is(50.0));
			}
}

	

