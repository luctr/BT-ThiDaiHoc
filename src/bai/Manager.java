package bai;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<ThiSinh> arrayList = new ArrayList();

    public Manager(ArrayList<ThiSinh> arrayList) {
        this.arrayList = arrayList;
    }

    public Manager() {

    }

    public ArrayList<ThiSinh> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<ThiSinh> arrayList) {
        this.arrayList = arrayList;
    }

    public void Menu() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát khỏi chương trình");
            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    moreContestants(arrayList);
                    break;
                case 2:
                    disPlay();
                    break;
                case 3:
                    searchSBD();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void moreContestants(ArrayList<ThiSinh> arrayList) {
        ThiSinh thiSinh = new ThiSinh();
        Khoi A = new Khoi(" Toán ", " Lý ", " Hóa ", " Khối A ");
        Khoi B = new Khoi(" Toán ", " Hóa ", " Sinh ", " Khối B ");
        Khoi C = new Khoi(" Văn ", " Sử ", " Địa ", " Khối C ");
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = new Scanner(System.in).nextLine();
        thiSinh.setName(name);
        System.out.println("Nhập tuổi :");
        Integer age = new Scanner(System.in).nextInt();
        thiSinh.setAge(age);
        System.out.println("Nhập địa chỉ :");
        String address = new Scanner(System.in).nextLine();
        thiSinh.setAddress(address);
        System.out.println("Nhập số báo danh :");
        Integer sbd = new Scanner(System.in).nextInt();
        thiSinh.setIdentificationNumber(sbd);
        System.out.println("Nhập khối thi: \n 1. Khối A : Toán, Lý, Hoá \n 2. Khối B : Toán, Hoá, Sinh \n 3. Văn, Sử, Địa");
        int number = new Scanner(System.in).nextInt();

        switch (number) {
            case 1:
                thiSinh.setKhoi(A);
                break;
            case 2:
                thiSinh.setKhoi(B);
                break;
            case 3:
                thiSinh.setKhoi(C);
                break;
        }
        arrayList.add(thiSinh);
    }

    public void disPlay() {
        for (ThiSinh t : arrayList
        ) {
            System.out.println(t);
        }
    }

    public void searchSBD() {
        System.out.println(" Nhập Số Báo Danh Cần Tìm :");
        Scanner sc = new Scanner(System.in);
        int SBD = sc.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getIdentificationNumber()==SBD){
                System.out.println(getArrayList().get(i));
            }else{
                System.out.println(" Không có SBD thích hợp");
            }
        }
    }
}
