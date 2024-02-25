public class SuspendedState implements AccountState{
    private Account account;

    public SuspendedState(Account account){
        this.account=account;
    }
    public void deposit(Double depositAmount, Account account){
        System.out.println("You cannot deposit due to a suspended account.");

    }
    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("You cannot withdraw due to a suspended account.");
    }
    public void activate(Account account){
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }
    public void close(Account account){
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState(account));
    }

}

