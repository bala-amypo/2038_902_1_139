public interface CourseRepository extends JpaRepository<Course, Long> {
java.util.Optional<Course> findByCodeIgnoreCase(String code);
}