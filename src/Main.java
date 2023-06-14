public class Main {
    public static void main(String[] args) {
        int speed = 40;
        int gear = 1;
        int weight = 40;
        int tSpeed = 40;
        int newSpeed = Bicycle.speedUp(40, 10);
        int artanHiz = newSpeed - tSpeed;
        tSpeed = newSpeed;
        System.out.println("Hız " + artanHiz + "km/s artırıldı");
        System.out.println("Toplam Hız: " + tSpeed + "km/s");
        int newGear = Bicycle.gearUp(1, 1);
        System.out.println("Vites: " + newGear);
        int newWeight = Bicycle.addedWeight(40, 50);
        System.out.println("Ağırlık: " + newWeight +"kg");


    }
}