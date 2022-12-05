package bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.testng.annotations.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CashMachineTest {

    @Test
    public void powinnoBycZeroTransakcji() {
        CashMachine cashMachine = new CashMachine();
        double[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void powinienDodacDwieTransakcje() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.add(1000.00);
        cashmachine.add(1500.00);


        double[] values = cashmachine.getValues();
        assertEquals(2, values.length);
        assertEquals(1000.00, values[0]);
        assertEquals(1500.00, values[1]);
    }
}





