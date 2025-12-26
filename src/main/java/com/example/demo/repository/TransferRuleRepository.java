public interface TransferRuleRepository {
    Optional<TransferRule> findById(Long id);
    List<TransferRule> findBySourceUniversityIdAndTargetUniversityIdAndActiveTrue(Long s, Long t);
    TransferRule save(TransferRule r);
}
