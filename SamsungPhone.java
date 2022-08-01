package MyPhone;

public class SamsungPhone extends Phone implements PhoneMedia, PhoneConnection {
    public SamsungPhone(String phoneName, String phoneModel, int memoryCapacity, int memoryRAM) {
        super(phoneName, phoneModel, memoryCapacity, memoryRAM);
    }

    @Override
    public String getCall() {
        return null;
    }

    @Override
    public String getPhoto() {
        return " , take a pictures";
    }

    @Override
    public String getVideo() {
        return null;
    }
    public String getMessage() {
        return " i can send a message";
    }}

