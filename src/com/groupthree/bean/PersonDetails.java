package com.groupthree.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="Person")
public class PersonDetails {
		@Id
		@Column(name = "PID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int pId;
		@Column(name = "PERSON_NAME")
		private String personName;
		@Column(name = "PERSON_PHONENO")
		private long personPhoneNo;
		
		

		public PersonDetails() {
			
		}

		public PersonDetails(int pId) {
			super();
			this.pId = pId;
		}

		public PersonDetails(String personName, long personPhoneNo) {
			super();
			this.personName = personName;
			this.personPhoneNo = personPhoneNo;
		}

		public int getpId() {
			return pId;
		}

		public void setpId(int pId) {
			this.pId = pId;
		}

		public String getPersonName() {
			return personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		public long getPersonPhoneNo() {
			return personPhoneNo;
		}

		public void setPersonPhoneNo(long personPhoneNo) {
			this.personPhoneNo = personPhoneNo;
		}

		@Override
		public String toString() {
			return "PersonDetails [pId=" + pId + ", personName=" + personName + ", personPhoneNo=" + personPhoneNo
					+ "]";
		}
}
