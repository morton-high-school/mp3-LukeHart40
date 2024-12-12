public class Teacher{
    private String teacherName;
    private String teacherReason;

    public Teacher(String name, String reason){
        this.teacherName = name;
        this.teacherReason = reason;
    }

    //Getters

    public String getName(){
        return teacherName;
    }

    public String getReason(){
        return teacherReason;
    }

    //Setters

    public void setName(String name){
        this.teacherName = name;
    }

    public void setReason(String reason){
        this.teacherReason = reason;
    }
}