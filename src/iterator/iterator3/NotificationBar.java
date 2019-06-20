package iterator.iterator3;

public class NotificationBar {
    NotifationCollection notifications;

    public NotificationBar(NotifationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        Iterator iterator = notifications.createIterator();

        System.out.println("-----NOTIFICATION BAR-----");

        while (iterator.hasNext()) {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
