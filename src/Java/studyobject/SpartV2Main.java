package Java.studyobject;

public class SpartV2Main {
    public static void main(String[] args) {
        ImmutableReference reference = new ImmutableReference("황원욱");
        SpartaV2 sparta1 = new SpartaV2("1", reference);
        SpartaV2 sparta2 = new SpartaV2("2", reference);
        SpartaV2 sparta3 = new SpartaV2("3", reference);

        // sparta 인스턴스가 가지고 있는 Reference 객체의 값 출력
        System.out.println("------- 인스턴스에 저장된 객체 값 확인 -------");
        System.out.println("sparta1.referenceName = " + sparta1.getImmutableReference().getName());
        System.out.println("sparta2.referenceName = " + sparta2.getImmutableReference().getName());

        // sparta2의 Reference에 저장된 값 변경 불가
//        sparta2.getReference().setName("홍정기");
        // 새로운 "홍정기" 이름의 불변 객체 생성
        ImmutableReference reference2 = new ImmutableReference("홍정기");
        ImmutableReference reference3 = reference2.withName("withName");
        // SpartaV2 클래스의 인스턴스인 sparta2의 reference 필드는 set으로 변경 가능
        // 단, reference의 값을 바꾸고 싶다면 새 불변객체를 생성해서 sparta2의 setter를 통해 바꿔줘야 함.
        sparta2.setReference(reference2);
        sparta3.setReference(reference3);

        System.out.println("------- 변경 후 값 확인 -------");
        System.out.println("sparta1.referenceName = " + sparta1.getImmutableReference().getName());
        System.out.println("sparta2.referenceName = " + sparta2.getImmutableReference().getName());
        System.out.println("sparta3.referenceName = " + sparta3.getImmutableReference().getName());
    }
}
/*
------- 인스턴스에 저장된 객체 값 확인 -------
sparta1.referenceName = 황원욱
sparta2.referenceName = 황원욱
------- 변경 후 값 확인 -------
sparta1.referenceName = 황원욱
sparta2.referenceName = 홍정기
sparta3.referenceName = withName
*/