package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public void CashMachine() {
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashmachine) {
        CashMachine[] newTab = new CashMachine[this.cashMachines.length + 1];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[newTab.length - 1] = cashmachine;
        this.cashMachines = newTab;
    }

    public void addTransactionToCashMachine(double transaction) {
        if (cashMachines.length != 0)
            cashMachines[cashMachines.length - 1].add(transaction);

    }

    public double finalBalance() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + this.cashMachines[i].Balance();
        }
        return sum;
    }

    public int amountOfDeposit() {
        int count = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            count = count + this.cashMachines[i].amountOfDeposit();
        }
        return count;
    }

    public int amountOfWithdrawal() {
        int count = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            count = count + this.cashMachines[i].amountOfWithdrawal();
        }
        return count;
    }

    public double averageDeposit() {
        double sum = 0;
        int amountOfDeposit = amountOfDeposit();
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + this.cashMachines[i].sumDeposit();
            if (amountOfDeposit != 0) {
                return this.cashMachines[i].sumDeposit() / amountOfDeposit();
            }
        }
        return sum;
    }

    public double averageWithdrawal() {
        double sum = 0;
        int amountOfWithdrawal = amountOfWithdrawal();
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + this.cashMachines[i].sumWithdrawal();
            if (amountOfWithdrawal != 0) {
                return this.cashMachines[i].sumWithdrawal() / amountOfWithdrawal();
            }
        }
        return sum;
    }

    public int amountOfCashMachineAtCashMachines() {
        return cashMachines.length;
    }

    public int amountOfCashMachineAtAllCashMachines() {
        int count = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            count = count + this.cashMachines[i].iloscTransakcjiWbankomatach();
        }
        return count;
    }
}