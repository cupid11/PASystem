package pas.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
public class User {
	@Id
	private Integer id = null;

	private String name = null;

	private String gender = null;

	private Integer age = null;

	private String birthdate = null;

	private String address = null;

	private String email = null;

	private String entry_time = null;

	private String description = null;

	private Integer direct_manger_id = null;

	private Integer indirect_manger_id = null;

	private Integer department_id = null;

	private String created_at = null;

	private String updated_at = null;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(String entry_time) {
		this.entry_time = entry_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDirect_manger_id() {
		return direct_manger_id;
	}

	public void setDirect_manger_id(Integer direct_manger_id) {
		this.direct_manger_id = direct_manger_id;
	}

	public Integer getIndirect_manger_id() {
		return indirect_manger_id;
	}

	public void setIndirect_manger_id(Integer indirect_manger_id) {
		this.indirect_manger_id = indirect_manger_id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
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

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				", birthdate='" + birthdate + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				", entry_time='" + entry_time + '\'' +
				", description='" + description + '\'' +
				", direct_manger_id=" + direct_manger_id +
				", indirect_manger_id=" + indirect_manger_id +
				", department_id=" + department_id +
				", created_at='" + created_at + '\'' +
				", updated_at='" + updated_at + '\'' +
				'}';
	}
}
