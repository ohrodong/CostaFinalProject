package com.costar.main.vo;

public class HistoryBookmarkVO {
	int historyBookmartIsBookmark;
	
	ConcertVO concertVO;
	MemberVO memberVO;
	public HistoryBookmarkVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HistoryBookmarkVO(int historyBookmartIsBookmark,
			ConcertVO concertVO, MemberVO memberVO) {
		super();
		this.historyBookmartIsBookmark = historyBookmartIsBookmark;
		this.concertVO = concertVO;
		this.memberVO = memberVO;
	}
	public int getHistoryBookmartIsBookmark() {
		return historyBookmartIsBookmark;
	}
	public void setHistoryBookmartIsBookmark(int historyBookmartIsBookmark) {
		this.historyBookmartIsBookmark = historyBookmartIsBookmark;
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
		return "HistoryBookmartVO [historyBookmartIsBookmark="
				+ historyBookmartIsBookmark + ", concertVO=" + concertVO
				+ ", memberVO=" + memberVO + "]";
	}
	
	
}
