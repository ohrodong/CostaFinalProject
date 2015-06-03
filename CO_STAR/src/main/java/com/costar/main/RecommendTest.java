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

public class RecommendTest {

	public static void main(String[] args) throws Exception{
		int temp_int=0, temp_int2=0, temp_int3=0;
		String temp_string="",temp_string2="",temp_string3="";
		ConcertVO temp_concertVO = null;
		ConcertCommentVO temp_concertCommentVO = null;
		ConcertSecondGenreVO temp_concertSecondGenreVO = null;
		
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<ConcertCommentVO> temp_ConcertCommentVO_list = null;
		ArrayList<ConcertSecondGenreVO> temp_concertSecondGenreVO_list = null;
		
		VoCollection vo = new VoCollection();
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();

		/////////////////////////////////////RECOMMEND ///////////////////////////////////////////
//
//		System.out.println("========================================");
//		System.out.println("++Recommend.recommendByConcertAverageRating++");
//		System.out.println("========================================");
//		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
//		System.out.println("현재 테이블에 저장되어 있는 값::");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t평균별점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
//					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		
//		System.out.println("\n평점별 추천결과:: "  );
//		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertAverageRating");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t평균별점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
//					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		System.out.println("\n\n");
//		
		
		
//
//		System.out.println("========================================");
//		System.out.println("++Recommend.recommendByConcertConcertComment++");
//		System.out.println("========================================");
//		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
//		System.out.println("현재 테이블에 저장되어 있는 값::");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		
//		System.out.println("\n댓글 갯수 별 추천결과:: "  );
//		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertConcertComment");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		System.out.println("\n\n");
//		
		
		
//		
//		System.out.println("========================================");
//		System.out.println("++Recommend.recommendByConcertMonth++");
//		System.out.println("========================================");
//		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
//		System.out.println("현재 테이블에 저장되어 있는 값::");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		temp_string = "05";
//		temp_string2 = "2015"+temp_string+"01";
//		System.out.println("\n월별 추천결과:: "  );
//		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertMonth",temp_string2);
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		System.out.println("\n\n");
//		
		
		
		
//		
//		System.out.println("========================================");
//		System.out.println("++Recommend.recommendByConcertHits++");
//		System.out.println("========================================");
//		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
//		System.out.println("현재 테이블에 저장되어 있는 값::");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t조회수 = "+temp_concertVO_list.get(i).getConcertHits()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		temp_string = "05";
//		temp_string2 = "2015"+temp_string+"01";
//		System.out.println("\n인기순 추천결과:: "  );
//		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertHits",temp_string2);
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t조회수 = "+temp_concertVO_list.get(i).getConcertHits()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		System.out.println("\n\n");
//		
		
		
		
//		
//		System.out.println("========================================");
//		System.out.println("++Recommend.recommendByConcertDate++");
//		System.out.println("========================================");
//		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
//		System.out.println("현재 테이블에 저장되어 있는 값::");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		temp_string = "20150301";
//		System.out.println("\n날짜별 추천결과:: " + temp_string  );
//		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertDate",temp_string);
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t평균평점 = "+temp_concertVO_list.get(i).getConcertAverageRating()
//					+"\t댓글 수 = "+temp_concertVO_list.get(i).getConcertCommentCount());
//		}
//		System.out.println("\n\n");
//		
		
		/* 미완미완미완
		///////////////////////////////미완성/////////////////////////////////////////////////
		System.out.println("========================================");
		System.out.println("++Recommend.recommendByConcertGenre++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t1차 장르 = "+temp_concertVO_list.get(i).getConcertFirstGenre());
		}
		
		System.out.println("\n2차 장르:: " );
		temp_concertSecondGenreVO_list= (ArrayList)session.selectList("Concert.selectSecondGenre");
		for (int i = 0; i < temp_concertSecondGenreVO_list.size(); i++) {
			System.out.println("["+i+"]:: concertID = " + temp_concertSecondGenreVO_list.get(i).getConcertId().getConcertId()
					+"\t2차 장르 = "+temp_concertSecondGenreVO_list.get(i).getConcertSecondGenre());
		}
		System.out.println("\n장르별 추천결과:: " );
		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertGenre", "공연");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t1차 장르 = "+temp_concertVO_list.get(i).getConcertFirstGenre());
		}
		System.out.println("\n\n");
		/////////////////////////////////미완성/////////////////////////////////////////////////
		*/
		
		
		
		
//		
//		System.out.println("========================================");
//		System.out.println("++Recommend.recommendByConcertArea++");
//		System.out.println("========================================");
//		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
//		System.out.println("현재 테이블에 저장되어 있는 값::");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
//		}
//		
//		temp_concertVO = vo.getConcertVO5();
//		temp_concertVO.setConcertArea("강북구");
//		temp_concertVO.setConcertStartDate("20150501");
//		System.out.println("\n지역별 추천결과:: " + temp_concertVO.getConcertArea() + ", "+ temp_concertVO.getConcertStartDate() );
//		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertArea",temp_concertVO);
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
//		}
//		System.out.println("\n\n");
//		
		
		
		
//		
//		System.out.println("========================================");
//		System.out.println("++Recommend.recommendByConcertIsForeign++");
//		System.out.println("========================================");
//		temp_concertSecondGenreVO_list= (ArrayList)session.selectList("Concert.selectSecondGenre");
//		System.out.println("현재 테이블에 저장되어 있는 값::");
//		for (int i = 0; i < temp_concertSecondGenreVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertSecondGenreVO_list.get(i).getConcertSecondGenreNo()
//					+"\t2차 장르 = "+temp_concertSecondGenreVO_list.get(i).getConcertSecondGenre());
//		}
//		
//		System.out.println("\n내한공연 추천결과:: ");
//		temp_concertVO_list= (ArrayList)session.selectList("Recommend.recommendByConcertIsForeign");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
//					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
//					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate()
//					+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
//			}
//		System.out.println("\n\n");
//		
		
		
	}//main

}//class
