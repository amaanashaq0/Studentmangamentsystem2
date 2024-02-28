package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Students.Student;
public interface StudentRepository extends JpaRepository<Student, Long>{

}