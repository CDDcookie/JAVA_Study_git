package student22;

import java.util.List;

public class App {

  public static void main(String[] args) {

    StudentRepositoryImpl2 repo = new StudentRepositoryImpl2();
//    StudentRepositoryImpl.store
    Student student1 = new Student(1, "진우", 175, 75);
    Student student2 = new Student(2, "유범", 164, 70);
    Student student3 = new Student(3, "소희", 167, 55);
    Student student4 = new Student(4, "승철", 178, 80);
    Student student5 = new Student(5, "찬현", 173, 71);
    Student student6 = new Student(6, "효관", 177, 80);

    repo.save(student1);
    repo.save(student2);
    repo.save(student3);
    repo.save(student4);
    repo.save(student5);
    repo.save(student6);

//    Student byId = repo.findById(1);
//    System.out.println(byId);
//
//    Student byname = repo.findByName("진우");
//    System.out.println(byname);

    List<Student> all = repo.findAll();
    System.out.println(all);

    List bighight = repo.upperHeight(170);
    System.out.println(bighight);


  }

}
