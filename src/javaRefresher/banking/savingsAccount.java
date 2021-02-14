package javaRefresher.banking;
import java.util.Scanner;

// Create a Saving account which also extends the Bank account information
public class savingsAccount extends BankingTransaction {

    public boolean active;

    public savingsAccount(double balance, double numberOfDeposits, double numberOfWithDrawls, double interestRates, double annualInterestRate, double monthlyServiceCharge) {
        super(balance, numberOfDeposits, numberOfWithDrawls, interestRates, annualInterestRate, monthlyServiceCharge);
        active = !(balance < 25);
    }

    public void withDraw(double amount) {
        if (active) {
            super.withdraw(amount);
        }
    }

    public void deposit(double amount) {
        if (!active) {
            if (amount + balance < 25) {
            } else {
                super.deposit(amount);
            }
        }
    }

    public void monProcess() {
        if (numberOfWithDrawls > 4) {
            monthlyServiceCharge += numberOfWithDrawls - 4;
        }
        super.monProcess();
        if (balance < 25) {
            active = false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance;
        double numberOfDeposits;
        double numberOfWithDrawls;
        double interestRates;
        double annualInterestRate;
        double monthlyServiceCharge;

        System.out.println("Please enter the starting balance :");
        balance = scanner.nextDouble();

        System.out.println("Number of deposits : ");
        numberOfDeposits = scanner.nextDouble();

        System.out.println("Number of withdrawal : ");
        numberOfWithDrawls = scanner.nextDouble();

        System.out.println("Monthly interest rates : ");
        interestRates = scanner.nextDouble();

        System.out.println("Amount of monthly service charge : ");
        monthlyServiceCharge = scanner.nextDouble();

        System.out.println("The starting balance of the bank account is " + balance);
        System.out.println("The total number of deposits are " + numberOfDeposits);
        System.out.println("The total number of withdrawals are " + numberOfWithDrawls);
        System.out.println("The monthly interest rates is " + interestRates);
        System.out.println("The monthly service charged is " + monthlyServiceCharge);

    }
}

