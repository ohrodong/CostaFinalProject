package com.costar.main.vo;

public class MemberVO {
	String memberId;
	String memberPw;
	String memberAddr;
	String memberTelNum;
	String memberCompanyNum;
	int memberAuthority;
	String memberArea;
	String memberGender;
	int memberBirthYear;
	String memberAddDate;//Date
	String memberUpdateDate;//Date
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String memberId, String memberPw, String memberAddr,
			String memberTelNum, String memberCompanyNum, int memberAuthority,
			String memberArea, String memberGender, int memberBirthYear,
			String memberAddDate, String memberUpdateDate) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberAddr = memberAddr;
		this.memberTelNum = memberTelNum;
		this.memberCompanyNum = memberCompanyNum;
		this.memberAuthority = memberAuthority;
		this.memberArea = memberArea;
		this.memberGender = memberGender;
		this.memberBirthYear = memberBirthYear;
		this.memberAddDate = memberAddDate;
		this.memberUpdateDate = memberUpdateDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberTelNum() {
		return memberTelNum;
	}
	public void setMemberTelNum(String memberTelNum) {
		this.memberTelNum = memberTelNum;
	}
	public String getMemberCompanyNum() {
		return memberCompanyNum;
	}
	public void setMemberCompanyNum(String memberCompanyNum) {
		this.memberCompanyNum = memberCompanyNum;
	}
	public int getMemberAuthority() {
		return memberAuthority;
	}
	public void setMemberAuthority(int memberAuthority) {
		this.memberAuthority = memberAuthority;
	}
	public String getMemberArea() {
		return memberArea;
	}
	public void setMemberArea(String memberArea) {
		this.memberArea = memberArea;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public int getMemberBirthYear() {
		return memberBirthYear;
	}
	public void setMemberBirthYear(int memberBirthYear) {
		this.memberBirthYear = memberBirthYear;
	}
	public String getMemberAddDate() {
		return memberAddDate;
	}
	public void setMemberAddDate(String memberAddDate) {
		this.memberAddDate = memberAddDate;
	}
	public String getMemberUpdateDate() {
		return memberUpdateDate;
	}
	public void setMemberUpdateDate(String memberUpdateDate) {
		this.memberUpdateDate = memberUpdateDate;
	}
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberPw=" + memberPw
				+ ", memberAddr=" + memberAddr + ", memberTelNum="
				+ memberTelNum + ", memberCompanyNum=" + memberCompanyNum
				+ ", memberAuthority=" + memberAuthority + ", memberArea="
				+ memberArea + ", memberGender=" + memberGender
				+ ", memberBirthYear=" + memberBirthYear + ", memberAddDate="
				+ memberAddDate + ", memberUpdateDate=" + memberUpdateDate
				+ "]";
	}
	
	
	
	
	
}
