package com.costar.main;

import java.io.Reader;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.costar.main.vo.ConcertCommentVO;
import com.costar.main.vo.ConcertSecondGenreVO;
import com.costar.main.vo.ConcertVO;
import com.costar.main.vo.MemberVO;
import com.costar.main.vo.NoticeVO;

public class BoardTest {

	public static void main(String[] args) throws Exception{
		int temp_int=0, temp_int2=0, temp_int3=0;
		String temp_string="",temp_string2="",temp_string3="";
		ConcertVO temp_concertVO = null;
		ConcertCommentVO temp_concertCommentVO = null;
		ConcertSecondGenreVO temp_concertSecondGenreVO = null;
		NoticeVO temp_noticeVO = null;
		
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<ConcertCommentVO> temp_ConcertCommentVO_list = null;
		ArrayList<ConcertSecondGenreVO> temp_concertSecondGenreVO_list = null;
		ArrayList<NoticeVO> temp_NoticeVO_list = null;
		
		VoCollection vo = new VoCollection();
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();
		
		/////////////////////////////////////A D D ///////////////////////////////////////////		
//		session.insert("Board.addConcertComment",vo.concertCommentVO3);
//		session.up
//		session.commit();
		
		
		
		/////////////////////////////////////SELECT ALL ///////////////////////////////////////////
//		
//		System.out.println("========================================");
//		System.out.println("++Board.selectConcertCommentAll++");
//		System.out.println("========================================");
//		temp_ConcertCommentVO_list = (ArrayList)session.selectList("Board.selectConcertCommentAll");
//		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
//			System.out.println(temp_ConcertCommentVO_list.get(i));
//		}
//		
		
//		
//		System.out.println("========================================");
//		System.out.println("++Board.selectAllNotice++");
//		System.out.println("========================================");
//		temp_NoticeVO_list = (ArrayList)session.selectList("Notice.selectAllNotice");
//		for (int i = 0; i < temp_NoticeVO_list.size(); i++) {
//			System.out.println(temp_NoticeVO_list.get(i));
//		}

		

		/////////////////////////////////////S E  L E C T///////////////////////////////////////////
//		
//		System.out.println("========================================");
//		System.out.println("++Board.selectByNoticeNo++");
//		System.out.println("========================================");
//		temp_NoticeVO_list = (ArrayList)session.selectList("Notice.selectByNoticeNo",1);
//		for (int i = 0; i < temp_NoticeVO_list.size(); i++) {
//			System.out.println(temp_NoticeVO_list.get(i));
//		}
//		
		
		
		

		
		/////////////////////////////////////U P D A T E ///////////////////////////////////////////
		/*
		temp_concertCommentVO = vo.getConcertCommentVO3();
//		temp_concertCommentVO.setMemberVO(memberVO);
//		temp_int = session.insert("Board.addConcertComment",temp_concertCommentVO);
		System.out.println("업데이트 전 = ");
		temp_ConcertCommentVO_list = (ArrayList)session.selectList("Board.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		temp_concertCommentVO.setConcertCommentContent("업테이트 해쪄여");
		temp_int = session.update("Board.updateConcertComment",temp_concertCommentVO);
		System.out.println("업데이트 결과 = " + temp_int);
		System.out.println("업데이트 후= " );
		temp_ConcertCommentVO_list = (ArrayList)session.selectList("Board.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		*/
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		/////////////////////////////////////D E L E T E ///////////////////////////////////////////
		/*
		System.out.println("\n");
		temp_int = session.delete("Board.deleteConcertComment",vo.getConcertCommentVO());
		System.out.println("삭제 결과 = " + temp_int);
		
		temp_ConcertCommentVO_list = (ArrayList)session.selectList("Board.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		*/
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
	
		
	}//main

}//class
