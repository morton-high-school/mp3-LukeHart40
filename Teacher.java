public class Teacher{
    public String name;
    public String reason;

    public Teacher(String name, String reason){
        this.name = name;
        this.reason = reason;
    }

    //Getters

    public String getName(){
        return name;
    }

    public String getReason(){
        return reason;
    }

    //Setters

    public void setName(String name){
        this.name = name;
    }

    public void setReason(String reason){
        this.reason = reason;
    }
}