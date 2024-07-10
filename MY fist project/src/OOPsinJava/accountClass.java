public class accountClass {

    public static class Account {
        String accHolderName;
        String accNumber;
        double balance;

        public Account(String accHolderName, String accNumber, double balance){
            this.accHolderName = accHolderName;
            this.accNumber = accNumber;
            this.balance = balance;
        }

        public void display_accBalance(){
            System.out.println("Your account" + accNumber + " has " + balance + "$ balance");
        }

        public void withdrawMoney(double amount){
            if(amount > balance){
                System.out.println("your account has insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Your account " + accNumber + " is debited with amount $" + amount + ". Your account has $" + balance+ "left" );
            }
        }
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Mohit", "11008877", 2000);

        acc1.display_accBalance();
        acc1.withdrawMoney(2500);
    }
}
