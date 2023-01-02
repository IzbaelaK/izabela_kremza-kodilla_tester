import org.junit.jupiter.api.Test;
import stream.User;
import stream.UsersManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {
    private List<String> result;
    private List<String> usernames;

    @Test
    public void UsersManagerGroupChemists() {
        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();
        //then
        List<String> usernames = new ArrayList<>();
        usernames.add("Walter White");
        usernames.add("Gale Boetticher");
        assertEquals(usernames, result);
    }

    @Test
    public void UsersOlder() {
        //when
        List<User> result = UsersManager.olderUsersFrom(35);
        //then
        List<User> usernames = new ArrayList<>();
        usernames.add(new User("Walter White", 50, 7, "Chemists"));
        usernames.add(new User("Gus Firing", 49, 0, "Board"));
        usernames.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        usernames.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(usernames, result);
    }
    @Test
    public void theNumberOfUsersPosts() {
        //when
        List<User> result = UsersManager.theNumberOfPosts(1);
        //then
        List<User> usernames = new ArrayList<>();
        usernames.add(new User("Walter White", 50, 7, "Chemists"));
        usernames.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        usernames.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        usernames.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        assertEquals(usernames, result);
    }
}
