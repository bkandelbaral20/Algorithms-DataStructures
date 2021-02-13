package javaRefresher;

//create a banking transaction class that holds all the activities happened on bank account

public class BankingTransaction {
    double balance = 0;
    double numberOfDeposits = 0;
    double numberOfWithDrawls = 0;
    double interestRates = 0;
    double annualInterestRate;
    double monthlyServiceCharge = 0;

    // Create a constructor
    public BankingTransaction(double balance, double numberOfDeposits, double numberOfWithDrawls,
                              double interestRates, double annualInterestRate, double monthlyServiceCharge) {
        this.balance = balance;
        this.numberOfDeposits = numberOfDeposits;
        this.numberOfWithDrawls = numberOfWithDrawls;
        this.interestRates = interestRates;
        this.annualInterestRate = annualInterestRate;
        this.monthlyServiceCharge = monthlyServiceCharge;
    }

    //for deposit
    public void deposit(double amount) {
        balance += amount;
        numberOfDeposits++;
    }

    // for withdrawal
    public void withdraw(double amount) {
        balance -= amount;
        numberOfWithDrawls++;
    }

    //  for calculating interest rates
    public void calInterestRate() {
        double monInterestRates = (annualInterestRate / 12);
        double monInterest = balance * monInterestRates;
        balance += monInterest;
    }

    // for monthly processing
    public void monProcess() {
        balance -= monthlyServiceCharge;
        numberOfWithDrawls = 0;
        numberOfDeposits = 0;
        monthlyServiceCharge = 0;

    }
}

