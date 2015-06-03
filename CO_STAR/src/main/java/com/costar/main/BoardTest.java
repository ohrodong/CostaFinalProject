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
import com.costar.main.vo.FaqnaVO;
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
		FaqnaVO temp_faqnVO = null;
		
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<ConcertCommentVO> temp_ConcertCommentVO_list = null;
		ArrayList<ConcertSecondGenreVO> temp_concertSecondGenreVO_list = null;
		ArrayList<NoticeVO> temp_NoticeVO_list = null;
		ArrayList<FaqnaVO> temp_faqnVO_list = null;
		
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
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////							////////////////////////////////////////
		/////////////////////////////								////////////////////////////////////////
		////////////////////////////			COMMENT	    ////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////

		/*
		System.out.println("========================================");
		System.out.println("++Comment.deleteConcertComment++");
		System.out.println("========================================");
		
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		session.delete("Comment.deleteConcertComment",vo.getConcertCommentVO());
		System.out.println("\n Delete 결과:: "  );
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");
		

		
		System.out.println("========================================");
		System.out.println("++Comment.addConcertComment++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		System.out.println("\nAdd 결과:: "  );
		session.insert("Comment.addConcertComment", vo.getConcertCommentVO());
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.updateConcertComment++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		temp_concertCommentVO = vo.getConcertCommentVO4();
		temp_concertCommentVO.setConcertCommentLike(30);
		temp_concertCommentVO.setConcertCommentContent("업데이트했다 와하하");
		session.update("Comment.updateConcertComment", temp_concertCommentVO);
		System.out.println("\nUpdate 결과:: "  );
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.showConcertCommentById++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.showConcertCommentById",vo.getMemberVO());
		System.out.println("\nSearch By ID 결과:: "  );
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.updateConcertComment++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("Id=" + temp_concertVO_list.get(i).getConcertId()
					+ "\tcount = " + temp_concertVO_list.get(i).getConcertCommentCount());
		}
		
		temp_concertCommentVO = vo.getConcertCommentVO4();
		session.update("Comment.updateConcertCommentCount", temp_concertCommentVO);
		System.out.println("\nID "+temp_concertCommentVO.getConcertVO().getConcertId()+"번 Count +1 결과:: "  );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("Id=" + temp_concertVO_list.get(i).getConcertId()
					+ "\tcount = " + temp_concertVO_list.get(i).getConcertCommentCount());
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.updateConcertCommentRating++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println("ID["+temp_ConcertCommentVO_list.get(i).getConcertCommentContent()+"]"
					+"\t평점["+temp_ConcertCommentVO_list.get(i).getConcertCommentRating()+"]");
		}
		
		temp_concertCommentVO = vo.getConcertCommentVO4();
		temp_concertCommentVO.setConcertCommentRating(1);
		session.update("Comment.updateConcertCommentRating", temp_concertCommentVO);
		System.out.println("\n 4번째 댓글 평점 -> 1점으로 업데이트 결과");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println("ID["+temp_ConcertCommentVO_list.get(i).getConcertCommentContent()+"]"
										+"\t평점["+temp_ConcertCommentVO_list.get(i).getConcertCommentRating()+"]");
		}
		System.out.println("\n\n");
		*/
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////							////////////////////////////////////////
		/////////////////////////////								////////////////////////////////////////
		////////////////////////////	        FAQNA		   ////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////

		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.deleteConcertComment++");
		System.out.println("========================================");
		
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		session.delete("Comment.deleteConcertComment",vo.getConcertCommentVO());
		System.out.println("\n Delete 결과:: "  );
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");
		

		*/
		System.out.println("========================================");
		System.out.println("++Faqna.addFaqna++");
		System.out.println("========================================");
		temp_faqnVO_list= (ArrayList)session.selectList("Faqna.selectAllFaqna");
		System.out.println("현재 Faqna 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_faqnVO_list.size(); i++) {
			System.out.println(temp_faqnVO_list.get(i));
		}
		
		System.out.println("\nAdd 결과:: "  );
		session.insert("Comment.addConcertComment", vo.getConcertCommentVO());
		temp_faqnVO_list= (ArrayList)session.selectList("Faqna.selectAllFaqna");
		for (int i = 0; i < temp_faqnVO_list.size(); i++) {
			System.out.println(temp_faqnVO_list.get(i));
		}
		System.out.println("\n\n");
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.updateConcertComment++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		temp_concertCommentVO = vo.getConcertCommentVO4();
		temp_concertCommentVO.setConcertCommentLike(30);
		temp_concertCommentVO.setConcertCommentContent("업데이트했다 와하하");
		session.update("Comment.updateConcertComment", temp_concertCommentVO);
		System.out.println("\nUpdate 결과:: "  );
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.showConcertCommentById++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.showConcertCommentById",vo.getMemberVO());
		System.out.println("\nSearch By ID 결과:: "  );
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.updateConcertComment++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("Id=" + temp_concertVO_list.get(i).getConcertId()
					+ "\tcount = " + temp_concertVO_list.get(i).getConcertCommentCount());
		}
		
		temp_concertCommentVO = vo.getConcertCommentVO4();
		session.update("Comment.updateConcertCommentCount", temp_concertCommentVO);
		System.out.println("\nID "+temp_concertCommentVO.getConcertVO().getConcertId()+"번 Count +1 결과:: "  );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("Id=" + temp_concertVO_list.get(i).getConcertId()
					+ "\tcount = " + temp_concertVO_list.get(i).getConcertCommentCount());
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Comment.updateConcertCommentRating++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println("ID["+temp_ConcertCommentVO_list.get(i).getConcertCommentContent()+"]"
					+"\t평점["+temp_ConcertCommentVO_list.get(i).getConcertCommentRating()+"]");
		}
		
		temp_concertCommentVO = vo.getConcertCommentVO4();
		temp_concertCommentVO.setConcertCommentRating(1);
		session.update("Comment.updateConcertCommentRating", temp_concertCommentVO);
		System.out.println("\n 4번째 댓글 평점 -> 1점으로 업데이트 결과");
		temp_ConcertCommentVO_list= (ArrayList)session.selectList("Comment.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println("ID["+temp_ConcertCommentVO_list.get(i).getConcertCommentContent()+"]"
										+"\t평점["+temp_ConcertCommentVO_list.get(i).getConcertCommentRating()+"]");
		}
		System.out.println("\n\n");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("\n");
		temp_int = session.delete("Board.deleteConcertComment",vo.getConcertCommentVO());
		System.out.println("삭제 결과 = " + temp_int);
		
		temp_ConcertCommentVO_list = (ArrayList)session.selectList("Board.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		searchConcertComment
		 */
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
	
		
	}//main

}//class
