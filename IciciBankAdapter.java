public class IciciBankAdapter implements BankApis {
    //this means the adapter promises to implement both methods required by BankApis
    //maketransaction() and checkbalance().

    private final IciciBankApi iciciBankApi;
    //creates an object for adapter
    public IciciBankAdapter()
    {
        this.iciciBankApi = new IciciBankApi();
    }
    @Override
    public void makeTransaction(String accountNo, int amount) {
        iciciBankApi.sendMoney(accountNo, amount);
    }
    //this step Translate the balance method
    //phonePe calls makeTransaction(), but the adapter forwards that call to ICICI's sendMoney()
    @Override
    public int checkBalance(String accountNo) {
        return iciciBankApi.fetchBalance(accountNo);
    //PhonePe calls checkBalance(), and the adapter gets the balance using ICICI's fetchBalance().
    }
}


