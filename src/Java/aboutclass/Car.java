package Java.aboutclass;

public class Car {
    // 객체의 필드는 객체 안에서 관리되어야 함.
    // 객체의 기능을 다른 객체에게 알려주는 건 가능하지만, 다른 객첵가 관리(변경, 삽입 등을)해선 안 된다.
    private String color;
    private String brand;
    private double maxSpeed;
    private double currentSpeed;
    private String fuelType;

    // 생성자 빼먹지 말 것.
    public Car(String color) {
    }

    public Car(String color, String brand, double maxSpeed, double currentSpeed, String fuelType) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.fuelType = fuelType;
    }

    public void accelerate() {
        this.currentSpeed++;
    }

    public void brake() {
        this.currentSpeed--;
    }

    public void parking() {
        this.currentSpeed = 0;
    }

    public void fillUp() {
        if (fuelType.equals("gasoline")) {
            System.out.println("휘발유를 주입합니다.");
        } else if (fuelType.equals("diesel")){
            System.out.println("경유를 주입합니다.");
        }
    }
}
