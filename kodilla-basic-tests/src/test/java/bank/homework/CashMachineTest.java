package bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTest {

    @Test
    public void powinnoBycZeroTransakcji() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.iloscTransakcjiWbankomatach());
    }

    @Test
    public void powinienDodacDwieTransakcje() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(1000.00);
        cashmachine.add(1500.00);
        assertEquals(2, cashmachine.iloscTransakcjiWbankomatach());

    }
    @Test
    public void wartoscBalance() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(1000.00);
        cashmachine.add(1500.00);
        assertEquals(2500, cashmachine.Balance());
    }
    @Test
    public void dodawanieTransakcjiDoValues() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(1000.00);
        cashmachine.add(1500.00);
        assertEquals(2,cashmachine.iloscTransakcjiWbankomatach());
    }
    @Test
    public void czyMozeBycTransakcjaZero() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(0.00);
        assertEquals(0,cashmachine.iloscTransakcjiWbankomatach());
    }
}





