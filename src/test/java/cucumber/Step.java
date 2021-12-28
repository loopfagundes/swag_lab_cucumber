package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {

    @Given("^O usuario acessa de login e preencha nos campos de login e senha$")
    public void o_usuario_acessa_de_login_e_preencha_nos_campos_de_login_e_senha() {
        System.out.println("1");
    }

    @Given("^Escolheu um produto$")
    public void escolheu_um_produto() {
        System.out.println("2");
    }

    @When("^O usuario ja confirmado de comprar$")
    public void o_usuario_ja_confirmado_de_comprar() {
        System.out.println("3");
    }

    @Then("^O usuario finalizou de comprar com sucesso$")
    public void o_usuario_finalizou_de_comprar_com_sucesso() {
        System.out.println("4");
    }
}