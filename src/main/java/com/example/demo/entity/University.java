@Entity
@Table(name = "universities")
public class University {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String country;
}
