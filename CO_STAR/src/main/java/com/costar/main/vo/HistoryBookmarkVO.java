package com.costar.main.vo;

public class HistoryBookmarkVO {
	int historyBookmarkIsBookmark;
	
	ConcertVO concertVO;
	MemberVO memberVO;
	public HistoryBookmarkVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HistoryBookmarkVO(int historyBookmarkIsBookmark,
			ConcertVO concertVO, MemberVO memberVO) {
		super();
		this.historyBookmarkIsBookmark = historyBookmarkIsBookmark;
		this.concertVO = concertVO;
		this.memberVO = memberVO;
	}
	public int getHistoryBookmarkIsBookmark() {
		return historyBookmarkIsBookmark;
	}
	public void setHistoryBookmarkIsBookmark(int historyBookmarkIsBookmark) {
		this.historyBookmarkIsBookmark = historyBookmarkIsBookmark;
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
		return "HistoryBookmarkVO [historyBookmarkIsBookmark="
				+ historyBookmarkIsBookmark + ", concertVO=" + concertVO
				+ ", memberVO=" + memberVO + "]";
	}
	
	
}
