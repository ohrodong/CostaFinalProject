package com.costar.main;

import com.costar.main.vo.ConcertCommentVO;
import com.costar.main.vo.ConcertSecondGenreVO;
import com.costar.main.vo.ConcertVO;
import com.costar.main.vo.FaqnaVO;
<<<<<<< HEAD
import com.costar.main.vo.MemberVO;
import com.costar.main.vo.NoteVO;
import com.costar.main.vo.NoticeVO;

public class VoCollection {
	// /데이터 입력/////
	MemberVO memberVO = new MemberVO("k@gmail.com",// String memberId;
			"password",// String memberPw;
			"삼청동",// String memberAddr;
			"01066527322",// String memberTelNum;
			"042-628-6666",// String memberCompanyNum;
			333,// int memberAuthority;
			"강북구",// String memberArea;
			"남",// String memberGender;
			1988,// int memberBirthYear;
			"",// String memberAddDate;//Date
			""// String memberUpdateDate;//Date
	);

	MemberVO memberVO2 = new MemberVO("hhhh@hanmail.com",// String memberId;
			"비밀번호",// String memberPw;
			"신림동",// String memberAddr;
			"01090871245",// String memberTelNum;
			"032-567-7890",// String memberCompanyNum;
			222,// int memberAuthority;
			"구로구",// String memberArea;
			"여",// String memberGender;
			1998,// int memberBirthYear;
			"",// String memberAddDate;//Date
			""// String memberUpdateDate;//Date
	);
	MemberVO memberVO3 = new MemberVO("h3h3h3@korea.com",// String memberId;
			"비번3",// String memberPw;
			"주소3",// String memberAddr;
			"0103333333",// String memberTelNum;
			"033-333-333",// String memberCompanyNum;
			111,// int memberAuthority;
			"지역구3",// String memberArea;
			"여",// String memberGender;
			1990,// int memberBirthYear;
			"",// String memberAddDate;//Date
			""// String memberUpdateDate;//Date
			);

	ConcertVO concertVO = new ConcertVO("0001",// String concertId;
			"팬텀2222", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-10-30",// String concertEndDate;//Date
			"뮤지컬",// String concertFirstGenre;
			"세종문화회관", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"CJEntertainment",// String concertCompany;
			"한예슬", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
	);

	ConcertVO concertVO2 = new ConcertVO("0002",// String concertId;
			"22유텀령22", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
	);
	
	ConcertVO concertVO3 = new ConcertVO("0003",// String concertId;
			"33공연3", // String concertName;
			"20150210",// String concertStartDate;//Date
			"2015-07-06",// String concertEndDate;//Date
			"콘서트",// String concertFirstGenre;
			"잠실운동장", // String concertHall;
			"송파구",// String concertArea;
			"www.google.com", // String concertWebSite;
			"7세 이상",// String concertViewAge;
			"300분",// String concertRunningTime;
			"공지사항 없슴니다",// String concertNotice;
			"SMEntertaiment",// String concertCompany;
			"보아", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"10",// String concertAverageRating;
			400,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
	);
	
	ConcertVO concertVO4 = new ConcertVO("0004",// String concertId;
			"44공연4", // String concertName;
			"20150310",// String concertStartDate;//Date
			"2015-07-06",// String concertEndDate;//Date
			"아동",// String concertFirstGenre;
			"잠실땅바닥", // String concertHall;
			"구디동",// String concertArea;
			"www.google.com", // String concertWebSite;
			"7세 이상",// String concertViewAge;
			"300분",// String concertRunningTime;
			"공지사항 없슴니다",// String concertNotice;
			"SMEntertaiment",// String concertCompany;
			"보아", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"10",// String concertAverageRating;
			400,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
			);

	ConcertVO concertVO5 = new ConcertVO("0005",// String concertId;
			"5유텀령555", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			0,//concertCommentCount
			memberVO2// MemberVO memberVO;
	);
	ConcertVO concertVO6 = new ConcertVO("0006",// String concertId;
			"6장르별추천용", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			6,//concertCommentCount
			memberVO2// MemberVO memberVO;
	);
	ConcertVO concertVO7 = new ConcertVO("0007",// String concertId;
			"7장르별추천용", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			7,//concertCommentCount
			memberVO2// MemberVO memberVO;
	);


