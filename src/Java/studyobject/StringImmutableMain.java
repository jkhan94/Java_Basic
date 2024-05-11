package Java.studyobject;

public class StringImmutableMain {
    public static void main(String[] args) {
        String exam = "한글";
        exam.concat("만세");
        System.out.println(exam); // 한글

        String exam1 = "한글";
        exam1 = exam1.concat("만세");
        System.out.println(exam1); // 한글만세
    }
}
