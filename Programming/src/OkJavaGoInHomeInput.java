import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.*;

public class OkJavaGoInHomeInput {

    //args는 parameter, 매개변수
    //Edit Configurations에서 argument 미리 입력해두면 args에 그 값이 들어감
    public static void main(String[] args) {

        //String id = JOptionPane.showInputDialog("Enter a ID");    //popup창 뜨면서 입력할 수 있게 함. 입력 받을 때까지 아래 코드 실행 멈춤
        //String bright = JOptionPane.showInputDialog("Enter a bright level");

        String id = args[0];
        String bright = args[1];    //이렇게 해두면 argument로 받은 값 하나씩 대입 가능

        // Elevator call
        Elevator myElevator = new Elevator(id); //Elevator은 myElevator의 data type
        myElevator.callForUp(1);    //나 올라갈 거니깐 1층으로 엘리베이터 보내

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();   //나 들어갈 거니깐 보안 꺼

        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");   //자바 507호의 홀 램프 의미
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+" / Floor Lamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright)); //setBright라는 method갖고 있는데 이건 double형태의 데이터 필요함. Double.parseDouble로 데이터 형변환
        moodLamp.on();
    }
}
