package com.kodilla.bank.homework;

public class CashMachine {
    private double[] values;

    public CashMachine() {
        this.values = new double[0];

    }

    public double[] getValues() {
        return values;
    }

    public int iloscTransakcjiWbankomatach() {
        return values.length;
    }

    public void add(double value) {
        if (value !=0) {
            double[] newTab = new double[this.values.length+1];
            System.arraycopy(values, 0, newTab, 0, values.length);
            newTab[values.length - 1] = value;
            this.values = newTab;
        }
    }

    public double Balance(){
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }
    public double sumWithdrawal(){
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0);
            sum += this.values[i];
    }
        return sum;
    }

    public double sumDepositl(){
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0);
            sum += this.values[i];
        }
        return sum;
    }
    public int amountOfWithdrawal(){
        int amount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0);
            amount ++;
        }
        return amount;
    }
    public int amountOfDeposit(){
        int amount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0);
            amount ++;
        }
        return amount;
    }

}




