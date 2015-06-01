package com.costar.main.vo;

public class ConcertSecondGenreVO {
	int concertSecondGenreNo;
	String concertSecondGenre;
	
	ConcertVO concertId;

	public ConcertSecondGenreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcertSecondGenreVO(int concertSecondGenreNo,
			String concertSecondGenre, ConcertVO concertId) {
		super();
		this.concertSecondGenreNo = concertSecondGenreNo;
		this.concertSecondGenre = concertSecondGenre;
		this.concertId = concertId;
	}

	public int getConcertSecondGenreNo() {
		return concertSecondGenreNo;
	}

	public void setConcertSecondGenreNo(int concertSecondGenreNo) {
		this.concertSecondGenreNo = concertSecondGenreNo;
	}

	public String getConcertSecondGenre() {
		return concertSecondGenre;
	}

	public void setConcertSecondGenre(String concertSecondGenre) {
		this.concertSecondGenre = concertSecondGenre;
	}

	public ConcertVO getConcertId() {
		return concertId;
	}

	public void setConcertId(ConcertVO concertId) {
		this.concertId = concertId;
	}

	@Override
	public String toString() {
		return "ConcertSecondGenreVO [concertSecondGenreNo="
				+ concertSecondGenreNo + ", concertSecondGenre="
				+ concertSecondGenre + ", concertId=" + concertId + "]";
	}
	
	
}
