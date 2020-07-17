class User {
	private String firstName;
	private String lastName;

	public User() {
		this.firstName = "";
		this.lastName = "";
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName != null ? firstName : "";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName != null ? lastName : "";
	}

	public String getFullName() {
		if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
			return "Unknown";
		}
		var res = "";
		if (!this.firstName.isEmpty()) {
			res = firstName;
		}
		if (!this.lastName.isEmpty()) {
			if (!res.equals("")) {
				res += " ";
			}
			res += lastName;
		}
		return res;
	}
}