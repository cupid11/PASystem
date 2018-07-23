package pas.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
public class User {
	@Id

	private Long id;

	private String name = null;

	private String sex = null;

	private String address = null;

	private String email = null;

	private String postcode = null;

	private String description = null;

	private String birth_date = null;

	private String created_at = null;

	private String updated_at = null;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				", postcode='" + postcode + '\'' +
				", description='" + description + '\'' +
				", birth_day='" + birth_date + '\'' +
				", created_at='" + created_at + '\'' +
				", updated_at='" + updated_at + '\'' +
				'}';
	}
}
