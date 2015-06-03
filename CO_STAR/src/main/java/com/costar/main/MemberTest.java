package com.costar.main;



import java.io.Reader;
import java.util.ArrayList;

import com.costar.main.vo.ConcertCommentVO;
import com.costar.main.vo.ConcertVO;
import com.costar.main.vo.MemberVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * FileName : MyBatisTestApp01.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping01.xml
  * ㅇ MyBATIS Framework 이용 QUERY ( SELECT ) TEST 
  */
public class MemberTest {
	public static void main(String[] args) throws Exception{
		int temp_int=0, temp_int2=0, temp_int3=0;
		String temp_string="",temp_string2="",temp_string3="";
		MemberVO temp_memberVO = null, temp_memberVO2 = null;
		ConcertVO temp_concertVO = null;
		
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<ConcertCommentVO> temp_ConcertCommentVO_list = null;
		ArrayList<MemberVO> temp_MemberVO_list = null;
		
		VoCollection vo = new VoCollection();
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();

		
		System.out.println("========================================");
		System.out.println("++Member.selectAllMember++");
		System.out.println("========================================");
		temp_MemberVO_list=(ArrayList)session.selectList("Member.selectAllMember");
		System.out.println("현재 Member 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_MemberVO_list.size(); i++) {
			System.out.println(temp_MemberVO_list.get(i));
		}
		System.out.println("\n\n");
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////
		/* 무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성
		System.out.println("========================================");
		System.out.println("++Member.deleteMember++");
		System.out.println("========================================");
		session.delete("Member.deleteMember",vo.getMemberVO3().getMemberId());		
		System.out.println(temp_memberVO.getMemberId()+ " 삭제 후  Member 테이블에 저장되어 있는 값::");
		temp_MemberVO_list=(ArrayList)session.selectList("Member.selectAllMember");
		for (int i = 0; i < temp_MemberVO_list.size(); i++) {
			System.out.println(temp_MemberVO_list.get(i));
		}
		System.out.println("\n\n");
		*///무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성무결성
		//////////////////////////////////////////////////////////////////////////////////////
		
		/*
		System.out.println("========================================");
		System.out.println("++Member.updateMember++");
		System.out.println("========================================");
		temp_memberVO = vo.getMemberVO3();
		temp_memberVO.setMemberAddr("수정된 주소입니다");
		session.update("Member.updateMember",temp_memberVO);		
		System.out.println(temp_memberVO.getMemberId()+ " 의 주소!! 업데이트 후  Member 테이블에 저장되어 있는 값::");
		temp_MemberVO_list=(ArrayList)session.selectList("Member.selectAllMember");
		for (int i = 0; i < temp_MemberVO_list.size(); i++) {
			System.out.println(temp_MemberVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Member.isIdCheck++");
		System.out.println("========================================");
		temp_memberVO = vo.getMemberVO3();
		temp_memberVO=session.selectOne("Member.isIdCheck",temp_memberVO.getMemberId());		
		temp_memberVO2=session.selectOne("Member.isIdCheck","없는 아이디입니다.");		
		System.out.println("중복 체크!!! ");
		System.out.println("있는 아이디라면 = " + temp_memberVO);
		System.out.println("없는 아이디라면 = " +temp_memberVO2);
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Member.isMatchTelNum++");
		System.out.println("========================================");
		temp_memberVO = vo.getMemberVO3();
		temp_memberVO=session.selectOne("Member.isMatchTelNum",temp_memberVO.getMemberTelNum());		
		temp_memberVO2=session.selectOne("Member.isMatchTelNum","000123456");		
		System.out.println("전화번호 체크!!! ");
		System.out.println("있는 전화번호라면 = " + temp_memberVO);
		System.out.println("없는 전화번호라면 = " +temp_memberVO2);
		System.out.println("\n\n");
		*/
		
		
		
		
		
	}//end of main

}//end of class