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
		ConcertVO temp_concertVO = null;
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<ConcertCommentVO> temp_ConcertCommentVO_list = null;
		VoCollection vo = new VoCollection();
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();

		

		/////////////////////////////////////I N S E R T ///////////////////////////////////////////
		/*
		temp_int = session.insert("Member.addMember",vo.getMemberVO());
		temp_int = session.insert("Member.addMember",vo.getMemberVO2());
		temp_int = session.insert("Member.addMember",vo.getMemberVO3());
		*/
		//////////////////////////////////////////////////////////////////////////////////////////////

		
		
		
		
		
		
	}//end of main

}//end of class