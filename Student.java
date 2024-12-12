public class Student{
    private String name;
    private static int ID;
    private double GPA;
    private Teacher favoriteTeacher;
    private static int students;
    private static int Grade;
    private static double points;
    private String teacherName;
    private String teacherReason;

    public Student(String name){
        this.name = name;
        students++;
        ID = (students - 1);
    }

    //Getters

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }

    public double getGPA(){
        return GPA;
    }

    public void setFavoriteTeacher(Teacher teach){
        favoriteTeacher = teach;
        teacherName = teach.getName();
        teacherReason = teach.getReason();

    }

    public Teacher getFavoriteTeacher(){
        favoriteTeacher.setName(teacherName);
        favoriteTeacher.setReason(teacherReason);
        return favoriteTeacher;
    }

    //Methods(Statics)

    public static void addStudents(int number){
        students += number;
        ID = (students - 1);
    }

    public static int getStudentCount(){
        return students;
    }

    public void addGrade(int number){
        if(number <= 4){
            Grade++;
            points += (double)(number);
            GPA = points/Grade;
        }
    }

}