package bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void shouldHaveZeroCashMachines() {
        Bank bank = new Bank();
        assertEquals(0, bank.amountOfCashMachineAtCashMachines());
    }

    @Test
    public void shouldAddTwoCashMachines() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        assertEquals(2, bank.amountOfCashMachineAtCashMachines());

    }

    @Test
    public void sumOfDepositsFromAllCashMachines () {
        double sumCashMachine1;
        double sumCashMachine2;
        double sum;

        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addTransactionToCashMachine(1000.00);
        bank.addTransactionToCashMachine(1500.00);
        sumCashMachine1 = bank.finalBalance();

        bank.addCashMachine(cashMachine2);
        bank.addTransactionToCashMachine(2000.00);
        bank.addTransactionToCashMachine(2500.00);
        sumCashMachine2 = bank.finalBalance();

        sum = sumCashMachine1 + sumCashMachine2;

        assertEquals(9500.00, sum);
    }

    @Test
    public void sumOfWithdrawalFromAllCashMachines () {

        double sumCashMachine1;
        double sumCashMachine2;
        double sum;

        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addTransactionToCashMachine(500.00);
        bank.addTransactionToCashMachine(700.00);
        sumCashMachine1 = bank.amountOfWithdrawal();

        bank.addCashMachine(cashMachine2);
        bank.addTransactionToCashMachine(900.00);
        bank.addTransactionToCashMachine(1100.00);
        sumCashMachine2 = bank.amountOfWithdrawal();

        sum = sumCashMachine1 + sumCashMachine2;

        assertEquals(6.0, sum);
    }
    @Test
    public void shouldCalculateTheAverageDeposit() {
        double sumCashMachine1;
        double sumCashMachine2;
        double sum;

        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addTransactionToCashMachine(1000.00);
        bank.addTransactionToCashMachine(1500.00);
        sumCashMachine1 = bank.amountOfDeposit();

        bank.addCashMachine(cashMachine2);
        bank.addTransactionToCashMachine(2000.00);
        bank.addTransactionToCashMachine(2500.00);
        sumCashMachine2 = bank.amountOfDeposit();

        sum = sumCashMachine1 + sumCashMachine2;

        assertEquals(4.0, bank.averageDeposit(), 0.01);
    }
    @Test
    public void shouldCalculateTheAverageWithdrawal() {
        double sumCashMachine1;
        double sumCashMachine2;
        double sum;

        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addTransactionToCashMachine(500.00);
        bank.addTransactionToCashMachine(700.00);
        sumCashMachine1 = bank.amountOfWithdrawal();

        bank.addCashMachine(cashMachine2);
        bank.addTransactionToCashMachine(900.00);
        bank.addTransactionToCashMachine(1100.00);
        sumCashMachine2 = bank.amountOfWithdrawal();

        sum = sumCashMachine1 + sumCashMachine2;

        assertEquals(300, bank.averageWithdrawal(), 0.01);
    }
    @Test
    public void amountOfDepositAllCashMachines() {
        double sumCashMachine1;
        double sumCashMachine2;
        double sum;

        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addTransactionToCashMachine(1);
        bank.addTransactionToCashMachine(2);
        sumCashMachine1 = bank.amountOfDeposit();

        bank.addCashMachine(cashMachine2);
        bank.addTransactionToCashMachine(1);
        bank.addTransactionToCashMachine(2);
        sumCashMachine2 = bank.amountOfDeposit();

        sum = sumCashMachine1 + sumCashMachine2;

        assertEquals(4, bank.countOfTransactionAtAllCashMachines());

    }
    @Test
    public void amountOfWithdrawalAllCashMachines() {
        double sumCashMachine1;
        double sumCashMachine2;
        double sum;

        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addTransactionToCashMachine(1);
        bank.addTransactionToCashMachine(2);
        sumCashMachine1 = bank.amountOfWithdrawal();

        bank.addCashMachine(cashMachine2);
        bank.addTransactionToCashMachine(1);
        bank.addTransactionToCashMachine(2);
        sumCashMachine2 = bank.amountOfWithdrawal();

        sum = sumCashMachine1 + sumCashMachine2;

        assertEquals(4, bank.countOfTransactionAtAllCashMachines());

    }
}