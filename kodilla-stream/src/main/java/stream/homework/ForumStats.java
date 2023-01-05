package stream.homework;

import stream.User;
import stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double averageOfPostsOver40(List <User> userList) {
        double average = userList
                .stream()
                .filter(x -> x.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }

        public static double averageOfPostsUnder40(List <User> userList) {
            double average = userList
                    .stream()
                    .filter(x -> x.getAge() < 40)
                    .mapToInt(n -> n.getNumberOfPost())
                    .average()
                    .getAsDouble();
            return average;
    }
}
