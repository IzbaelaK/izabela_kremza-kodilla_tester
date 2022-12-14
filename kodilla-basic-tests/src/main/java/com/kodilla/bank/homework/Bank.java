package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank() {
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
        if (amountOfDeposit != 0)

            for (int i = 0; i < cashMachines.length; i++) {
                sum += this.cashMachines[i].amountOfDeposit();
                {
                    return sum / amountOfDeposit();
                }
            }
        return sum;
    }

        public double averageWithdrawal () {
            double sum = 0;
            int amountOfWithdrawal = amountOfWithdrawal();
            if (amountOfWithdrawal != 0)

                for (int i = 0; i < cashMachines.length; i++) {
                    sum += this.cashMachines[i].sumWithdrawal();
                    {
                        return sum / amountOfWithdrawal();
                    }
                }
            return sum;
        }

        public int amountOfCashMachineAtCashMachines () {
            return cashMachines.length;
        }

        public int countOfTransactionAtAllCashMachines () {
            int count = 0;
            for (int i = 0; i < cashMachines.length; i++) {
                count = count + this.cashMachines[i].iloscTransakcjiWbankomatach();
            }
            return count;
        }
    }

