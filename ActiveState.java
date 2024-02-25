public class ActiveState implements AccountState{
    private Account account;

    public void Activate(Account account){
        this.account = account;
    }

        @Override
        public void deposit(Double depositAmount, Account account){
            account.setBalance(account.getBalance() + depositAmount);
            System.out.println("Deposit succesful. Current Balance: " + account.getBalance());
        }
    
    
         @Override
         public void withdraw(Double withdrawAmount, Account account){
                account.setBalance(account.getBalance() - withdrawAmount);
               System.out.println("Withdraw: " + withdrawAmount +" Current balance: " + account.getBalance());
            }
    

         @Override
         public void activate(Account account){
            System.out.println("Account is activated!");
         }
         @Override
         public void suspend(Account account){
            account.setAccountState(new SuspendedState(account));
            System.out.println("Account is suspended!");
         }
         @Override
         public void close(Account account){
            System.out.println("Account is closed! \n" + account.toString() );
            account.setAccountState(new ClosedState(account));

}
}