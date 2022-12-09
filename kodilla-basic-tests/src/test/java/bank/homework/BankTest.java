package bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void powinnoBycZeroBankomatow() {
        Bank bank = new Bank();
        assertEquals(0, bank.amountOfCashMachineAtCashMachines());
    }
    @Test
    public void powinienDodacCzteryBankomaty() {
        Bank bank = new Bank();
        bank.add(1);
        bank.add(2);
        bank.add(3);
        bank.add(4);
        assertEquals(4, bank.amountOfCashMachineAtCashMachines());

    }
    @Test
    public void BilansWszystkichBankomatów() {
        Bank bank = new Bank();
        bank.add(1000.00);
        bank.add(1500.00);
        bank.add(2000.00);
        bank.add(2500.00);
        assertEquals(7000, finalBalance());
    }
    @Test
    public void ŚredniaWpłat() {
        Bank bank = new Bank();
        bank.add(1000.00);
        bank.add(1500.00);
        bank.add(2000.00);
        bank.add(2500.00);
        assertEquals(1750, averageDeposit(), 0.01);
    }
}
