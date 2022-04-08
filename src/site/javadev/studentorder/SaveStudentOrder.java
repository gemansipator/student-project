package site.javadev.studentorder;

import site.javadev.studentorder.domain.Adult;
import site.javadev.studentorder.domain.StudentOrder;

public class SaveStudentOrder {  //сохранить заявление ученика (основной класс)

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();





        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long ansfer = 199;
        System.out.println("saveStudentOrder: "   );
        return ansfer;
    }

    static StudentOrder buildStudentOrder(){  //временно функция
        // для возврата студенческой заявки.
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Андрей");
        so.setHusband(husband);

        return so;
    }
}
