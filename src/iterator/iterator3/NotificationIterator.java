package iterator.iterator3;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;
    int postion = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if(postion >= notificationList.length || notificationList[postion] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification = notificationList[postion];
        postion += 1;
        return notification;
    }
}
