@tag
Feature: Cliente faz saque de dinheiro. Como cliente, eu gostaria de sacar dinheiro em um caixa
eletrônico, para que não tenha que esperar em uma fila de banco.

	@tag1
		Scenario: Cliente especial com saldo negativo
			Given cliente especial com saldo atual de -200 reais
			When for solicitado saque no valor de 100 reais
			Then deve efetuar e atualizar o saldo da conta para -300 reais
			
	@tag2
		Scenario Outline: Cliente comum com saldo negativo
			Given cliente comum com saldo atual de -300 reais
			When solicitar um saque de 200 reais
			Then não deve efetuar saque e deve retornar a mensagem Saldo Insulficiente
