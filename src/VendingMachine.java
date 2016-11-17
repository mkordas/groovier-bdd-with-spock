public class VendingMachineScenario {
    private VendingMachine vendingMachine;

    @Given("a vending machine")
    public void vendingMachine() {
        vendingMachine = new VendingMachine();
    }

    @When("I insert $coin")
    public void insertCoin(int coin) {
        vendingMachine.insert(coin);
    }

    @Then("I have $amount credit")
    public void credit(int amount) {
        assertEquals(amount, vendingMachine.credit());
    }
}
