package Java.studyobject;

public class ReferenceMain {
    public static void main(String[] args) {

        ReferenceType reference1 = new ReferenceType("황원욱");
        ReferenceType reference2 = reference1; // reference1, 2는 같은 객체.

        // 주소값 저장 확인
        System.out.println("------- 주소값 확인 -------");
        System.out.println("reference1 address = " + reference1);
        System.out.println("reference2 address = " + reference2);

        // 값 확인
        System.out.println("------- 값 확인 -------");
        System.out.println("reference1 = " + reference1.getName());
        System.out.println("reference2 = " + reference2.getName());

        // 변경
        reference2.setName("홍정기");
        System.out.println("------- 값 변경 -------");

        // 값 확인
        System.out.println("reference1 = " + reference1.getName());
        System.out.println("reference2 = " + reference2.getName());
    }
}

// 출력결과
/*
------- 주소값 확인 -------
reference1 address = Java.studyobject.ReferenceType@6d311334
reference2 address = Java.studyobject.ReferenceType@6d311334
------- 값 확인 -------
reference1 = 황원욱
reference2 = 황원욱
------- 값 변경 -------
reference1 = 홍정기
reference2 = 홍정기
*/

