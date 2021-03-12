package tuan ;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tuan> list = new ArrayList<Tuan>();

        list.add(new Tuan(" Tuan beo 1", "qn 1", "abc1"));
        list.add(new Tuan(" Tuan beo 2", "qn 2", "abc2"));
        list.add(new Tuan(" Tuan beo 3", "qn 3", "abc3"));
        list.add(new Tuan(" Tuan beo 4", "qn 4", "abc4"));
        list.add(new Tuan(" Tuan beo 5", "qn 5", "abc5"));
        list.add(new Tuan(" Tuan beo 6", "qn 6", "abc6"));
        list.add(new Tuan(" Tuan beo 7", "qn 7", "abc7"));
        list.add(new Tuan(" Tuan beo 8", "qn 8", "abc8"));
        list.add(new Tuan(" Tuan beo 9", "qn 9", "abc9"));
        list.add(new Tuan(" Tuan beo 10", "qn 10", "abc10"));


        System.out.println("Danh sách khách sạn :");
        for (Tuan h : list) {
            System.out.println("-" + h.getName() + "-" + h.getLocation() + "-" + h.getOwnerName());
        }


    }
}
