package Java.studyobject;

public class PrimitiveType {
    public static void main(String[] args) {
        int primitive1 = 1;
        // 1이라는 값 자체를 복사한다.
        int primitive2 = primitive1;

        System.out.println("primitive1 = " + primitive1);
        System.out.println("primitive2 = " + primitive2);

        // primitive2의 값 자체를 2로 변경한다.
        primitive2 = 2;
        System.out.println("------- 값 변경 -------");

        System.out.println("primitive1 = " + primitive1);
        System.out.println("primitive2 = " + primitive2);
    }
}

// 출력결과
/*
primitive1 = 1
primitive2 = 1
------- 값 변경 -------
primitive1 = 1
primitive2 = 2
*/

