
    class BankingAccount {

        public int balance;

        public void deposit(int sum) {
            balance = balance + sum;
            System.out.println("A deposit in the amount of " + sum + " was successfully made to your account. Your current balance is " + balance);
            // do what?
        }
        public void withdrawal(int sum){
            balance = balance - sum;
            System.out.println("A withdrawal in the amount of " + sum + " was successfully made from your account. Your current balance is " + balance);
        }
        // what about withdrawal?
    }



