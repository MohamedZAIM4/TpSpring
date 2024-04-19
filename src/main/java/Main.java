import model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        // Initialiser le contexte Spring
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Récupérer le bean StudentService à partir du contexte
        StudentService studentService = context.getBean(StudentService.class);

        // Utiliser les méthodes du StudentService
        // Par exemple, pour créer un étudiant
        studentService.createStudent(new Student(1, "Mohamed Zaim"));

        // Pour trouver un étudiant par ID
        Student student = studentService.findStudentById(1);
        System.out.println("Student found: " + student);

        // Pour afficher tous les étudiants
        studentService.displayAllStudents();
    }
}
