package assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien extends SinhVien implements Menu{
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> dSSinhVien;

    public DanhSachSinhVien() {
        dSSinhVien = new ArrayList<SinhVien>();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show studen");
        System.out.println("0. Exit.");
        System.out.println("Nhập lựa chọn của bạn: ");
        int n = sc.nextInt();
        if (n >= 0 && n <= 6){
            if (n == 1){
                System.out.println("Nhập id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tên: ");
                String name = sc.nextLine();
                System.out.println("Nhập tuổi: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập địa chỉ: ");
                String address = sc.nextLine();
                System.out.println("Nhập điểm trung bình: ");
                float gpa = sc.nextFloat();
                addStudent(id,name,age,address,gpa);
                menu();
            }else if(n == 2){
                editStudent(id);
                menu();
            }else if (n == 3){
                deleteStudent(id);
                menu();
            }else if (n == 4){
                sortStudentGPA();
                menu();
            }else if (n == 5){
                sortStudentName();
                menu();
            }else if (n == 6){
                showStudent();
                menu();
            }else if (n == 0){
                exit();
            }else {
                System.out.println("Nhập từ 0->6");
                menu();
            }
        }
    }

    @Override
    public void addStudent(int id, String name, int age, String address, float gpa) {
        for (SinhVien sv:dSSinhVien){
            if (sv.getId() == id){
                System.out.println("Đã có trong danh sách");
                menu();
                return;
            }
        }
        SinhVien sv = new SinhVien(id,name,age,address,gpa);
        dSSinhVien.add(sv);
    }

    @Override
    public void editStudent(int id) {
        System.out.println("Nhập số id của học sinh cần sửa: ");
        id = sc.nextInt();
        for (SinhVien sv:dSSinhVien){
            if (sv.getId() == id){
                sc.nextLine();
                System.out.println("Nhập tên: ");
                sv.setName(sc.nextLine());
                System.out.println("Nhập tuổi: ");
                sv.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập địa chỉ: ");
                sv.setAddress(sc.nextLine());
                System.out.println("Nhập điểm trung bình: ");
                sv.setGpa(sc.nextFloat());
                return;
            }
            System.out.println("Không có id trong danh sách");
        }
        System.out.println("Đã sửa");
    }

    @Override
    public void deleteStudent(int id) {
        System.out.println("Nhập id của học sinh cần xóa: ");
        id = sc.nextInt();
        for (SinhVien sv:dSSinhVien){
            if (sv.getId() == id){
                dSSinhVien.remove(sv);
                return;
            }
            System.out.println("Không có id trong danh sách");
        }
        System.out.println("Đã xóa");
    }

    @Override
    public void sortStudentGPA() {
        Collections.sort(dSSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getGpa().compareTo(o2.getGpa());
            }
        });
        System.out.println("Đã sắp xếp");
    }

    @Override
    public void sortStudentName() {
        Collections.sort(dSSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Đã sắp xếp");
    }

    @Override
    public void showStudent() {
        for (SinhVien sv:dSSinhVien){
            System.out.println("id: " + sv.getId());
            System.out.println("Tên: " + sv.getName());
            System.out.println("Tuổi: " + sv.getAge());
            System.out.println("Địa chỉ: " + sv.getAddress());
            System.out.println("Điểm TB: " + sv.getGpa());
        }
    }

    @Override
    public void exit() {
        System.out.println("End");
        return;
    }
}
