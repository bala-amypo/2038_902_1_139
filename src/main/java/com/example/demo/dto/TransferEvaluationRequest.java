public class TransferEvaluationRequest {
    private Long sourceProgramId;
    private Long targetProgramId;
    private List<CourseDTO> completedCourses;

    public static class CourseDTO {
        public String code;
        public Double credits;
        public String grade;
    }
}