	ConcertCommentVO concertCommentVO = new ConcertCommentVO(
			"이 연극 재미 없어요오 푸우우우우우푸푸푸푸푸푸푸푸ㅜ우우",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			3,// int concertCommentRating
			concertVO2,// ConcertVO concertVO
			memberVO2// MemberVO memberVO;
	);
	
	ConcertCommentVO concertCommentVO2 = new ConcertCommentVO(
			"와우 너무 재밌당ㅇㅇㅇㅇㅇ",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			5,// int concertCommentRating
			concertVO2,// ConcertVO concertVO
			memberVO// MemberVO memberVO;
	);
	
	ConcertCommentVO concertCommentVO3 = new ConcertCommentVO(
			"3번째 댓글입니당",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			2,// int concertCommentRating
			concertVO,// ConcertVO concertVO
			memberVO// MemberVO memberVO;
			);
	
	ConcertCommentVO concertCommentVO4 = new ConcertCommentVO(
			"4번째 댓글입니당",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			2,// int concertCommentRating
			concertVO2,// ConcertVO concertVO
			memberVO3// MemberVO memberVO;
			);
 
	
	ConcertSecondGenreVO concertSecondGenreVO = new ConcertSecondGenreVO(
			1, "내한공연", concertVO
			);
	ConcertSecondGenreVO concertSecondGenreVO2 = new ConcertSecondGenreVO(
			2, "내한공연", concertVO2
			);
	ConcertSecondGenreVO concertSecondGenreVO3 = new ConcertSecondGenreVO(
			3, "뮤지컬", concertVO3
			);
	ConcertSecondGenreVO concertSecondGenreVO4 = new ConcertSecondGenreVO(
			4, "외부공연", concertVO4
			);
	ConcertSecondGenreVO concertSecondGenreVO5 = new ConcertSecondGenreVO(
			5, "뮤지컬", concertVO5
			);
	ConcertSecondGenreVO concertSecondGenreVO6 = new ConcertSecondGenreVO(
			6, "뮤지컬", concertVO6
			);
	ConcertSecondGenreVO concertSecondGenreVO7 = new ConcertSecondGenreVO(
			7, "외부공연", concertVO7
			);
	
	
	
	NoteVO noteVO = new NoteVO(
			1, //int noteNo
			"1번째노트", //String noteTitle
			"1번째노트의 내용입니다",//String noteContent 
			"20150531", //String noteWriteTime
			memberVO //memberVO memberVO
	);
	NoteVO noteVO2 = new NoteVO(
			2, //int noteNo
			"2번째노트", //String noteTitle
			"2번째 노트의 내용입니다",//String noteContent 
			"20150606", //String noteWriteTime
			memberVO2 //memberVO memberVO
			);
	NoteVO noteVO3 = new NoteVO(
			3, //int noteNo
			"3번째노트", //String noteTitle
			"3번째노트의 내용입니다",//String noteContent 
			"20150401", //String noteWriteTime
			memberVO3 //memberVO memberVO
			);
	NoteVO noteVO4 = new NoteVO(
			3, //int noteNo
			"4번째노트", //String noteTitle
			"4번째노트의 내용입니다, 멤버1이 쓴 두번째 노트",//String noteContent 
			"20150401", //String noteWriteTime
			memberVO //memberVO memberVO
			);
	
	NoticeVO noticeVO = new NoticeVO(
			1, //int noticeNo
			"공지사항1 제목", //String noticeTitle
			"공지사항1 내용",//String noticeContent
			"", //noticeWriteTime
			"", //noticeUpdateTime
			memberVO//memberVO
	);
	
	NoticeVO noticeVO2 = new NoticeVO(
			2, //int noticeNo
			"공지사항2 제목", //String noticeTitle
			"공지사항2 내용",//String noticeContent
			"", //noticeWriteTime
			"", //noticeUpdateTime
			memberVO2//memberVO
			);
	
