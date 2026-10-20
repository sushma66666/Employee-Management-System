package employee_management;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Isse database me automatic table ban jayegi
public class Employee {

    @Id // Isse yeh ID column primary key banega
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatic ID badhne ke liye (1,2,3...)
    private Long id;
    
    private String name;
    private String email;
    private String designation;

    // --- GETTERS AND SETTERS ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
}

