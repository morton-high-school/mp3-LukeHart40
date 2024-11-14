public class Student{
    private String name;
    private static int ID;
    private double GPA;
    private Teacher favoriteTeacher;
    private static int students;

    public Student(String name){
        this.name = name;
        students++;
        ID = (students -1);
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

    //Methods

    public static void addStudents(int students){
        this.students += students;
    }

    public static int getStudentCount(){
        return students;
    }

    public void addGrade(int number){

    }

}