import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Wrocław");
        //then
        List<Flight> flightsFrom = new ArrayList<>();
        flightsFrom.add(new Flight("Wrocław", "Warszawa"));
        flightsFrom.add(new Flight("Wrocław", "Katowice"));
        flightsFrom.add(new Flight("Wrocław", "Poznań"));
        assertEquals(flightsFrom, result);

    }

}
