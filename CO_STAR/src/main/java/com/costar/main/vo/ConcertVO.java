package com.costar.main.vo;


public class ConcertVO {
	String concertId;
	String concertName;
	String concertStartDate;//Date
	String concertEndDate;//Date
	String concertFirstGenre;
	String concertHall;
	String concertArea;
	String concertWebSite;
	String concertViewAge;
	String concertRunningTime;
	String concertNotice;
	String concertCompany;
	String concertActors;
	String concertWriteTime;//Date
	String concertUpdateTime;//Date
	String concertAverageRating;
	int concertHits;
	int concertCommentCount;
	
	MemberVO memberVO;

	public ConcertVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcertVO(String concertId, String concertName,
			String concertStartDate, String concertEndDate,
			String concertFirstGenre, String concertHall, String concertArea,
			String concertWebSite, String concertViewAge,
			String concertRunningTime, String concertNotice,
			String concertCompany, String concertActors,
			String concertWriteTime, String concertUpdateTime,
			String concertAverageRating, int concertHits, int concertCommentCount,
			MemberVO memberVO) {
		super();
		this.concertId = concertId;
		this.concertName = concertName;
		this.concertStartDate = concertStartDate;
		this.concertEndDate = concertEndDate;
		this.concertFirstGenre = concertFirstGenre;
		this.concertHall = concertHall;
		this.concertArea = concertArea;
		this.concertWebSite = concertWebSite;
		this.concertViewAge = concertViewAge;
		this.concertRunningTime = concertRunningTime;
		this.concertNotice = concertNotice;
		this.concertCompany = concertCompany;
		this.concertActors = concertActors;
		this.concertWriteTime = concertWriteTime;
		this.concertUpdateTime = concertUpdateTime;
		this.concertAverageRating = concertAverageRating;
		this.concertHits = concertHits;
		this.concertCommentCount = concertCommentCount;
		this.memberVO = memberVO;
	}

	public String getConcertId() {
		return concertId;
	}

	public void setConcertId(String concertId) {
		this.concertId = concertId;
	}

	public String getConcertName() {
		return concertName;
	}

	public void setConcertName(String concertName) {
		this.concertName = concertName;
	}

	public String getConcertStartDate() {
		return concertStartDate;
	}

	public void setConcertStartDate(String concertStartDate) {
		this.concertStartDate = concertStartDate;
	}

	public String getConcertEndDate() {
		return concertEndDate;
	}

	public void setConcertEndDate(String concertEndDate) {
		this.concertEndDate = concertEndDate;
	}

	public String getConcertFirstGenre() {
		return concertFirstGenre;
	}

	public void setConcertFirstGenre(String concertFirstGenre) {
		this.concertFirstGenre = concertFirstGenre;
	}

	public String getConcertHall() {
		return concertHall;
	}

	public void setConcertHall(String concertHall) {
		this.concertHall = concertHall;
	}

	public String getConcertArea() {
		return concertArea;
	}

	public void setConcertArea(String concertArea) {
		this.concertArea = concertArea;
	}

	public String getConcertWebSite() {
		return concertWebSite;
	}

	public void setConcertWebSite(String concertWebSite) {
		this.concertWebSite = concertWebSite;
	}

	public String getConcertViewAge() {
		return concertViewAge;
	}

	public void setConcertViewAge(String concertViewAge) {
		this.concertViewAge = concertViewAge;
	}

	public String getConcertRunningTime() {
		return concertRunningTime;
	}

	public void setConcertRunningTime(String concertRunningTime) {
		this.concertRunningTime = concertRunningTime;
	}

	public String getConcertNotice() {
		return concertNotice;
	}

	public void setConcertNotice(String concertNotice) {
		this.concertNotice = concertNotice;
	}

	public String getConcertCompany() {
		return concertCompany;
	}

	public void setConcertCompany(String concertCompany) {
		this.concertCompany = concertCompany;
	}

	public String getConcertActors() {
		return concertActors;
	}

	public void setConcertActors(String concertActors) {
		this.concertActors = concertActors;
	}

	public String getConcertWriteTime() {
		return concertWriteTime;
	}

	public void setConcertWriteTime(String concertWriteTime) {
		this.concertWriteTime = concertWriteTime;
	}

	public String getConcertUpdateTime() {
		return concertUpdateTime;
	}

	public void setConcertUpdateTime(String concertUpdateTime) {
		this.concertUpdateTime = concertUpdateTime;
	}

	public String getConcertAverageRating() {
		return concertAverageRating;
	}

	public void setConcertAverageRating(String concertAverageRating) {
		this.concertAverageRating = concertAverageRating;
	}

	public int getConcertHits() {
		return concertHits;
	}

	public void setConcertHits(int concertHits) {
		this.concertHits = concertHits;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	public int getConcertCommentCount() {
		return concertCommentCount;
	}

	public void setConcertCommentCount(int concertCommentCount) {
		this.concertCommentCount = concertCommentCount;
	}

	@Override
	public String toString() {
		return "ConcertVO [concertId=" + concertId + ", concertName="
				+ concertName + ", concertStartDate=" + concertStartDate
				+ ", concertEndDate=" + concertEndDate + ", concertFirstGenre="
				+ concertFirstGenre + ", concertHall=" + concertHall
				+ ", concertArea=" + concertArea + ", concertWebSite="
				+ concertWebSite + ", concertViewAge=" + concertViewAge
				+ ", concertRunningTime=" + concertRunningTime
				+ ", concertNotice=" + concertNotice + ", concertCompany="
				+ concertCompany + ", concertActors=" + concertActors
				+ ", concertWriteTime=" + concertWriteTime
				+ ", concertUpdateTime=" + concertUpdateTime
				+ ", concertAverageRating=" + concertAverageRating
				+ ", concertHits=" + concertHits + ", concertCommentCount="
				+ concertCommentCount + ", memberVO=" + memberVO + "]";
	}
	
	
}
