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
public class SearchTest {
	public static void main(String[] args) throws Exception{
		int temp_int=0, temp_int2=0, temp_int3=0;
		String temp_string="",temp_string2="",temp_string3="";
		ConcertVO temp_concertVO = null;
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<ConcertCommentVO> temp_ConcertCommentVO_list = null;
		VoCollection vo = new VoCollection();
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();

			
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchAllConcert++");
		System.out.println("========================================");
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchAllConcert");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i));
		}
		System.out.println("\n\n");*/
		
		/*
		System.out.println("========================================");
		System.out.println("++ConcertComment.selectAll++");
		System.out.println("========================================");
		temp_ConcertCommentVO_list = (ArrayList)session.selectList("Board.selectConcertCommentAll");
		for (int i = 0; i < temp_ConcertCommentVO_list.size(); i++) {
			System.out.println(temp_ConcertCommentVO_list.get(i));
		}
		System.out.println("\n\n");*/

		/*
		System.out.println("========================================");
		System.out.println("++Search.searchAllConcert++");
		System.out.println("========================================");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.selectByConcertId++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.selectByConcertId");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId());
		}
		
		temp_string = "0001";
		System.out.println("\n검색결과:: " + temp_string);
		temp_concertVO = session.selectOne("Search.selectByConcertId",temp_string);
		System.out.println("ID = " + temp_concertVO.getConcertId());
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchByConcertName++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t콘서트명 = "+temp_concertVO_list.get(i).getConcertName()	);
		}
		
		temp_string = "텀";
		System.out.println("\n검색결과:: " + temp_string);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchByConcertName",temp_string);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t콘서트명 = "+temp_concertVO_list.get(i).getConcertName()	);
		}
		System.out.println("\n\n");
		*/
		
		
		
		
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchByConcertMonth++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate());
		}
		
		temp_int = 5;
		temp_int2 = 1;
		System.out.println("\n검색결과:: " + temp_int);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchByConcertMonth",temp_int);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t시작일 = "+temp_concertVO_list.get(i).getConcertStartDate()
					+"\t종료일 = "+temp_concertVO_list.get(i).getConcertEndDate());
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchByConcertArea++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
		}
		
		temp_string = "강북";
		System.out.println("\n검색결과:: " + temp_string);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchByConcertArea",temp_string);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t지역구 = "+temp_concertVO_list.get(i).getConcertArea());
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchByConcertFirstGenre++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t장르 = "+temp_concertVO_list.get(i).getConcertFirstGenre());
		}
		
		temp_string = "뮤지";
		System.out.println("\n검색결과:: " + temp_string);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchByConcertFirstGenre",temp_string);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t장르 = "+temp_concertVO_list.get(i).getConcertFirstGenre());
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchByConcertActor++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t배우 = "+temp_concertVO_list.get(i).getConcertActors());
		}
		
		temp_string = "경구";
		System.out.println("\n검색결과:: " + temp_string);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchByConcertActor",temp_string);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t배우 = "+temp_concertVO_list.get(i).getConcertActors());
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchByConcertCompany++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()
					+"\t회사 = "+temp_concertVO_list.get(i).getConcertCompany());
		}
		
		temp_string = "y";
		System.out.println("\n검색결과:: " + temp_string);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchByConcertCompany",temp_string);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t회사 = "+temp_concertVO_list.get(i).getConcertCompany());
		}
		System.out.println("\n\n");
		*/
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Search.searchByConcertHall++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Search.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t장소 = "+temp_concertVO_list.get(i).getConcertHall());
		}
		
		temp_string = "세종";
		System.out.println("\n검색결과:: "  + temp_string);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchByConcertHall",temp_string);
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t장소 = "+temp_concertVO_list.get(i).getConcertHall());
		}
		System.out.println("\n\n");
		*/
		
		
		
	}//end of main

}//end of class