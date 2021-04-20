package bai;

public class Khoi {
    private String subject;
    private String subject1;
    private String subject2;
    private String name;

    public Khoi(String subject, String subject1, String subject2,String name) {
        this.subject = subject;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.name = name;
    }

    public Khoi() {
    }

    @Override
    public String toString() {
        return
                " Tên Khối : "+ name + '\'' +
                " Môn Thi 1 : " + subject + '\'' +
                ", Môn Thi 2 : " + subject1 + '\'' +
                ", Môn Thi 3 : " + subject2 + '\'';
    }
}
