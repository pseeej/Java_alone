import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {   //throws로 예외상황 처리

        //Instance 사용해서 하는 거. 이거 수행하고 나면 txt파일 두 개 생성되고 지정된 내용 안에 입력됨
        //p1, p2는 instance로 각자의 상태를 가지고 있음
        //Constructor 있는 건 이걸 이용해서 instance 만드는 게 가능하다는 의미
        PrintWriter p1 = new PrintWriter("result1.txt");    //file 내용 쓰기
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();

        //Instance 사용 X. class에 직접 write하는 방식. 이거 코드 안 돌아감 그냥 예시로 ㅇㅇ
        //일회용. 아주 잠깐 사용하는 건 class에 직접 할 수 있으나, 동시에 여러 개의 파일을 이용하거나 할 땐 하나의 클래스 이용하기보단 new 붙여서 각각의 instance 만드는 게 좋음
        //PrintWriter.write("result1.txt", "Hello 1");
    }
}
