@Service
public class TransferValidationServiceImpl implements TransferValidationService {

    public TransferEvaluationResponse evaluateTransfer(TransferEvaluationRequest req) {

        if (req.getSourceProgramId() == null || req.getTargetProgramId() == null)
            throw new ResourceNotFoundException("Program");

        double credits = 0;
        for (var c : req.getCompletedCourses()) {
            if (c.credits <= 0)
                throw new BadRequestException("Invalid credits");
            credits += c.credits;
        }

        TransferEvaluationResponse res = new TransferEvaluationResponse();
        res.setTotalTransferableCredits(credits);
        res.setStatus("APPROVED");
        res.setRemarks("Transfer successful");

        return res;
    }
}
