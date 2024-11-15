public class Student{
    private String name;
    private static int ID;
    private double GPA;
    private Teacher favoriteTeacher;
    private static int students;
    private static int Grade;
    private static int points;

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

    public Teacher getFavoriteTeacher(){
        return favoriteTeacher;
    }

    //Setters

    public void setFavoriteTeacher(Teacher favoriteTeacher){
        this.favoriteTeacher = favoriteTeacher;
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
            this.Grade++;
            points += number;
            this.GPA = points/this.Grade;
        }
    }

}