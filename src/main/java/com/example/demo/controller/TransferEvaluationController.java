@RestController
@RequestMapping("/api/transfers")
public class TransferEvaluationController {

    private final TransferValidationService service;

    public TransferEvaluationController(TransferValidationService service) {
        this.service = service;
    }

    @PostMapping("/evaluate")
    public TransferEvaluationResponse evaluate(
            @RequestBody TransferEvaluationRequest req) {
        return service.evaluateTransfer(req);
    }
}