	FaqnaVO faqnaVO = new FaqnaVO(
			1, //int faqnaNo;
			"공지사항1 제목", //String faqnaTitle;
			"공지사항1 내용", //String faqnaContent;
			"공지사항1 카테고리",//String faqnaCategory, 
			"",//String faqnaWriteTime, 
			" ",//String faqnaUpdateTime, 
			memberVO//MemberVO memberVO
			);
	
	FaqnaVO faqnaVO2 = new FaqnaVO(
			2, //int faqnaNo;
			"공지사항2 제목", //String faqnaTitle;
			"공지사항2 내용", //String faqnaContent;
			"공지사항2 카테고리",//String faqnaCategory, 
			"",//String faqnaWriteTime, 
			" ",//String faqnaUpdateTime, 
			memberVO//MemberVO memberVO
			);
	
	

	public ConcertCommentVO getConcertCommentVO3() {
		return concertCommentVO3;
	}

	public void setConcertCommentVO3(ConcertCommentVO concertCommentVO3) {
		this.concertCommentVO3 = concertCommentVO3;
	}

	public ConcertCommentVO getConcertCommentVO2() {
		return concertCommentVO2;
	}

	public void setConcertCommentVO2(ConcertCommentVO concertCommentVO2) {
		this.concertCommentVO2 = concertCommentVO2;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	public MemberVO getMemberVO2() {
		return memberVO2;
	}

	public void setMemberVO2(MemberVO memberVO2) {
		this.memberVO2 = memberVO2;
	}

	public ConcertVO getConcertVO() {
		return concertVO;
	}

	public void setConcertVO(ConcertVO concertVO) {
		this.concertVO = concertVO;
	}

	public ConcertVO getConcertVO2() {
		return concertVO2;
	}

	public void setConcertVO2(ConcertVO concertVO2) {
		this.concertVO2 = concertVO2;
	}

	public ConcertCommentVO getConcertCommentVO() {
		return concertCommentVO;
	}

	public void setConcertCommentVO(ConcertCommentVO concertCommentVO) {
		this.concertCommentVO = concertCommentVO;
	}

	public ConcertVO getConcertVO4() {
		return concertVO4;
	}

	public void setConcertVO4(ConcertVO concertVO4) {
		this.concertVO4 = concertVO4;
	}

	public ConcertVO getConcertVO5() {
		return concertVO5;
	}

	public void setConcertVO5(ConcertVO concertVO5) {
		this.concertVO5 = concertVO5;
	}

	public MemberVO getMemberVO3() {
		return memberVO3;
	}

	public void setMemberVO3(MemberVO memberVO3) {
		this.memberVO3 = memberVO3;
	}

	public ConcertCommentVO getConcertCommentVO4() {
		return concertCommentVO4;
	}

	public void setConcertCommentVO4(ConcertCommentVO concertCommentVO4) {
		this.concertCommentVO4 = concertCommentVO4;
	}

	public ConcertVO getConcertVO3() {
		return concertVO3;
	}

	public void setConcertVO3(ConcertVO concertVO3) {
		this.concertVO3 = concertVO3;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO() {
		return concertSecondGenreVO;
	}

	public void setConcertSecondGenreVO(ConcertSecondGenreVO concertSecondGenreVO) {
		this.concertSecondGenreVO = concertSecondGenreVO;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO2() {
		return concertSecondGenreVO2;
	}

	public void setConcertSecondGenreVO2(ConcertSecondGenreVO concertSecondGenreVO2) {
		this.concertSecondGenreVO2 = concertSecondGenreVO2;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO3() {
		return concertSecondGenreVO3;
	}

	public void setConcertSecondGenreVO3(ConcertSecondGenreVO concertSecondGenreVO3) {
		this.concertSecondGenreVO3 = concertSecondGenreVO3;
	}

	public ConcertVO getConcertVO6() {
		return concertVO6;
	}

	public void setConcertVO6(ConcertVO concertVO6) {
		this.concertVO6 = concertVO6;
	}

	public ConcertVO getConcertVO7() {
		return concertVO7;
	}

	public void setConcertVO7(ConcertVO concertVO7) {
		this.concertVO7 = concertVO7;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO4() {
		return concertSecondGenreVO4;
	}

	public void setConcertSecondGenreVO4(ConcertSecondGenreVO concertSecondGenreVO4) {
		this.concertSecondGenreVO4 = concertSecondGenreVO4;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO5() {
		return concertSecondGenreVO5;
	}

	public void setConcertSecondGenreVO5(ConcertSecondGenreVO concertSecondGenreVO5) {
		this.concertSecondGenreVO5 = concertSecondGenreVO5;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO6() {
		return concertSecondGenreVO6;
	}

	public void setConcertSecondGenreVO6(ConcertSecondGenreVO concertSecondGenreVO6) {
		this.concertSecondGenreVO6 = concertSecondGenreVO6;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO7() {
		return concertSecondGenreVO7;
	}

	public void setConcertSecondGenreVO7(ConcertSecondGenreVO concertSecondGenreVO7) {
		this.concertSecondGenreVO7 = concertSecondGenreVO7;
	}

	public NoteVO getNoteVO() {
		return noteVO;
	}

	public void setNoteVO(NoteVO noteVO) {
		this.noteVO = noteVO;
	}

	public NoteVO getNoteVO2() {
		return noteVO2;
	}

	public void setNoteVO2(NoteVO noteVO2) {
		this.noteVO2 = noteVO2;
	}

	public NoteVO getNoteVO3() {
		return noteVO3;
	}

	public void setNoteVO3(NoteVO noteVO3) {
		this.noteVO3 = noteVO3;
	}

	public NoteVO getNoteVO4() {
		return noteVO4;
	}

	public void setNoteVO4(NoteVO noteVO4) {
		this.noteVO4 = noteVO4;
	}

	public NoticeVO getNoticeVO() {
		return noticeVO;
	}

	public void setNoticeVO(NoticeVO noticeVO) {
		this.noticeVO = noticeVO;
	}

	public NoticeVO getNoticeVO2() {
		return noticeVO2;
	}

	public void setNoticeVO2(NoticeVO noticeVO2) {
		this.noticeVO2 = noticeVO2;
	}

	public FaqnaVO getFaqnaVO() {
		return faqnaVO;
	}

	public void setFaqnaVO(FaqnaVO faqnaVO) {
		this.faqnaVO = faqnaVO;
	}

	public FaqnaVO getFaqnaVO2() {
		return faqnaVO2;
	}

	public void setFaqnaVO2(FaqnaVO faqnaVO2) {
		this.faqnaVO2 = faqnaVO2;
=======
import com.costar.main.vo.HistoryBookmarkVO;
import com.costar.main.vo.HistoryBookmarkVO;
import com.costar.main.vo.MemberVO;
import com.costar.main.vo.NoteVO;
import com.costar.main.vo.NoticeVO;

public class VoCollection {
	// /데이터 입력/////
	MemberVO memberVO = new MemberVO("k@gmail.com",// String memberId;
			"password",// String memberPw;
			"삼청동",// String memberAddr;
			"01066527322",// String memberTelNum;
			"042-628-6666",// String memberCompanyNum;
			333,// int memberAuthority;
			"강북구",// String memberArea;
			"남",// String memberGender;
			1988,// int memberBirthYear;
			"",// String memberAddDate;//Date
			""// String memberUpdateDate;//Date
	);

	MemberVO memberVO2 = new MemberVO("hhhh@hanmail.com",// String memberId;
			"비밀번호",// String memberPw;
			"신림동",// String memberAddr;
			"01090871245",// String memberTelNum;
			"032-567-7890",// String memberCompanyNum;
			222,// int memberAuthority;
			"구로구",// String memberArea;
			"여",// String memberGender;
			1998,// int memberBirthYear;
			"",// String memberAddDate;//Date
			""// String memberUpdateDate;//Date
	);
	MemberVO memberVO3 = new MemberVO("h3h3h3@korea.com",// String memberId;
			"비번3",// String memberPw;
			"주소3",// String memberAddr;
			"0103333333",// String memberTelNum;
			"033-333-333",// String memberCompanyNum;
			111,// int memberAuthority;
			"지역구3",// String memberArea;
			"여",// String memberGender;
			1990,// int memberBirthYear;
			"",// String memberAddDate;//Date
			""// String memberUpdateDate;//Date
			);

	ConcertVO concertVO = new ConcertVO("0001",// String concertId;
			"팬텀2222", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-10-30",// String concertEndDate;//Date
			"뮤지컬",// String concertFirstGenre;
			"세종문화회관", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"CJEntertainment",// String concertCompany;
			"한예슬", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
	);

	ConcertVO concertVO2 = new ConcertVO("0002",// String concertId;
			"22유텀령22", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
	);
	
	ConcertVO concertVO3 = new ConcertVO("0003",// String concertId;
			"33공연3", // String concertName;
			"20150210",// String concertStartDate;//Date
			"2015-07-06",// String concertEndDate;//Date
			"콘서트",// String concertFirstGenre;
			"잠실운동장", // String concertHall;
			"송파구",// String concertArea;
			"www.google.com", // String concertWebSite;
			"7세 이상",// String concertViewAge;
			"300분",// String concertRunningTime;
			"공지사항 없슴니다",// String concertNotice;
			"SMEntertaiment",// String concertCompany;
			"보아", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"10",// String concertAverageRating;
			400,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
	);
	
	ConcertVO concertVO4 = new ConcertVO("0004",// String concertId;
			"44공연4", // String concertName;
			"20150310",// String concertStartDate;//Date
			"2015-07-06",// String concertEndDate;//Date
			"아동",// String concertFirstGenre;
			"잠실땅바닥", // String concertHall;
			"구디동",// String concertArea;
			"www.google.com", // String concertWebSite;
			"7세 이상",// String concertViewAge;
			"300분",// String concertRunningTime;
			"공지사항 없슴니다",// String concertNotice;
			"SMEntertaiment",// String concertCompany;
			"보아", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"10",// String concertAverageRating;
			400,// int concertHits;
			0,//concertCommentCount
			memberVO// MemberVO memberVO;
			);

	ConcertVO concertVO5 = new ConcertVO("0005",// String concertId;
			"5유텀령555", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			0,//concertCommentCount
			memberVO2// MemberVO memberVO;
	);
	ConcertVO concertVO6 = new ConcertVO("0006",// String concertId;
			"6장르별추천용", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			6,//concertCommentCount
			memberVO2// MemberVO memberVO;
	);
	ConcertVO concertVO7 = new ConcertVO("0007",// String concertId;
			"7장르별추천용", // String concertName;
			"20150531",// String concertStartDate;//Date
			"2015-09-10",// String concertEndDate;//Date
			"공연",// String concertFirstGenre;
			"대학로", // String concertHall;
			"강북구",// String concertArea;
			"www.naver.com", // String concertWebSite;
			"20세이상",// String concertViewAge;
			"120분",// String concertRunningTime;
			"공지사항",// String concertNotice;
			"JYP",// String concertCompany;
			"설경구", // String concertActors;
			"",// String concertWriteTime;//Date
			"",// String concertUpdateTime;//Date
			"7",// String concertAverageRating;
			120,// int concertHits;
			7,//concertCommentCount
			memberVO2// MemberVO memberVO;
	);


	ConcertCommentVO concertCommentVO = new ConcertCommentVO(
			"이 연극 재미 없어요오 푸우우우우우푸푸푸푸푸푸푸푸ㅜ우우",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			3,// int concertCommentRating
			concertVO2,// ConcertVO concertVO
			memberVO2// MemberVO memberVO;
	);
	
	ConcertCommentVO concertCommentVO2 = new ConcertCommentVO(
			"와우 너무 재밌당ㅇㅇㅇㅇㅇ",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			5,// int concertCommentRating
			concertVO2,// ConcertVO concertVO
			memberVO// MemberVO memberVO;
	);
	
	ConcertCommentVO concertCommentVO3 = new ConcertCommentVO(
			"3번째 댓글입니당",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			2,// int concertCommentRating
			concertVO,// ConcertVO concertVO
			memberVO// MemberVO memberVO;
			);
	
	ConcertCommentVO concertCommentVO4 = new ConcertCommentVO(
			"4번째 댓글입니당",// String concertCommentContent,
			"",// String concertCommentWriteTime //Date
			"",// StringconcertCommentUpdateTime, //Date
			0,// int concertCommentLike
			2,// int concertCommentRating
			concertVO2,// ConcertVO concertVO
			memberVO3// MemberVO memberVO;
			);
 
	
	ConcertSecondGenreVO concertSecondGenreVO = new ConcertSecondGenreVO(
			1, "내한공연", concertVO
			);
	ConcertSecondGenreVO concertSecondGenreVO2 = new ConcertSecondGenreVO(
			2, "내한공연", concertVO2
			);
	ConcertSecondGenreVO concertSecondGenreVO3 = new ConcertSecondGenreVO(
			3, "뮤지컬", concertVO3
			);
	ConcertSecondGenreVO concertSecondGenreVO4 = new ConcertSecondGenreVO(
			4, "외부공연", concertVO4
			);
	ConcertSecondGenreVO concertSecondGenreVO5 = new ConcertSecondGenreVO(
			5, "뮤지컬", concertVO5
			);
	ConcertSecondGenreVO concertSecondGenreVO6 = new ConcertSecondGenreVO(
			6, "뮤지컬", concertVO6
			);
	ConcertSecondGenreVO concertSecondGenreVO7 = new ConcertSecondGenreVO(
			7, "외부공연", concertVO7
			);
	
	
	
	NoteVO noteVO = new NoteVO(
			1, //int noteNo
			"1번째노트", //String noteTitle
			"1번째노트의 내용입니다",//String noteContent 
			"20150531", //String noteWriteTime
			memberVO //memberVO memberVO
	);
	NoteVO noteVO2 = new NoteVO(
			2, //int noteNo
			"2번째노트", //String noteTitle
			"2번째 노트의 내용입니다",//String noteContent 
			"20150606", //String noteWriteTime
			memberVO2 //memberVO memberVO
			);
	NoteVO noteVO3 = new NoteVO(
			3, //int noteNo
			"3번째노트", //String noteTitle
			"3번째노트의 내용입니다",//String noteContent 
			"20150401", //String noteWriteTime
			memberVO3 //memberVO memberVO
			);
	NoteVO noteVO4 = new NoteVO(
			3, //int noteNo
			"4번째노트", //String noteTitle
			"4번째노트의 내용입니다, 멤버1이 쓴 두번째 노트",//String noteContent 
			"20150401", //String noteWriteTime
			memberVO //memberVO memberVO
			);
	
	NoticeVO noticeVO = new NoticeVO(
			1, //int noticeNo
			"공지사항1 제목", //String noticeTitle
			"공지사항1 내용",//String noticeContent
			"", //noticeWriteTime
			"", //noticeUpdateTime
			memberVO//memberVO
	);
	
	NoticeVO noticeVO2 = new NoticeVO(
			2, //int noticeNo
			"공지사항2 제목", //String noticeTitle
			"공지사항2 내용",//String noticeContent
			"", //noticeWriteTime
			"", //noticeUpdateTime
			memberVO2//memberVO
			);
	
	FaqnaVO faqnaVO = new FaqnaVO(
			1, //int faqnaNo;
			"공지사항1 제목", //String faqnaTitle;
			"공지사항1 내용", //String faqnaContent;
			"공지사항1 카테고리",//String faqnaCategory, 
			"",//String faqnaWriteTime, 
			" ",//String faqnaUpdateTime, 
			memberVO//MemberVO memberVO
			);
	
	FaqnaVO faqnaVO2 = new FaqnaVO(
			2, //int faqnaNo;
			"공지사항2 제목", //String faqnaTitle;
			"공지사항2 내용", //String faqnaContent;
			"공지사항2 카테고리",//String faqnaCategory, 
			"",//String faqnaWriteTime, 
			" ",//String faqnaUpdateTime, 
			memberVO//MemberVO memberVO
			);
	
	
	HistoryBookmarkVO historyBookmarkVO = new HistoryBookmarkVO(
			0,//int historyBookmarkIsBookmark
			concertVO, //ConcertVO concertVO
			memberVO//MemberVO memberVO
			);
	
	
	HistoryBookmarkVO historyBookmarkVO2 = new HistoryBookmarkVO(
			1,//int historyBookmarkIsBookmark
			concertVO2, //ConcertVO concertVO
			memberVO2//MemberVO memberVO
			);

	HistoryBookmarkVO historyBookmarkVO3 = new HistoryBookmarkVO(
			0,//int historyBookmarkIsBookmark
			concertVO3, //ConcertVO concertVO
			memberVO2//MemberVO memberVO
			);
	

	
	public ConcertCommentVO getConcertCommentVO3() {
		return concertCommentVO3;
	}

	public void setConcertCommentVO3(ConcertCommentVO concertCommentVO3) {
		this.concertCommentVO3 = concertCommentVO3;
	}

	public ConcertCommentVO getConcertCommentVO2() {
		return concertCommentVO2;
	}

	public void setConcertCommentVO2(ConcertCommentVO concertCommentVO2) {
		this.concertCommentVO2 = concertCommentVO2;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	public MemberVO getMemberVO2() {
		return memberVO2;
	}

	public void setMemberVO2(MemberVO memberVO2) {
		this.memberVO2 = memberVO2;
	}

	public ConcertVO getConcertVO() {
		return concertVO;
	}

	public void setConcertVO(ConcertVO concertVO) {
		this.concertVO = concertVO;
	}

	public ConcertVO getConcertVO2() {
		return concertVO2;
	}

	public void setConcertVO2(ConcertVO concertVO2) {
		this.concertVO2 = concertVO2;
	}

	public ConcertCommentVO getConcertCommentVO() {
		return concertCommentVO;
	}

	public void setConcertCommentVO(ConcertCommentVO concertCommentVO) {
		this.concertCommentVO = concertCommentVO;
	}

	public ConcertVO getConcertVO4() {
		return concertVO4;
	}

	public void setConcertVO4(ConcertVO concertVO4) {
		this.concertVO4 = concertVO4;
	}

	public ConcertVO getConcertVO5() {
		return concertVO5;
	}

	public void setConcertVO5(ConcertVO concertVO5) {
		this.concertVO5 = concertVO5;
	}

	public MemberVO getMemberVO3() {
		return memberVO3;
	}

	public void setMemberVO3(MemberVO memberVO3) {
		this.memberVO3 = memberVO3;
	}

	public ConcertCommentVO getConcertCommentVO4() {
		return concertCommentVO4;
	}

	public void setConcertCommentVO4(ConcertCommentVO concertCommentVO4) {
		this.concertCommentVO4 = concertCommentVO4;
	}

	public ConcertVO getConcertVO3() {
		return concertVO3;
	}

	public void setConcertVO3(ConcertVO concertVO3) {
		this.concertVO3 = concertVO3;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO() {
		return concertSecondGenreVO;
	}

	public void setConcertSecondGenreVO(ConcertSecondGenreVO concertSecondGenreVO) {
		this.concertSecondGenreVO = concertSecondGenreVO;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO2() {
		return concertSecondGenreVO2;
	}

	public void setConcertSecondGenreVO2(ConcertSecondGenreVO concertSecondGenreVO2) {
		this.concertSecondGenreVO2 = concertSecondGenreVO2;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO3() {
		return concertSecondGenreVO3;
	}

	public void setConcertSecondGenreVO3(ConcertSecondGenreVO concertSecondGenreVO3) {
		this.concertSecondGenreVO3 = concertSecondGenreVO3;
	}

	public ConcertVO getConcertVO6() {
		return concertVO6;
	}

	public void setConcertVO6(ConcertVO concertVO6) {
		this.concertVO6 = concertVO6;
	}

	public ConcertVO getConcertVO7() {
		return concertVO7;
	}

	public void setConcertVO7(ConcertVO concertVO7) {
		this.concertVO7 = concertVO7;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO4() {
		return concertSecondGenreVO4;
	}

	public void setConcertSecondGenreVO4(ConcertSecondGenreVO concertSecondGenreVO4) {
		this.concertSecondGenreVO4 = concertSecondGenreVO4;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO5() {
		return concertSecondGenreVO5;
	}

	public void setConcertSecondGenreVO5(ConcertSecondGenreVO concertSecondGenreVO5) {
		this.concertSecondGenreVO5 = concertSecondGenreVO5;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO6() {
		return concertSecondGenreVO6;
	}

	public void setConcertSecondGenreVO6(ConcertSecondGenreVO concertSecondGenreVO6) {
		this.concertSecondGenreVO6 = concertSecondGenreVO6;
	}

	public ConcertSecondGenreVO getConcertSecondGenreVO7() {
		return concertSecondGenreVO7;
	}

	public void setConcertSecondGenreVO7(ConcertSecondGenreVO concertSecondGenreVO7) {
		this.concertSecondGenreVO7 = concertSecondGenreVO7;
	}

	public NoteVO getNoteVO() {
		return noteVO;
	}

	public void setNoteVO(NoteVO noteVO) {
		this.noteVO = noteVO;
	}

	public NoteVO getNoteVO2() {
		return noteVO2;
	}

	public void setNoteVO2(NoteVO noteVO2) {
		this.noteVO2 = noteVO2;
	}

	public NoteVO getNoteVO3() {
		return noteVO3;
	}

	public void setNoteVO3(NoteVO noteVO3) {
		this.noteVO3 = noteVO3;
	}

	public NoteVO getNoteVO4() {
		return noteVO4;
	}

	public void setNoteVO4(NoteVO noteVO4) {
		this.noteVO4 = noteVO4;
	}

	public NoticeVO getNoticeVO() {
		return noticeVO;
	}

	public void setNoticeVO(NoticeVO noticeVO) {
		this.noticeVO = noticeVO;
	}

	public NoticeVO getNoticeVO2() {
		return noticeVO2;
	}

	public void setNoticeVO2(NoticeVO noticeVO2) {
		this.noticeVO2 = noticeVO2;
	}

	public FaqnaVO getFaqnaVO() {
		return faqnaVO;
	}

	public void setFaqnaVO(FaqnaVO faqnaVO) {
		this.faqnaVO = faqnaVO;
	}

	public FaqnaVO getFaqnaVO2() {
		return faqnaVO2;
	}

	public void setFaqnaVO2(FaqnaVO faqnaVO2) {
		this.faqnaVO2 = faqnaVO2;
	}

	public HistoryBookmarkVO getHistoryBookmarkVO() {
		return historyBookmarkVO;
	}

	public void setHistoryBookmarkVO(HistoryBookmarkVO historyBookmarkVO) {
		this.historyBookmarkVO = historyBookmarkVO;
	}

	public HistoryBookmarkVO getHistoryBookmarkVO2() {
		return historyBookmarkVO2;
	}

	public void setHistoryBookmarkVO2(HistoryBookmarkVO historyBookmarkVO2) {
		this.historyBookmarkVO2 = historyBookmarkVO2;
	}

	public HistoryBookmarkVO getHistoryBookmarkVO3() {
		return historyBookmarkVO3;
	}

	public void setHistoryBookmarkVO3(HistoryBookmarkVO historyBookmarkVO3) {
		this.historyBookmarkVO3 = historyBookmarkVO3;
>>>>>>> refs/remotes/originohdong/test
	}
	
	
	
}
