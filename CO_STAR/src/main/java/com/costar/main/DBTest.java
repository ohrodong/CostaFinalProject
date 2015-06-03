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

		
		
		
		
		
	}//end of main

}//end of class