package pas.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Table(name = "departments")
public class Department {
    @Id
    private Integer id = null;

    private String name = null;

    private Integer parent_id = null;

    private String description = null;

    private String created_at = null;

    private String updated_at = null;

    public Integer getId() {
        return id;
    }

    // private Set<Department> departmentSet = new HashSet<Department>();

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

//    public Set<Department> getDepartmentSet() {
//        return departmentSet;
//    }
//
//    public void setDepartmentSet(Set<Department> departmentSet) {
//        this.departmentSet = departmentSet;
//    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent_id=" + parent_id +
                ", description='" + description + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}
