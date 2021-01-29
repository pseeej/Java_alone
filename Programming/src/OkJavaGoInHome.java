import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;


public class OkJavaGoInHome {
    public static void main(String[] args) {

        String id = "JAVA APT 507";

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

    }
}
