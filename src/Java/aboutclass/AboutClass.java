package Java.aboutclass;

public class AboutClass {
    public static void main(String[] args) {
        // 인스턴스 : student1 메모리 상에 올라가는 객체
 /*       Student student1 = new Student();
        System.out.println(student1.id);

        Student student2 = new Student(1, "A", 30, "Java");
        Student student3 = new Student(2, "B", 20, "Spring");
        System.out.println(student2);
        System.out.println(student3);
        student2.eatLunch(); // A는 먹는중
        student3.eatLunch(); // B는 먹는중

        student2=student3; // 2에 3을 덮어쓴다.
        student2.eatLunch(); // B는 먹는중*/

        Car bmw = new Car("red", "BMW", 300, 0, "gasoline");
        Car audi = new Car("red", "AUDI", 300, 0, "diesel");

        // 객체 안을 보지 않고도 객체의 기능(행동)을 파악할 수 있으면 객체지향적으로 짰다고 한다.
        bmw.accelerate();
        bmw.accelerate();
        bmw.parking();
        bmw.fillUp();
        audi.fillUp();
    }
}
