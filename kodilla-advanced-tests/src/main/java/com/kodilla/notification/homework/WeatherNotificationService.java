package com.kodilla.notification.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.LocationNotification;
import com.kodilla.notification.Notification;

import javax.xml.stream.Location;
import java.util.HashSet;
import java.util.Set;

public class WeatherNotificationService {
    private Client client;
    private String location;

    private Set<Client> clients = new HashSet<>();
    private Set<Location> locations = new HashSet<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }
    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
        this.locations.forEach(location -> client.receive(notification));
    }

    public void addLocation(String location) {
        this.location = location;

    }
    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
    public void removeLocation(String location) {
        this.locations.remove(location);
    }
}