public class PhonePe 
{
    private final BankApis bankApis;
    public PhonePe() {
        this.bankApis = new IciciBankAdapter();
    }
    public void makeTransaction(String accountNo, int amount) {
        bankApis.makeTransaction(accountNo, amount);
    }
    public int checkBalance(String accountNo) {
        return bankApis.checkBalance(accountNo);
    }
}
//private prevents other classes from directly changing the adapter's bank API.
//final ensures the reference cannot be reassigned after initialization.
//