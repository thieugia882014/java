package labs6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<PhoneNum> phoneList;

    public PhoneBook() {
        phoneList = new ArrayList<PhoneNum>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNum p:phoneList){
            if (p.getName().equals(name)){
                if (!p.getPhone().contains(phone)){
                    p.addPhone(phone);
                }
                return;
            }
        }
        PhoneNum p = new PhoneNum(name,phone);
        phoneList.add(p);
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNum p:phoneList){
            if (p.getName().equals(name)){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneNum p:phoneList){
            if (p.getName().equals(name)){
                p.addPhone(newPhone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNum p:phoneList){
            if (p.getName().equals(name)){
                System.out.println("Đã tìm thấy");
                return;
            }
        }
        System.out.println("KHông có trong danh bạ");
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNum>() {
            @Override
            public int compare(PhoneNum o1, PhoneNum o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void hienThi(){
        System.out.println("Danh bạ: ");
        for (PhoneNum p:phoneList){
            System.out.println(p.getName());
            for (String s:p.getPhone()){
                System.out.println(s);
            }
        }
    }
}
