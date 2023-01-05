package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import stream.User;
import stream.UsersRepository;
import stream.homework.ForumStats;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    @Test
    public void shouldCountAverageOfPostsUsersOver40() {
        List<User> testList = UsersRepository.getUsersList();
        testList.add(new User("Name", 40, 11, "Group"));
        double test = ForumStats.averageOfPostsOver40(testList);
        assertEquals(4, test);

    }

    @Test
    public void shouldCountAverageOfPostsUsersUnder40() {
        List<User> testList = UsersRepository.getUsersList();
        testList.add(new User("Name", 35, 15, "Group"));
        double test = ForumStats.averageOfPostsUnder40(testList);
        assertEquals(1593.0,test);
    }

}
