vpackage com.example.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "universities")
public class University {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String country;
}