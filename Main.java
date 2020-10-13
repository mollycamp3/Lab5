import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();

    ArrayList<Double> GPAs = new
    ArrayList<Double>();
    double sum =0;

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engingeering");
    GPAs.add(student1.gpa);

    student2.name ="Molly Campbell";
    student2.gpa = 4.3;
    student2.major = "Marketing & Information Systems";
    GPAs.add(student2.gpa);

    for(double i : GPAs) {
      sum = sum + i;
    }
    student1.print();
    student2.print();
    System.out.println ("The average GPA is "+ sum/GPAs.size());

  }
}