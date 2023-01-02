package stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> olderUsersFrom(int age) {
        List<User> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return usernames;
    }
    public static List<User> theNumberOfPosts(int numberOfPost) {
        List<User> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPost)
                .collect(Collectors.toList());
        return usernames;
    }
}


