   package com.seoulcheckin.app.school.vo;

public class SchoolVO {
	private int schoolNumber;
	private String schoolName;
	private String schoolTeacherName;
	private String schoolPhone;
	private String schoolAddress;
	private String schoolTime;
	private String schoolIntroduce;
	private String schoolOpeningDate;
	private String schoolClosingDate;
	private String schoolPhoto;
	private int schoolLimitCount;
	private String schoolStatus;
	
	public SchoolVO() {;}

	public int getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolTeacherName() {
		return schoolTeacherName;
	}

	public void setSchoolTeacherName(String schoolTeacherName) {
		this.schoolTeacherName = schoolTeacherName;
	}

	public String getSchoolPhone() {
		return schoolPhone;
	}

	public void setSchoolPhone(String schoolPhone) {
		this.schoolPhone = schoolPhone;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolTime() {
		return schoolTime;
	}

	public void setSchoolTime(String schoolTime) {
		this.schoolTime = schoolTime;
	}

	public String getSchoolIntroduce() {
		return schoolIntroduce;
	}

	public void setSchoolIntroduce(String schoolIntroduce) {
		this.schoolIntroduce = schoolIntroduce;
	}

	public String getSchoolOpeningDate() {
		return schoolOpeningDate;
	}

	public void setSchoolOpeningDate(String schoolOpeningDate) {
		this.schoolOpeningDate = schoolOpeningDate;
	}

	public String getSchoolClosingDate() {
		return schoolClosingDate;
	}

	public void setSchoolClosingDate(String schoolClosingDate) {
		this.schoolClosingDate = schoolClosingDate;
	}

	public String getSchoolPhoto() {
		return schoolPhoto;
	}

	public void setSchoolPhoto(String schoolPhoto) {
		this.schoolPhoto = schoolPhoto;
	}

	public int getSchoolLimitCount() {
		return schoolLimitCount;
	}

	public void setSchoolLimitCount(int schoolLimitCount) {
		this.schoolLimitCount = schoolLimitCount;
	}

	public String getSchoolStatus() {
		return schoolStatus;
	}

	public void setSchoolStatus(String schoolStatus) {
		this.schoolStatus = schoolStatus;
	}

	@Override
	public String toString() {
		return "SchoolVO [schoolNumber=" + schoolNumber + ", schoolName=" + schoolName + ", schoolTeacherName="
				+ schoolTeacherName + ", schoolPhone=" + schoolPhone + ", schoolAddress=" + schoolAddress
				+ ", schoolTime=" + schoolTime + ", schoolIntroduce=" + schoolIntroduce + ", schoolOpeningDate="
				+ schoolOpeningDate + ", schoolClosingDate=" + schoolClosingDate + ", schoolPhoto=" + schoolPhoto
				+ ", schoolLimitCount=" + schoolLimitCount + ", schoolStatus=" + schoolStatus + "]";
	}
}
