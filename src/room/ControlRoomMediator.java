package room;

import helpservice.AbstractHelpService;


public interface ControlRoomMediator {
    void callHelpService(String helpServiceName, String address, String message, AbstractHelpService helpService);
    void addHelpService(AbstractHelpService helpService);
    void printHelpServiceList();
}
