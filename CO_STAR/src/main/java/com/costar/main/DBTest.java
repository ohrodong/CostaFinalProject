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
public class DBTest {
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

			
		/////////////////////////////////////C O M M I T//////////////////////////////////////////
		//session.commit();
		//////////////////////////////////////////////////////////////////////////////////////////////		
		

		/////////////////////////////////////I N S E R T ///////////////////////////////////////////
		/*
		temp_int = session.insert("Member.addMember",vo.getMemberVO());
		temp_int = session.insert("Member.addMember",vo.getMemberVO2());
		temp_int = session.insert("Member.addMember",vo.getMemberVO3());
		
		temp_int2 = session.insert("Search.addConcert",vo.getConcertVO());
		temp_int2 = session.insert("Search.addConcert",vo.getConcertVO2());
		temp_int2 = session.insert("Search.addConcert",vo.getConcertVO3());
		temp_int2 = session.insert("Search.addConcert",vo.getConcertVO4());
		temp_int2 = session.insert("Search.addConcert",vo.getConcertVO5());
		temp_int2 = session.insert("Search.addConcert",vo.getConcertVO6());
		temp_int2 = session.insert("Search.addConcert",vo.getConcertVO7());
		
		temp_int3 = session.insert("Comment.addConcertComment",vo.getConcertCommentVO());
		temp_int3 = session.insert("Comment.addConcertComment",vo.getConcertCommentVO2());
		temp_int3 = session.insert("Comment.addConcertComment",vo.getConcertCommentVO3());
		temp_int3 = session.insert("Comment.addConcertComment",vo.getConcertCommentVO4());
		
		session.insert("Search.addSecondGenre",vo.getConcertSecondGenreVO());
		session.insert("Search.addSecondGenre",vo.getConcertSecondGenreVO2());
		session.insert("Search.addSecondGenre",vo.getConcertSecondGenreVO3());
		session.insert("Search.addSecondGenre",vo.getConcertSecondGenreVO4());
		session.insert("Search.addSecondGenre",vo.getConcertSecondGenreVO5());
		session.insert("Search.addSecondGenre",vo.getConcertSecondGenreVO6());
		session.insert("Search.addSecondGenre",vo.getConcertSecondGenreVO7());

		session.insert("Note.addNote",vo.getNoteVO());
		session.insert("Note.addNote",vo.getNoteVO2());
		session.insert("Note.addNote",vo.getNoteVO3());
		session.insert("Note.addNote",vo.getNoteVO4());

		session.insert("Notice.addNotice",vo.getNoticeVO());
		session.insert("Notice.addNotice",vo.getNoticeVO2());
		
		session.insert("Faqna.addFaqna",vo.getFaqnaVO());
		session.insert("Faqna.addFaqna",vo.getFaqnaVO2());
		
		session.insert("Historybookmark.addBookmark",vo.getHistoryBookmarkVO());
		session.insert("Historybookmark.addBookmark",vo.getHistoryBookmarkVO2());
		session.insert("Historybookmark.addBookmark",vo.getHistoryBookmarkVO3());

		session.commit();
		 */
		
		//////////////////////////////////////////////////////////////////////////////////////////////

		
		
		
		
		/////////////////////////////////////U P D A T E ///////////////////////////////////////////

//		vo.concertVO.setConcertCommentCount(1);
//		session.update("Historybookmark.updateBookmark",vo.getHistoryBookmarkVO3());
//		vo.concertVO2.setConcertCommentCount(3);
//		session.update("Search.updateConcert",vo.getConcertVO2());

//		temp_concertVO = vo.getConcertVO4();
//		session.insert("Search.addConcert",temp_concertVO);
//		session.commit();
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		/////////////////////////////////////D E L E T E ///////////////////////////////////////////
		/*
		ConcertVO delete_vo1 = concertVO;
		delete_vo1.setConcertId("0003");
		temp_string = "0003";
		temp_int = session.insert("Search.addConcert",delete_vo1);
		System.out.println("ID=" + temp_string + " 삽입 결과 = " + temp_int);
		temp_concertVO_list = (ArrayList)session.selectList("Search.searchAllConcert");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i).getConcertId());
		}
		
		temp_int = session.delete("Search.deleteConcert","0003");
		System.out.println("\n");
		System.out.println("삭제 결과 = " + temp_int);
		
		temp_concertVO =  session.selectOne("Search.selectByConcertId","0003");
		if(temp_concertVO != null){
			System.out.println(temp_concertVO.getConcertId() + " 삭제 실패");
		} else{
			System.out.println("ID=" + temp_string + " 삭제 성공!");
			temp_concertVO_list = (ArrayList)session.selectList("Search.searchAllConcert");
			for (int i = 0; i < temp_concertVO_list.size(); i++) {
				System.out.println(temp_concertVO_list.get(i).getConcertId());
			}
		}
		*/
		//////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		/*
		ArrayList<MemberVO> list = (ArrayList)session.selectList("Member.selectAllMember");
		ArrayList<ConcertVO> list2 = (ArrayList)session.selectList("Search.searchAllConcert");
		 */
		
//		
//		System.out.println("========================================");
//		System.out.println("++Member.selectAllMember++");
//		System.out.println("========================================");
//		temp_concertVO_list = (ArrayList)session.selectList("Member.selectAllMember");
//		for (int i = 0; i < temp_concertVO_list.size(); i++) {
//			System.out.println(temp_concertVO_list.get(i));
//		}
//		System.out.println("\n\n");
//		
		
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
		
		////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////                                       //////////////////////////////////////
		//////////////////////	R 	E	C	O	M	M	E	N	D	//////////////////////////////////////
		/////////////////////                                       //////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Concert.recommendByConcertAverageRating++");
		System.out.println("========================================");
		temp_concertVO_list= (ArrayList)session.selectList("Concert.searchAllConcert");
		System.out.println("현재 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t평균별점 = "+temp_concertVO_list.get(i).getConcertAverageRating());
		}
		
		System.out.println("\n추천결과:: "  );
		temp_concertVO_list = (ArrayList)session.selectList("Concert.recommendByConcertAverageRating");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println("["+i+"]:: ID = " + temp_concertVO_list.get(i).getConcertId()+"\t평균별점 = "+temp_concertVO_list.get(i).getConcertAverageRating());
		}
		System.out.println("\n\n");
		*/
		
		
		
	
		
		
		

		
		
		
		
		
		
		
		//	List<ConcertVO> list=session.selectList("User.getUserList");
	/*	
		//0. getUserList :: 모든 user 정보
		System.out.println(":: 0. all User(SELECT)  ? ");
		
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");

		//1. getUser :: 특정 userid 정보
		User user = (User)session.selectOne("User01.getUser", "user01");
		System.out.println(":: 1. get(SELECT)  ? "+user.toString());
		System.out.println("\n");
		
		//2. findUserId :: 특정 userid / password 정보
		user.setUserId("user03");
		user.setPassword("user03");
		String name = (String)session.selectOne("User01.findUserId", user);
		System.out.println(":: 2. get(SELECT)  ? "+name);
		
		*/
		
		
	}//end of main

}//end of class