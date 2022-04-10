package site.javadev.studentorder;

import site.javadev.studentorder.domain.other.Adult;
import site.javadev.studentorder.domain.StudentOrder;

public class SaveStudentOrder {  //сохранить заявление ученика (основной класс)

    public static void main(String[] args) {
        buildStudentOrder();

//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);

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
//        husband.setGivenName("Андрей");
//        husband.setSurName("Петров");
//        husband.setPassportNumber("123456");
//        so.setHusband(husband);
//
//        String ans = husband.getPersonString();
//        System.out.println(ans);



        return so;
    }
}
