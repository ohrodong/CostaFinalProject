package com.costar.main.vo;

public class ConcertCommentVO {
	String concertCommentContent;
	String concertCommentWriteTime;//Date
	String concertCommentUpdateTime;//Date
	int concertCommentLike;
	int concertCommentRating;
	
	ConcertVO concertVO;
	MemberVO memberVO;
	
	public ConcertCommentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConcertCommentVO(String concertCommentContent,
			String concertCommentWriteTime, String concertCommentUpdateTime,
			int concertCommentLike, int concertCommentRating,
			ConcertVO concertVO, MemberVO memberVO) {
		super();
		this.concertCommentContent = concertCommentContent;
		this.concertCommentWriteTime = concertCommentWriteTime;
		this.concertCommentUpdateTime = concertCommentUpdateTime;
		this.concertCommentLike = concertCommentLike;
		this.concertCommentRating = concertCommentRating;
		this.concertVO = concertVO;
		this.memberVO = memberVO;
	}
	public String getConcertCommentContent() {
		return concertCommentContent;
	}
	public void setConcertCommentContent(String concertCommentContent) {
		this.concertCommentContent = concertCommentContent;
	}
	public String getConcertCommentWriteTime() {
		return concertCommentWriteTime;
	}
	public void setConcertCommentWriteTime(String concertCommentWriteTime) {
		this.concertCommentWriteTime = concertCommentWriteTime;
	}
	public String getConcertCommentUpdateTime() {
		return concertCommentUpdateTime;
	}
	public void setConcertCommentUpdateTime(String concertCommentUpdateTime) {
		this.concertCommentUpdateTime = concertCommentUpdateTime;
	}
	public int getConcertCommentLike() {
		return concertCommentLike;
	}
	public void setConcertCommentLike(int concertCommentLike) {
		this.concertCommentLike = concertCommentLike;
	}
	public int getConcertCommentRating() {
		return concertCommentRating;
	}
	public void setConcertCommentRating(int concertCommentRating) {
		this.concertCommentRating = concertCommentRating;
	}
	public ConcertVO getConcertVO() {
		return concertVO;
	}
	public void setConcertVO(ConcertVO concertVO) {
		this.concertVO = concertVO;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	@Override
	public String toString() {
		return "ConcertCommentVO [concertCommentContent="
				+ concertCommentContent + ", concertCommentWriteTime="
				+ concertCommentWriteTime + ", concertCommentUpdateTime="
				+ concertCommentUpdateTime + ", concertCommentLike="
				+ concertCommentLike + ", concertCommentRating="
				+ concertCommentRating + ", concertVO=" + concertVO
				+ ", memberVO=" + memberVO + "]";
	}
	
	
	
	
}
