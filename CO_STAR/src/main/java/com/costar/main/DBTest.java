package com.costar.main;



import java.io.Reader;
import java.util.ArrayList;

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
		
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();

		///데이터 입력/////
		MemberVO memberVO = new MemberVO(
				"k@gmail.com",//String memberId;
				"password",//String memberPw;
				"삼청동",//String memberAddr;
				"01066527322",//String memberTelNum;
				"042-628-6666",//String memberCompanyNum;
				333,//int memberAuthority;
				"강북구",//String memberArea;
				"남",//String memberGender;
				1988,//int memberBirthYear;
				"",//String memberAddDate;//Date
				""//String memberUpdateDate;//Date
				);
		
		ConcertVO concertVO = new ConcertVO(
				"0001",//String concertId; 
				"팬텀2222", //String concertName;
				"20150531",//String concertStartDate;//Date 
				"2015-09-10",//String concertEndDate;//Date
				"뮤지컬",//String concertFirstGenre; 
				"세종문화회관", //String concertHall;
				"강북구",//String concertArea;
				"www.naver.com", //String concertWebSite;
				"20세이상",//String concertViewAge; 
				"120분",//String concertRunningTime; 
				"공지사항",//String concertNotice;
				"CJEntertainment",//String concertCompany; 
				"한예슬", //String concertActors;
				"",//String concertWriteTime;//Date 
				"",//String concertUpdateTime;//Date 
				"30",//String concertAverageRating; 
				120,//int concertHits; 
				memberVO//MemberVO memberVO;
				);
		
		ConcertVO concertVO2 = new ConcertVO(
				"0002",//String concertId; 
				"22유텀령22", //String concertName;
				"20150531",//String concertStartDate;//Date 
				"2015-09-10",//String concertEndDate;//Date
				"뮤지컬",//String concertFirstGenre; 
				"세종문화회관", //String concertHall;
				"강북구",//String concertArea;
				"www.naver.com", //String concertWebSite;
				"20세이상",//String concertViewAge; 
				"120분",//String concertRunningTime; 
				"공지사항",//String concertNotice;
				"CJEntertainment",//String concertCompany; 
				"한예슬", //String concertActors;
				"",//String concertWriteTime;//Date 
				"",//String concertUpdateTime;//Date 
				"30",//String concertAverageRating; 
				120,//int concertHits; 
				memberVO//MemberVO memberVO;
				);

		/////////////////////////////////////C O M M I T//////////////////////////////////////////
		//session.commit();
		//////////////////////////////////////////////////////////////////////////////////////////////		
		

		/////////////////////////////////////I N S E R T ///////////////////////////////////////////
		/*
		temp_int = session.insert("Member.addConcert",memberVO);
		temp_int2 = session.insert("Concert.addConcert",concertVO);
		temp_int3 = session.insert("Concert.addConcert",concertVO2);
		System.out.println("Member add의 결과는 == " + temp_int);
		System.out.println("Concert add의 결과는 == " + temp_int2);
		System.out.println("Concert add의 결과는 == " + temp_int3);
		
		*/
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		/////////////////////////////////////U P D A T E ///////////////////////////////////////////
		/*
		ConcertVO update_vo1 = concertVO;
		update_vo1.setConcertId("0003");
		temp_int = session.insert("Concert.addConcert",update_vo1);
		temp_concertVO =  session.selectOne("Concert.selectByConcertId","0003");
		System.out.println("업데이트 전 지역구 = " + temp_concertVO.getConcertArea());
		
		update_vo1.setConcertArea("영등포구");
		temp_int = session.update("Concert.updateConcert",update_vo1);
		System.out.println("update_vo1 Update 결과 = " + temp_int);
		temp_concertVO =  session.selectOne("Concert.selectByConcertId","0003");
		System.out.println("업데이트 후 지역구 = " + temp_concertVO.getConcertArea());
		*/
		//////////////////////////////////////////////////////////////////////////////////////////////
		

		
		/////////////////////////////////////D E L E T E ///////////////////////////////////////////
		/*
		ConcertVO delete_vo1 = concertVO;
		delete_vo1.setConcertId("0003");
		temp_string = "0003";
		temp_int = session.insert("Concert.addConcert",delete_vo1);
		System.out.println("ID=" + temp_string + " 삽입 결과 = " + temp_int);
		temp_concertVO_list = (ArrayList)session.selectList("Concert.selectAll");
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i).getConcertId());
		}
		
		temp_int = session.delete("Concert.deleteConcert","0003");
		System.out.println("\n");
		System.out.println("삭제 결과 = " + temp_int);
		
		temp_concertVO =  session.selectOne("Concert.selectByConcertId","0003");
		if(temp_concertVO != null){
			System.out.println(temp_concertVO.getConcertId() + " 삭제 실패");
		} else{
			System.out.println("ID=" + temp_string + " 삭제 성공!");
			temp_concertVO_list = (ArrayList)session.selectList("Concert.selectAll");
			for (int i = 0; i < temp_concertVO_list.size(); i++) {
				System.out.println(temp_concertVO_list.get(i).getConcertId());
			}
		}
		*/
		//////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		
		ArrayList<MemberVO> list = (ArrayList)session.selectList("Member.selectAll");
		ArrayList<ConcertVO> list2 = (ArrayList)session.selectList("Concert.selectAll");
		System.out.println("========================================");
		System.out.println("++Member.selectAll++");
		System.out.println("========================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n\n");
		
		
		System.out.println("========================================");
		System.out.println("++Concert.selectAll++");
		System.out.println("========================================");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("\n\n");
		
		
		list2 = (ArrayList)session.selectList("Concert.searchByConcertName","텀");
		System.out.println("++Concert.searchByConcertName++");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("\n\n");
		
		
		System.out.println("========================================");
		System.out.println("++Concert.searchByMonth++");
		System.out.println("========================================");
		list2 = (ArrayList)session.selectList("Concert.searchByMonth",4);
		//list2 = (ArrayList)session.selectList("Concert.searchByMonth",6);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("\n\n");
		
		
		System.out.println("========================================");
		System.out.println("++Concert.searchByConcertAreaInIndexPage++");
		System.out.println("========================================");
		list2 = (ArrayList)session.selectList("Concert.searchByConcertAreaInIndexPage","등포");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("\n\n");
		
		
		
		
		
		
		
		
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