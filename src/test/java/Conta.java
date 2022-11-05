import io.cucumber.java.en.*;

public class Conta {
	
	/*
	 * @param int1 Este é o valor inteiro correspondente ao saldo atual do cliente especial
	 */
	@Given("cliente especial com saldo atual de {int} reais")
	public void cliente_especial_com_saldo_atual_de_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/*
	 * @param int1 Este é o valor inteiro correspondente ao valor requisitado para saque 
	 */
	@When("for solicitado saque no valor de {int} reais")
	public void for_solicitado_saque_no_valor_de_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/*
	 * @param int1 Este é o valor inteiro correspondente ao novo saldo que a conta deve apresentar
	 */
	@Then("deve efetuar e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	/*
	 * @param int1 Este é o valor inteiro correspondete ao saldo atual da conta do cliente comum
	 */
	@Given("cliente comum com saldo atual de {int} reais")
	public void cliente_comum_com_saldo_atual_de_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/*
	 * @param int1 Este é o valor inteiro correspondente ao valor solicitado para saque
	 */
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("não deve efetuar saque e deve retornar a mensagem Saldo Insulficiente")
	public void não_deve_efetuar_saque_e_deve_retornar_a_mensagem_saldo_insulficiente() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
