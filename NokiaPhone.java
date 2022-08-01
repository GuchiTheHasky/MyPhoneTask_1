package MyPhone;

public class NokiaPhone extends Phone implements PhoneConnection {

    public NokiaPhone(String phoneName, String phoneModel, int memoryCapacity, int memoryRAM) {
        super(phoneName, phoneModel, memoryCapacity, memoryRAM);
    }


    @Override
    public String getCall() {
        return null;
    }

    @Override
    public String getMessage() {
        return " i can send a message.";
    }

}

