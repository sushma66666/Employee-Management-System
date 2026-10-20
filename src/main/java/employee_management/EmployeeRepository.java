package employee_management;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Yahan kuch bhi likhne ki jarurat nahi hai! 
    // Spring Boot automatic saare database functions (Save, Delete, Update) khud bana dega.
}

