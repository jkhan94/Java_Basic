package Java.aboutclass;

public class Student {
    public Integer id;
    private String name;
    private Integer age;
    private String major;

    // this.필드명 = 파라미터
    public Student(Integer id, String name, Integer age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Student() {
        this.id = 1;
    }
    
    public void eatLunch(){
        System.out.println(name+"은 밥 먹는 중");
    }
}

