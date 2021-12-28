Feature: Swag Lab Web

  Scenario: Acessar na tela de ogin e finalizacao de comprar na loja de virtual com sucesso
    Given O usuario acessa de login e preencha nos campos de login e senha
    And Escolheu um produto
    When O usuario ja confirmado de comprar
    Then O usuario finalizou de comprar com sucesso