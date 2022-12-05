package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashmachine;

    public void CashMachine() {
        this.cashmachine = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashmachine) {
        CashMachine[] newTab = new CashMachine[this.cashmachine.length + 1];
        System.arraycopy(cashmachine, 0, newTab, 0, cashmachine.length);
        newTab[newTab.length - 1] = cashmachine;
        this.cashmachine = newTab;
    }

    public void addTransactionToCashMachine(double transaction) {
        if (cashmachine.length != 0)
        cashmachine[cashmachine.length - 1].add(transaction);

    }


}