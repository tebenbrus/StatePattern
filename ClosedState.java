public class ClosedState implements AccountState{
    private Account account;

    public ClosedState(Account account){
        this.account = account;
    }
    public void deposit(Double depositAmount, Account account){
        System.out.println("You cannot deposit to a closed Account.");
    }
    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("You cannot withdraw to a closed Account.");
    }
    public void activate(Account account){
        System.out.println("You cannot activate a closed Account.");
    }
    public void suspend(Account account){
        System.out.println("You cannot suspend a closed Account.");
    }
    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
   
}

