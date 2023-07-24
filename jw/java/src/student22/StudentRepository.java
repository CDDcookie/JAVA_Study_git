package student22;

import java.util.List;

public interface StudentRepository {

  void save(Student student);

  Student findById(int id);

  Student findByName(String name);

  List<Student> findAll();

  // 매개변수 height 보다 키큰 사람 찾기
  List<Student> upperHeight(int height);

  // 매개변수 weight보다 무게 적은 사람 찾기
  List<Student> underWeight(int weight);
}
