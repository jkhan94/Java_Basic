package Java.studyobject;

public class SpartaV2 {
    private String id;
    // 불변 객체 사용
    private ImmutableReference reference;

    public SpartaV2(String id, ImmutableReference reference) {
        this.id = id;
        this.reference = reference;
    }

    public ImmutableReference getImmutableReference() {
        return reference;
    }

    // 상수(static final)이 아니므로 setter 사용 가능.
    public void setReference(ImmutableReference reference) {
        this.reference = reference;
    }
}
