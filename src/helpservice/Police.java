package helpservice;

import room.ControlRoom;



public class Police extends AbstractHelpService {
    public Police(ControlRoom controlRoom, String code) {
        super(controlRoom);
        this.code = code;
        controlRoom.addHelpService(this);
    }

    @Override
    public void callHelpService(String helpServiceQuestion, String address, String message) {
        controlRoom.callHelpService(helpServiceQuestion, address, message, this);
    }

    @Override
    public void answerHelpService() {
        System.out.printf("\n %s got the message! \n ", getName() );
    }

    @Override
    public String getName() {
        return "Police "  + code;
    }
}