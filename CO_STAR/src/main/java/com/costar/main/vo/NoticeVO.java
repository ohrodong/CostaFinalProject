package com.costar.main.vo;

public class NoticeVO {
	int noticeNo;
	String noticeTitle;
	String noticeContent;
	String noticeWriteTime;//Date
	String noticeUpdateTime;//Date
	
	MemberVO memberVO;

	public NoticeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoticeVO(int noticeNo, String noticeTitle, String noticeContent,
			String noticeWriteTime, String noticeUpdateTime, MemberVO memberVO) {
		super();
		this.noticeNo = noticeNo;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeWriteTime = noticeWriteTime;
		this.noticeUpdateTime = noticeUpdateTime;
		this.memberVO = memberVO;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeWriteTime() {
		return noticeWriteTime;
	}

	public void setNoticeWriteTime(String noticeWriteTime) {
		this.noticeWriteTime = noticeWriteTime;
	}

	public String getNoticeUpdateTime() {
		return noticeUpdateTime;
	}

	public void setNoticeUpdateTime(String noticeUpdateTime) {
		this.noticeUpdateTime = noticeUpdateTime;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	@Override
	public String toString() {
		return "NoticeVO [noticeNo=" + noticeNo + ", noticeTitle="
				+ noticeTitle + ", noticeContent=" + noticeContent
				+ ", noticeWriteTime=" + noticeWriteTime
				+ ", noticeUpdateTime=" + noticeUpdateTime + ", memberVO="
				+ memberVO + "]";
	}

	
	
}
