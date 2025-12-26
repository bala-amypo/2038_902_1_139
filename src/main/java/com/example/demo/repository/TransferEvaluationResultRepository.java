public interface TransferEvaluationResultRepository {
    Optional<TransferEvaluationResult> findById(Long id);
    List<TransferEvaluationResult> findBySourceCourseId(Long id);
    TransferEvaluationResult save(TransferEvaluationResult r);
}
