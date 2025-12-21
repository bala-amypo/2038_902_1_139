@Entity
@Table(name = "programs")
public class Program {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private University university;

    private String name;
    private String level;
}
