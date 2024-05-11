package Java.studyobject;

public class ImmutableReference {
    private final String name;

    // 생성자
    public ImmutableReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 새로운 객체를 생성하여 반환.
    public ImmutableReference withName(String name) {
        return new ImmutableReference(name);
    }
    // final 키워드로 값의 변경이 불가능하여 해당 메서드 사용불가
/*    public void setName(String name) {
        this.name = name;
    }*/
}
