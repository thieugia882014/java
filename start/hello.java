package start;

public class hello {
    public static void main(String[] args) {
//        System.out.printf("Hello Java \n");
//        int x;
//        x = 10;
//        if (x > 5){
//            System.out.printf(x + " là số dương \n");
//        }else{
//            System.out.printf(x + " <= 5 \n");
//        }
//        for (int i = 0; i < 10; i++){
//            System.out.printf("\n i= " +i);
//        }
        Student st ; // khai báo 1 biến có kiểu dữ liệu là start.Student
        st = new Student(); // tạo đối tượng -> st sẽ có một ô nhớ
        Student st2 = new Student();
        st.name = "Nguyen Van An";
        st2.name = "Le Manh Dung";
        st.run();
        st2.run();
    }
}
