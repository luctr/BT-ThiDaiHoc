package bai;

public class ThiSinh {
    private String name;
    private  int age;
    private String address;
    private int identificationNumber;
    private Khoi khoi;

    public ThiSinh() {
    }

    public Khoi getKhoi(Khoi a) {
        return khoi;
    }

    public void setKhoi(Khoi khoi) {
        this.khoi = khoi;
    }

    public ThiSinh(String name, int age, String address, int identificationNumber, Khoi khoi) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.identificationNumber = identificationNumber;
        this.khoi = khoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return
                " Tên : " + name +
                ", Tuổi : " + age +
                ", Địa Chỉ : " + address +
                ", Số Báo Danh : " + identificationNumber +
                ", Khối : " + khoi ;
    }
}
