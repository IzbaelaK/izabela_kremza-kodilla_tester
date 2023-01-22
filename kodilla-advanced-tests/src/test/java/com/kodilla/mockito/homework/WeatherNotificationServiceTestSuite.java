package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import com.kodilla.notification.homework.WeatherNotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherNotificationServiceTestSuite {
    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        WeatherNotificationService weathernotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);

        weathernotificationService.sendNotification(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        WeatherNotificationService weathernotificationService = new WeatherNotificationService();
        Client firstClient = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        weathernotificationService.addSubscriber(firstClient);
        weathernotificationService.addSubscriber(secondClient);
        weathernotificationService.addSubscriber(thirdClient);
        Notification notification = Mockito.mock(Notification.class);

        weathernotificationService.sendNotification(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        WeatherNotificationService weathernotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        weathernotificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);
        weathernotificationService.removeSubscriber(client);

        weathernotificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
    @Test
    public void notificationShouldBeSentToAllLocationSubscribedClients () {
        WeatherNotificationService weathernotificationService = new WeatherNotificationService();
        Client oneLocation = Mockito.mock(Client.class);
        Client twoLocation = Mockito.mock(Client.class);
        Client threeLocation = Mockito.mock(Client.class);
        weathernotificationService.addLocation("oneLocation");
        weathernotificationService.addLocation("twoLocation");
        weathernotificationService.addLocation("threeLocation");
        Notification notification = Mockito.mock(Notification.class);

        weathernotificationService.sendNotification(notification);
        Mockito.verify(oneLocation, Mockito.times(1)).receive(notification);
        Mockito.verify(twoLocation, Mockito.times(1)).receive(notification);
        Mockito.verify(threeLocation, Mockito.times(1)).receive(notification);
    }
    @Test
    public void shouldOnlySendOneNotificationToAllClients() {
        WeatherNotificationService weathernotificationService = new WeatherNotificationService();
        Client client = Mockito.mock(Client.class);
        weathernotificationService.addSubscriber(client);
        weathernotificationService.addSubscriber(client);
        weathernotificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);

        weathernotificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

}
