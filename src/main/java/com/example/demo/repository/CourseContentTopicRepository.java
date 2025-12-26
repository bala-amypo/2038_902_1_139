public interface CourseContentTopicRepository {
    Optional<CourseContentTopic> findById(Long id);
    List<CourseContentTopic> findByCourseId(Long courseId);
    CourseContentTopic save(CourseContentTopic t);
}
