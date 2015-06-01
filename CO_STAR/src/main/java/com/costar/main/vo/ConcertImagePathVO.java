package com.costar.main.vo;

public class ConcertImagePathVO {
	int concertImagePathNo;
	String concertImagePath;
	
	ConcertVO concertVO;

	public ConcertImagePathVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcertImagePathVO(int concertImagePathNo, String concertImagePath,
			ConcertVO concertVO) {
		super();
		this.concertImagePathNo = concertImagePathNo;
		this.concertImagePath = concertImagePath;
		this.concertVO = concertVO;
	}

	public int getConcertImagePathNo() {
		return concertImagePathNo;
	}

	public void setConcertImagePathNo(int concertImagePathNo) {
		this.concertImagePathNo = concertImagePathNo;
	}

	public String getConcertImagePath() {
		return concertImagePath;
	}

	public void setConcertImagePath(String concertImagePath) {
		this.concertImagePath = concertImagePath;
	}

	public ConcertVO getConcertVO() {
		return concertVO;
	}

	public void setConcertVO(ConcertVO concertVO) {
		this.concertVO = concertVO;
	}

	@Override
	public String toString() {
		return "ConcertImagePathVO [concertImagePathNo=" + concertImagePathNo
				+ ", concertImagePath=" + concertImagePath + ", concertVO="
				+ concertVO + "]";
	}

	
	
	
}
