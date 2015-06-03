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
import com.costar.main.vo.NoteVO;

public class EtcTest {

	public static void main(String[] args) throws Exception{
		int temp_int=0, temp_int2=0, temp_int3=0;
		String temp_string="",temp_string2="",temp_string3="";
		ConcertVO temp_concertVO = null;
		NoteVO temp_noteVO = null;
		
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<NoteVO> temp_noteVO_list = null;
		
		VoCollection vo = new VoCollection();
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();
		/////////////////////////////////////SELECT ALL ///////////////////////////////////////////
		/*
		System.out.println("========================================");
		System.out.println("++selectAllConcert++");
		System.out.println("========================================");
		temp_concertVO_list = (ArrayList)session.selectList("Concert.showConcert");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++selectAllNote++");
		System.out.println("========================================");
		temp_noteVO_list = (ArrayList)session.selectList("Note.selectAllNote");
		for (int i = 0; i < temp_noteVO_list.size(); i++) {
			System.out.println(temp_noteVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		/////////////////////////////////////D E L E T E ///////////////////////////////////////////
//		
//		System.out.println("\n\n");
//		System.out.println("========================================");
//		System.out.println("++deleteNote++");
//		System.out.println("========================================");
//		temp_int = session.delete("Note.deleteNote","k@gmail.com");
//		System.out.println("삭제 결과 = " + temp_int);
//		
//		temp_noteVO_list = (ArrayList)session.selectList("Note.selectAllNote");
//		for (int i = 0; i < temp_noteVO_list.size(); i++) {
//			System.out.println(temp_noteVO_list.get(i));
//		}
//		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		/////////////////////////////////////SEARCH NOTE///////////////////////////////////////////
//
//		System.out.println("\n\n");
//		System.out.println("========================================");
//		System.out.println("++searchNote++");
//		System.out.println("========================================");
//		temp_noteVO_list = (ArrayList)session.selectList("Note.searchNote", "k@gmail.com");
//		for (int i = 0; i < temp_noteVO_list.size(); i++) {
//			System.out.println(temp_noteVO_list.get(i));
//		}
//		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		

		
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
		
		
		
		
		
		/////////////////////////////////////RECOMMEND ///////////////////////////////////////////
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertAverageRating++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.selectAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t평균별점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		
		System.out.println("\n평점별 추천결과:: "  );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.recommendByConcertAverageRating");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t평균별점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertConcertComment++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.selectAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		
		System.out.println("\n댓글 갯수 별 추천결과:: "  );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.recommendByConcertConcertComment");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertMonth++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.selectAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		temp_string = "05";
		temp_string2 = "2015"+temp_string+"01";
		System.out.println("\n월별 추천결과:: "  );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.recommendByConcertMonth",temp_string2);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertHits++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.selectAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t조회수 = "+temp_concertVO_list.get(i).getConcertHits()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		temp_string = "05";
		temp_string2 = "2015"+temp_string+"01";
		System.out.println("\n인기순 추천결과:: "  );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.recommendByConcertHits",temp_string2);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t조회수 = "+temp_concertVO_list.get(i).getConcertHits()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertDate++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.selectAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		temp_string = "20150301";
		System.out.println("\n날짜별 추천결과:: " + temp_string  );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.recommendByConcertDate",temp_string);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertArea++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.selectAll");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
		}
		
		temp_concertVO = vo.getConcertVO5();
		temp_concertVO.setConcertArea("강북구");
		temp_concertVO.setConcertStartDate("20150501");
		System.out.println("\n지역별 추천결과:: " + temp_concertVO.getConcertArea() + ", "+ temp_concertVO.getConcertStartDate() );
		temp_concertVO_list= (ArrayList)session.selectList("Concert.recommendByConcertArea",temp_concertVO);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertIsForeign++");
		System.out.println("========================================");
		temp_concertSecondGenreVO_list= (ArrayList)session.selectList("Concert.selectSecondGenre");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertSecondGenreVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertSecondGenreVO_list.get(i).getConcertSecondGenreNo()
					+"\t2차 장르 = "+temp_concertSecondGenreVO_list.get(i).getConcertSecondGenre());
		}
		
		System.out.println("\n내한공연 추천결과:: ");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.recommendByConcertIsForeign");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
					+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
			}
		System.out.println("\n\n");
		*/
		
		
	}//main

}//class
