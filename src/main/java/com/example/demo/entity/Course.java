@Entity
@Table(name = "courses")
public class Course {
    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String code;

    private String title;
    private Double credits;
}
