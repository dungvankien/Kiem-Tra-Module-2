public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("1234", "Honda", "2022", 20000.0, "xanh", 0, "12", "v6");
        vehicles[1] = new Motorbike("12345", "zamaha", "2000", 201000, "Do", 1, "110CC");
        vehicles[2] = new Truck("12345678", "samsung", "1997", 2500000, "vang", 2, 6);
        vehicles[0].showMe();
        for (Vehicle item : vehicles) {
            if (item instanceof Car) {
                item.dopNhienLieu();
                ((Car) item).moCuaSoTroi();
                item.showMe();
            } else if (item instanceof Motorbike) {
                item.dopNhienLieu();
                ((Motorbike) item).bocDau();
            } else if (item instanceof Truck) {
                item.dopNhienLieu();
                ((Truck) item).goHang();
            }
        }
    }
}
