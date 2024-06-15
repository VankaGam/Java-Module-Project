import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("Введите название машины №1:");
        String nameCar = scanner.next();
        while(true){
            System.out.println("Введите скорость машины " + nameCar+" :");
            int speedCar = scanner.nextInt();
            Car car = new Car(nameCar, speedCar);
            if(car.speed>0&&car.speed<251){
                cars.add(car);
                System.out.println(car.name + " подходит! Она проедет "+ leMan(car.speed) +" за 24 часа.");
                break;
            }else{
                System.out.println("Машина не подходит на гонку допускаются машины со скоростью до 250 км/ч. Попробуйте еще раз, так как скорость "+ car.name +" = "+ car.speed +" км/ч.");
            }
        }
        System.out.println("Введите название машины №2:");
        String nameCar2 = scanner.next();
        while(true){
            System.out.println("Введите скорость машины "+ nameCar2);
            int speedCar2 = scanner.nextInt();
            Car car2 = new Car(nameCar2, speedCar2);
            if(car2.speed>0&&car2.speed<251){
                cars.add(car2);
                System.out.println(car2.name + " подходит! Она проедет "+ leMan(car2.speed) +" км за 24 часа.");
                break;
            }else{
                System.out.println("Машина не подходит на гонку допускаются машины со скоростью до 250 км/ч. Попробуйте еще раз, так как скорость "+ car2.name +" = "+ car2.speed +" км/ч.");
            }
        }
        System.out.println("Введите название машины №3:");
        String nameCar3 = scanner.next();
        while(true){
            System.out.println("Введите скорость машины "+ nameCar3);
            int speedCar3 = scanner.nextInt();
            Car car3 = new Car(nameCar3, speedCar3);
            if(car3.speed>0&&car3.speed<251){
                cars.add(car3);
                System.out.println(car3.name + " подходит! Она проедет "+ leMan(car3.speed) +" км за 24 часа.");
                break;
            }else{
                System.out.println("Машина не подходит на гонку допускаются машины со скоростью до 250 км/ч. Попробуйте еще раз, так как скорость "+ car3.name +" = "+ car3.speed +" км/ч.");
            }
        }
        if(cars.get(0).speed>cars.get(1).speed&&cars.get(0).speed>cars.get(2).speed){
            System.out.println("Самая быстрая машина: " + cars.get(0).name);
        }else if(cars.get(1).speed>cars.get(0).speed&&cars.get(1).speed>cars.get(2).speed){
            System.out.println("Самая быстрая машина: " + cars.get(1).name);
        }else if(cars.get(2).speed>cars.get(0).speed&&cars.get(2).speed>cars.get(1).speed){
            System.out.println("Самая быстрая машина: " + cars.get(2).name);
        }else if(cars.get(0).speed==cars.get(1).speed&&cars.get(0).speed>cars.get(2).speed){
            System.out.println("Самые быстрые машины: " + cars.get(0).name+", "+cars.get(1).name);
        }else if(cars.get(1).speed==cars.get(2).speed&&cars.get(1).speed>cars.get(0).speed) {
            System.out.println("Самые быстрые машины: " + cars.get(1).name + ", " + cars.get(2).name);
        }else if(cars.get(0).speed==cars.get(2).speed&&cars.get(1).speed>cars.get(1).speed) {
            System.out.println("Самые быстрые машины: " + cars.get(0).name + ", " + cars.get(2).name);
        } else{
            System.out.println("Все машины финишируют одинаково");
        }
    }
    public static int leMan(int speeds){
        int speedCar = speeds*24;
        return speedCar;
    }
}
class Car{
    String name;
    int speed;
    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
}
