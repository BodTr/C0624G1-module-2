package com.lession_21.notification_factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification...");
    }
}
