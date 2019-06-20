package iterator.iterator3;

public class Main {

    public static void main(String[] args) {
        NotifationCollection nc = new NotifationCollection();
        NotificationBar nb = new NotificationBar(nc);

        nb.printNotifications();
    }
}
