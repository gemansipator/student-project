package site.javadev.studentorder;

import site.javadev.studentorder.domain.StudentOrder;

public class SaveStudentOrder {  //сохранить заявление ученика (основной класс)

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.sethFirstName("Алексей");
        so.sethLastName("Петров");
        so.setwFirstName("Галина");
        so.setwLastName("Петрова");




        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long ansfer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.gethLastName());
        return ansfer;
    }
}
