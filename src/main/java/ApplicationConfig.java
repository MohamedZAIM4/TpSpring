import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.InMemoryStudentRepository;
import repository.StudentRepository;
import service.StudentService;
import service.StudentServiceImpl;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}
