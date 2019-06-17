package iterator.iterator1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {

            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
    }
}
