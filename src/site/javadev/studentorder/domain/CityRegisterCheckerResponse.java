package site.javadev.studentorder.domain;

public class CityRegisterCheckerResponse { // типа ответы
    private boolean existint;   // существует такой человек или нет
    private Boolean temporal = null; //так как Boolean в отличии от boolean
    // является объектом в итоге, то значение переменной может быть null
    // по сути называется КЛАСС ОБЕРТКА;


    public boolean isExistint() {
        return existint;
    }

    public void setExistint(boolean existint) {
        this.existint = existint;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }
}
