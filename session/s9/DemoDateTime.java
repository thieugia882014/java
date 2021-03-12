package session.s9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoDateTime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now(); // ngày hôm nay
        System.out.println("Hôm nay là: " + ld);
        System.out.println("Ngày mai là: " + ld.plusDays(1));
        System.out.println("Ngày này năm sau là: " + ld.plusYears(1));

        System.out.println("Tháng trước là: " + ld.minusMonths(1));

        System.out.println("Tháng này là tháng: " + ld.getMonthValue());

        LocalDate k2x = LocalDate.parse("2002-10-30");
        System.out.println("Hôm đó là thứ: " + k2x.getDayOfWeek());
        System.out.println("Trong năm đó là ngày thứ: " + k2x.getDayOfYear());
        System.out.println("Năm: " + k2x.getYear());

        LocalDate k3 = LocalDate.of(2002,1,1);

        // dùng local date in ra danh sách các năm nhuận trong thế kỷ 21
        LocalDate kt = LocalDate.of(2001,12,31);
        System.out.println("Danh sách các năm nhuận: ");
        while (kt.getYear() < 2101){
            if (kt.getDayOfYear() == 366){
                System.out.println(kt.getYear() + "là năm nhuận");
            }
            kt = kt.plusYears(1);
        }

        LocalDate kt2 = LocalDate.parse("2001-02-28");
        System.out.println("Danh sách các năm nhuận: ");
        while (kt2.getYear() < 2101){
            if (kt2.plusDays(1).getDayOfMonth() == 29){
                System.out.println(kt2.getYear());
            }
            kt2 = kt2.plusYears(1);
        }

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Ngay lúc này: " + dt);
        System.out.println("Tí nữa: " + dt.plusHours(1));
        System.out.println("Tẹo nữa: " + dt.plusMinutes(15));
    }
}
