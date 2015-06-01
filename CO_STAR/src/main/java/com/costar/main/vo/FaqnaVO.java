package com.costar.main.vo;

public class FaqnaVO {
	int faqnaNo;
	String faqnaTitle;
	String faqnaContent;
	String faqnaCategory;
	String faqnaWriteTime;//Date
	String faqnaUpdateTime;//Date
	
	MemberVO memberVO;

	public FaqnaVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FaqnaVO(int faqnaNo, String faqnaTitle, String faqnaContent,
			String faqnaCategory, String faqnaWriteTime,
			String faqnaUpdateTime, MemberVO memberVO) {
		super();
		this.faqnaNo = faqnaNo;
		this.faqnaTitle = faqnaTitle;
		this.faqnaContent = faqnaContent;
		this.faqnaCategory = faqnaCategory;
		this.faqnaWriteTime = faqnaWriteTime;
		this.faqnaUpdateTime = faqnaUpdateTime;
		this.memberVO = memberVO;
	}

	@Override
	public String toString() {
		return "FaqnaVO [faqnaNo=" + faqnaNo + ", faqnaTitle=" + faqnaTitle
				+ ", faqnaContent=" + faqnaContent + ", faqnaCategory="
				+ faqnaCategory + ", faqnaWriteTime=" + faqnaWriteTime
				+ ", faqnaUpdateTime=" + faqnaUpdateTime + ", memberVO="
				+ memberVO + "]";
	}
	
	
}
