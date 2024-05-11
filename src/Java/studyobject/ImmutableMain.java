package Java.studyobject;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableReference reference1 = new ImmutableReference("황원욱");
        ImmutableReference reference2 = reference1;
        // stack 영역에 주소값이 저장된다.

        // 변경 불가
//        reference2.setName("홍정기");
    }

}
