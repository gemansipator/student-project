package site.javadev;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long ansfer = 199;

        System.out.println("saveStudentOrder: " + studentOrder.hFirstName);
        return ansfer;
    }
}
