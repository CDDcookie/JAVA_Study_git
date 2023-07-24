package student22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryImpl2 implements StudentRepository{

  private static Map<Integer, Student> store = new HashMap<>();
  private static int id = 1;


  @Override
  public void save(Student student) {
    store.put(id++, student);
  }

  @Override
  public Student findById(int id) {
    for (Map.Entry<Integer, Student> byId: store.entrySet()) {
//      System.out.println("key: " + byId.getKey() + " value: " + byId.getValue());
      if(byId.getKey() == id){///???
        return (Student) byId;
      }
    }


    return null;

  }

  @Override
  public Student findByName(String name) {
    return null;
  }

  @Override
  public List<Student> findAll() {

    return (List<Student>)store ;///????
  }

  @Override
  public List<Student> upperHeight(int height) {
    return null;
  }

  @Override
  public List<Student> underWeight(int weight) {
    return null;
  }
}
