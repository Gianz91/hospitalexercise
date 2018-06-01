package it.objectway.hospital.hospitalexercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ssn;

	@Column
	private String name;

	@Column
	private String address;

	@Column
	private String phone;

	@Column
	private Integer insuranceid;
	
	@Column
	private Integer pcp;

	public Patient() {
		super();
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getInsuranceid() {
		return insuranceid;
	}

	public void setInsuranceid(Integer insuranceid) {
		this.insuranceid = insuranceid;
	}

	public Integer getPcp() {
		return pcp;
	}

	public void setPcp(Integer pcp) {
		this.pcp = pcp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((insuranceid == null) ? 0 : insuranceid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pcp == null) ? 0 : pcp.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (insuranceid == null) {
			if (other.insuranceid != null)
				return false;
		} else if (!insuranceid.equals(other.insuranceid))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pcp == null) {
			if (other.pcp != null)
				return false;
		} else if (!pcp.equals(other.pcp))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [ssn=" + ssn + ", name=" + name + ", address=" + address + ", phone=" + phone + ", insuranceId="
				+ insuranceid + "]";
	}
	
}
