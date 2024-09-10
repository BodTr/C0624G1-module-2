package com.lession_21.notification_factory;

public class NotificationFactory {
    public Notification createNotification( String chanel) {
        if (chanel == null || chanel.isEmpty()) {
            return null;
        } else {
            switch (chanel) {
                case "SMS":
                    break;
            }
            return null;
        }
    }
}
