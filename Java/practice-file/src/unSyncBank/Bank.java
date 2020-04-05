package unSyncBank;

import java.util.Arrays;

public class Bank {
    private double[] accounts;

    public Bank(int nAccounts, double initialBalance) {
        accounts = new double[nAccounts];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) return;

        System.out.print(Thread.currentThread());

        accounts[from] -= amount;
        System.out.printf("%10.2f from %d to %d",amount,from,to);
        accounts[to] += amount;
        System.out.printf("total balance : %10.2f %n", getTotalBalance());
    }

    public double getTotalBalance() {
        double sum = 0;
        for (double d : accounts)
            sum += d;

        return sum;
    }
    public int getSize(){
        return accounts.length;
    }
}

