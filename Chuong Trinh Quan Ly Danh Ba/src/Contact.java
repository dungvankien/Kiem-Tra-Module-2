import java.util.Objects;

public class Contact {
    private String hoTen;
    private String dienThoai;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;
    private String nhom;

    public Contact() {
    }

    public Contact(String hoTen, String dienThoai, String gioiTinh, String diaChi, String ngaySinh, String email, String nhom) {
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.nhom = nhom;
    }

    public static Contact parseContact(String record) {
        String[] arrayContact = record.split(",");
        String hoTen = arrayContact[0];
        String dienThoai = arrayContact[1];
        String gioiTinh = arrayContact[2];
        String diaChi = arrayContact[3];
        String ngaySunh = arrayContact[4];
        String email = arrayContact[5];
        String nhom = arrayContact[6];
        return new Contact(hoTen, dienThoai, gioiTinh, diaChi, ngaySunh, email, nhom);
    }

    public String getHoTen() {
        return hoTen;
    }

    public Contact(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    @Override
    public String toString() {
        return hoTen +"," + dienThoai +"," + gioiTinh +","+ diaChi + "," + ngaySinh +"," +email + "," + nhom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(dienThoai, contact.dienThoai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dienThoai);
    }
}
