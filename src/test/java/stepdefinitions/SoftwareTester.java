package stepdefinitions;

import io.cucumber.java.en.*;

public class SoftwareTester {

	@Given("^I am a \"(.*)\" software tester$")
	public void i_am_a_good_software_tester(String testerType) {

		System.out.println(">> - Given - I am a " + testerType + " Software Tester");

	}

	@When("^I go to work$")
	public void i_go_to_work() {

		System.out.println(">> - When - I go to work");

	}

	@And("^I \"([a-zA-Z]{1,})\" with it$")
	public void i_involve_with_it(String testerWork) {

		System.out.println(">> - And - I " + testerWork + " with it");
	}

	@Then("^My boss \"([a-zA-Z]{1,})\" me$")
	public void my_boss_loves_me(String bossBehaviour) {

		System.out.println(">> - Then - My boss " + bossBehaviour + " me");

	}

}
