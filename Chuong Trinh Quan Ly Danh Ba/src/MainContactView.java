import java.util.Scanner;

public class MainContactView {
    static Scanner input = new Scanner(System.in);
    static ContactServiecs contactServiecs = new ContactServiecs();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        String luaChon;
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println("1. Xem danh sách\n" +
                "2. Thêm mới\n" +
                "3. Cập nhật\n" +
                "4. Xóa\n" +
                "5. Tìm kiếm\n" +
                "6. Đọc từ file\n" +
                "7. Ghi vào file\n" +
                "8. Thoát");
        do {
            System.out.println("Chọn chức năng:");
            luaChon = input.nextLine();
            switch (luaChon) {
                case "1":
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Số điện thoại", "Nhóm", "Họ tên",
                            "Giới Tính", "Địa Chỉ\n");
                    contactServiecs.inDanhSach();
                    break;
                case "2":
                    themMoiView();
                    break;
                case "3":
                    capNhap();
                    break;
                case "4":
                    xoaDanhBa();
                    break;
                case "5":
                    timKiem();
                    break;
                case "6":
                    docDanhBa();
                    break;
                case "7":
                    luuDanhBa();
                    break;
                case "8":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập đúng chức năng");
            }
        } while (!luaChon.equals("8"));
    }

    public static void themMoiView() {
        String dienThoai;
        String nhom;
        String hoTen;
        String gioiTinh;
        String diaChi;
        String ngaySinh;
        String email;
        do {
            System.out.println("Nhập số điện thoại: ");
            dienThoai = input.nextLine();
            if (ValidateUtils.isPhoneVaild(dienThoai)) {
                break;
            } else {
                System.out.println("Nhập lại đúng số điện thoại: ");
            }
        } while (true);
        System.out.println("Nhập Nhóm danh bạ");
        nhom = input.nextLine();
        System.out.println("Nhập Họ và Tên");
        hoTen = input.nextLine();
        System.out.println("Nhập giới tính");
        gioiTinh = input.nextLine();
        System.out.println("Nhập địa chỉ");
        diaChi = input.nextLine();
        System.out.println("Nhập ngày Sinh");
        ngaySinh = input.nextLine();
        do {
            System.out.println("Nhâp Email: ");
            email = input.nextLine().toLowerCase();
            if (ValidateUtils.isEmailVaild(email)) {
                break;
            } else {
                System.out.println("Nhập lại đúng email: ");
            }
        } while (true);
        Contact contact = new Contact(hoTen, dienThoai, gioiTinh, diaChi, ngaySinh, email, nhom);
        contactServiecs.themMoi(contact);

    }

    public static void docDanhBa() {
        System.out.println("Chọn 'Y' để đọc danh bạ nhưng mất bộ nhớ củ\n" +
                "Chọn N để quay lại ban đầu:");
        String luaChon = input.nextLine().toLowerCase();
        if (luaChon.equals("y")) {
            contactServiecs.docDanhBa();
        }
        if (luaChon.equals("n")) {
            menu();
        } else {
            System.out.println("Chọn đúng lựa chọn");
        }

    }

    public static void luuDanhBa() {
        System.out.println("Chọn 'Y' để luu danh bạ xuống file\n" +
                "Chọn N để quay lại ban đầu:");
        String luaChon = input.nextLine().toLowerCase();
        if (luaChon.equals("y")) {
            contactServiecs.luuDanhBa();
        }
        if (luaChon.equals("n")) {
            menu();
        } else {
            System.out.println("Chọn đúng lựa chọn");
        }
    }

    public static void capNhap() {
        String dienThoaiUpdate;
        String nhom, hoten, gioiTinh, diaChi, ngaySinh, email;
        System.out.println("Nhập số điện thoại cần chỉnh");
        String dienThoaiEdit = input.nextLine();
        Contact contact = new Contact(dienThoaiEdit);
        if (contactServiecs.find(contact)) {
            System.out.println("Nhập nhóm");
            nhom = input.nextLine();
            System.out.println("Nhập họ tên");
            hoten = input.nextLine();
            System.out.println("nhâp giói tính");
            gioiTinh = input.nextLine();
            System.out.println("nhập địa chỉ");
            diaChi = input.nextLine();
            System.out.println("Nhập ngày sinh");
            ngaySinh = input.nextLine();
            do {
                System.out.println("Nhâp Email: ");
                email = input.nextLine().toLowerCase();
                if (ValidateUtils.isEmailVaild(email)) {
                    break;
                } else {
                    System.out.println("Nhập lại đúng email: ");
                }
            } while (true);
            do {
                System.out.println("Nhập số điện thoại: ");
                dienThoaiUpdate = input.nextLine();
                if (ValidateUtils.isPhoneVaild(dienThoaiUpdate)) {
                    break;
                } else {
                    System.out.println("Nhập lại đúng số điện thoại: ");
                }
            } while (true);
            contactServiecs.capNhap(contact, dienThoaiUpdate, nhom, hoten, gioiTinh, diaChi, ngaySinh, email);
            System.out.println("Thông tin đã được cập nhập");
        } else {
            System.out.println("Không tồn tại trong danh bạn");
        }
    }

    public static void xoaDanhBa() {
        String dienThoai;
        do {
            System.out.println("Nhập Số điện thoại cần xóa trong danh bạ");
            dienThoai = input.nextLine();
            if (ValidateUtils.isPhoneVaild(dienThoai)) {
                break;
            } else {
                System.out.println("Nhập lại đúng số điện thoại: ");
            }
        } while (true);
        Contact contact = new Contact(dienThoai);
        if (contactServiecs.find(contact)) {
            contactServiecs.remove(contact);
        } else {
            System.out.println("Không tồn tại trong danh bạn");
        }
    }

    public static void timKiem() {
        String dienThoai;
        System.out.println("Nhập số điện thoại cần tìm danh bạ");
        dienThoai = input.nextLine();
        Contact contact = new Contact(dienThoai);
        if (contactServiecs.find(contact)) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Số điện thoại", "Nhóm", "Họ tên",
                    "Giới Tính", "Địa Chỉ\n");
            contactServiecs.inDanhSachItem(contact);
        } else {
            System.out.println("Không có trong danh bạ");
        }
    }
}
