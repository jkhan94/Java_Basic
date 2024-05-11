package Java;// 240503 자바 보충반 특강

/* for, while문은 동일. 실행시간도 거의 비슷.
 그러나 for는 횟수를 정하고 반복. 코드를 보지 않아도 몇 번 반복하는지 알 수 있음.
 while은 얼마나 반복할 지 알 수 없음. 코드를 보고 해석해야 몇 번 반복하는지 알 수 있음.
 기능 차이보단 가독성 차이일 듯. 개발자들이 보기에 for문은 반복횟수가 명확하지만 while은 코드를 파악해야 알 수 있음.
 그래서 while을 많이 쓰면 안 된다는 건가 봄. 그리고 코드들에서도 while 조건에 true로 주는 거고. 그러면 break 같은 것만 찾으면 되니까.
 그리고 코드 안에 주석을 쓰지 않는 편이므로 제어문을 잘 골라서 써야 의도 파악이 쉬워짐.
 */

/* 계산기
1. 모든 입력을 n번만 받고 내가 원하는 입력이 아니면 예외 발생시킨다 -> for문
2. 입력이 제대로 들어올 때까지 계속 입력받는다. -> while문
*/
public class LoopStatement {
    public static void main(String[] args) {
        int i = 0;

        for (i = 0; i < 5; ) {
            System.out.println(i);
            i++;
        }

        i=0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
