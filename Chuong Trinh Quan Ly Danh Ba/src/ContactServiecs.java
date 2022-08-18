import java.util.ArrayList;
import java.util.List;

public class ContactServiecs {
    public final static String PATH = "data/contacts.csv";

    public ContactServiecs() {
        List<Contact> contacts = listContact();

    }

    public List<Contact> listContact() {
        List<Contact> contacts = new ArrayList<>();
        List<String> records = DataConvertUtlis.read(PATH);
        for (String recod : records) {
            contacts.add(Contact.parseContact(recod));
        }
        return contacts;
    }

    public void docDanhBa() {
        List<Contact> contacts = listContact();
        DataConvertUtlis.write(PATH, contacts);
    }

    public void luuDanhBa() {
        List<Contact> contacts = listContact();
        DataConvertUtlis.write(PATH, contacts);
    }

    public void inDanhSach() {
        List<Contact> contacts = listContact();
        for (Contact contact : contacts) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", contact.getDienThoai(), contact.getNhom(), contact.getHoTen(),
                    contact.getGioiTinh(), contact.getDiaChi());
        }
    }

    public void inDanhSachItem(Contact contact) {
        List<Contact> contacts = listContact();
        for (Contact item : contacts) {
            if (item.getDienThoai().equals(contact.getDienThoai())) {
                System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", item.getDienThoai(), item.getNhom(), item.getHoTen(),
                        item.getGioiTinh(), item.getDiaChi());
                break;
            }
        }
    }

    public void themMoi(Contact contact) {
        List<Contact> contacts = listContact();
        contacts.add(contact);
        DataConvertUtlis.write(PATH, contacts);
    }

    public void capNhap(Contact contact, String dienThoai, String nhom, String hoten, String gioiTinh, String diaChi, String ngaySinh, String email) {
        List<Contact> contacts = listContact();
        for (Contact item : contacts) {
            if (item.getDienThoai().equals(contact.getDienThoai())) {
                item.setDienThoai(dienThoai);
                item.setNhom(nhom);
                item.setHoTen(hoten);
                item.setGioiTinh(gioiTinh);
                item.setDiaChi(diaChi);
                item.setNgaySinh(ngaySinh);
                item.setEmail(email);

                DataConvertUtlis.write(PATH, contacts);
                break;
            }
        }
    }

    public boolean find(Contact contact) {
        List<Contact> contacts = listContact();
        return contacts.contains(contact);
    }

    public void remove(Contact contact) {
        List<Contact> contacts = listContact();
        contacts.remove(contact);
        DataConvertUtlis.write(PATH, contacts);
    }
}
