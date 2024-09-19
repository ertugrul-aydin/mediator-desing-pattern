package helpservice;

import room.ControlRoom;

public class Ambulance extends AbstractHelpService {
    public Ambulance(ControlRoom controlRoom, String code) {
        super(controlRoom);
        this.code = code;
        controlRoom.addHelpService(this);
    }

    @Override
    public void callHelpService(String helpServiceName, String address, String message) {
        controlRoom.callHelpService(helpServiceName, address, message, this);
    }

    @Override
    public void answerHelpService() {
        System.out.printf("\n %s got the message! \n ", getName() );
    }

    @Override
    public String getName() {
        return "Ambulance "  + code;
    }
}
