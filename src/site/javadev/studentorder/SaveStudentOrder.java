package site.javadev.studentorder;

import site.javadev.studentorder.domain.StudentOrder;

public class SaveStudentOrder {  //сохранить заявление ученика (основной класс)

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";



        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long ansfer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hLastName);
        return ansfer;
    }
}
