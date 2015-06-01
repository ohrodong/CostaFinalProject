package com.costar.main.vo;

public class NoteVO {
	int noteNo;
	String noteTitle;
	String noteContent;
	String noteWriteTime;//Date
	
	MemberVO memberVO;

	public NoteVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoteVO(int noteNo, String noteTitle, String noteContent,
			String noteWriteTime, MemberVO memberVO) {
		super();
		this.noteNo = noteNo;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.noteWriteTime = noteWriteTime;
		this.memberVO = memberVO;
	}

	public int getNoteNo() {
		return noteNo;
	}

	public void setNoteNo(int noteNo) {
		this.noteNo = noteNo;
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public String getNoteWriteTime() {
		return noteWriteTime;
	}

	public void setNoteWriteTime(String noteWriteTime) {
		this.noteWriteTime = noteWriteTime;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	@Override
	public String toString() {
		return "NoteVO [noteNo=" + noteNo + ", noteTitle=" + noteTitle
				+ ", noteContent=" + noteContent + ", noteWriteTime="
				+ noteWriteTime + ", memberVO=" + memberVO + "]";
	}
	
	
}
