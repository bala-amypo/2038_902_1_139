@Entity
@Table(name = "transfer_requests")
public class TransferRequest {
    @Id @GeneratedValue
    private Long id;

    private String studentId;

    @ManyToOne
    private Program sourceProgram;

    @ManyToOne
    private Program targetProgram;

    private String status;
}
