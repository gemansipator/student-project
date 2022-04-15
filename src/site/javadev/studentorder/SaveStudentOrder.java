package site.javadev.studentorder;

import site.javadev.studentorder.domain.other.Adult;
import site.javadev.studentorder.domain.StudentOrder;

public class SaveStudentOrder {  //сохранить заявление ученика (основной класс)

    public static void main(String[] args) {
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long ansfer = 199;
        System.out.println("saveStudentOrder: "   );
        return ansfer;
    }

    static StudentOrder buildStudentOrder(long id){  //временно функция
        // для возврата студенческой заявки.
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        Adult husband = new Adult("Васильев", "Андрей",
                "Петрович", null);

        return so;
    }
}
