package MyPhone;

public abstract class Phone {
    private String phoneName;
    private String phoneModel;
    private int memoryCapacity;
    private int memoryRAM;

    public Phone(String phoneName, String phoneModel, int memoryCapacity, int memoryRAM) {
        this.phoneName = phoneName;
        this.phoneModel = phoneModel;
        this.memoryCapacity = memoryCapacity;
        this.memoryRAM = memoryRAM;
    }

    String getPhoneInfo() {
        return phoneName + " " + phoneModel;
    }

    String getMemoryInfo() {
        return " and have a " + memoryRAM + " memory RAM.";
    }

    void setPhoneName(String phoneName) {
        if (phoneName.length() > 10) {
            this.phoneName = phoneName.substring(0, 10);
        } else {
            this.phoneName = phoneName;
        }
    }
    public String getPhoneName (String phoneName){
        return phoneName;
    }
    void setPhoneModel (String phoneModel){
        if (phoneModel.length()>20){
            this.phoneModel = phoneModel.substring(0, 20);
        } else {
            this.phoneModel = phoneModel;
        }
    }
    public String getPhoneModel (String phoneModel){
        return phoneModel;
    }
    void setMemoryCapacity (int memoryCapacity){
       this.memoryCapacity = memoryCapacity;
    }
    public int getMemoryCapacity( ){
        return memoryCapacity;}
    void setMemoryRAM (int memoryRAM){
        this.memoryRAM = memoryRAM;
    }
    public int getMemoryRAM (){
        return memoryRAM;
    }
    }
