package student22;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

  public static List<Student> store = new ArrayList<>();
  //            조상  드러갈타입   객체명      자손

  @Override
  public void save(Student student) {
    store.add(student);
  }

  @Override
  public Student findById(int id) {
//    Object A = store.indexOf(id);
//    for (int i = 0; i < store.size(); i++) {
//        if(i == store.indexOf(id)){
//          System.out.println(store.get(i));
//        }else { }
//
//    }


//    for (int i = 0; i < store.size(); i++) {
//      if (store.get(i).getId() == id) {
//        return store.get(i);
//      }
//    }

    for (Student student : store) {
      if (student.getId() == id) {
        return student;
      }
    }
    return null;
  }

  @Override
  public Student findByName(String name) {
    for (int i = 0; i < store.size(); i++) {
      if (store.get(i).getName().equals(name)){
        return store.get(i);////
      }

    }

    return null;
  }

  @Override
  public List<Student> findAll() {
//    System.out.println(store.toArray());
    return store;
  }

  @Override
  public List<Student> upperHeight(int height) {
//    for (int i = 0; i < store.size(); i++) {
//      if(store.get(i).getHeight() >height){
//
//      }else{
//        continue;
//      }
//    }

    List<Student> list = new ArrayList<>();

    for(Student student : store){
      if(student.getHeight() > height){
        list.add(student);
      }
    }

    return list;
  }

  @Override
  public List<Student> underWeight(int weight) {
    return null;
  }
}
