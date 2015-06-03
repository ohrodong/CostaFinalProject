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
<<<<<<< HEAD
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

		
		
//		Historybookmark
		
		session.selectList("Historybookmark.showHistory");
=======
import com.costar.main.vo.HistoryBookmarkVO;
import com.costar.main.vo.NoteVO;

public class EtcTest {

	public static void main(String[] args) throws Exception{
		int temp_int=0, temp_int2=0, temp_int3=0;
		String temp_string="",temp_string2="",temp_string3="";
		ConcertVO temp_concertVO = null;
		NoteVO temp_noteVO = null;
		HistoryBookmarkVO temp_historyBookmarkVO = null;
		
		ArrayList<ConcertVO> temp_concertVO_list = null;
		ArrayList<NoteVO> temp_noteVO_list = null;
		ArrayList<HistoryBookmarkVO> temp_historyBookmarkVO_list = null;
		
		VoCollection vo = new VoCollection();
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session=factory.openSession();

		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////							////////////////////////////////////////
		/////////////////////////////								////////////////////////////////////////
		//////////////////////////// HISTORYBOOKMARK   ////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println("========================================");
		System.out.println("++Historybookmark.showHistoryBookmark++");
		System.out.println("========================================");
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		System.out.println("현재 Historybookmark 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		System.out.println("\n\n");

		
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////										//////////////////////////
		/////////////////////////            예비 기능                    //////////////////////////
		////////////////////////										//////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		/*
		*/
		
		
		System.out.println("========================================");
		System.out.println("++Historybookmark.deleteBookmark++");
		System.out.println("========================================");
		
		session.delete("Historybookmark.deleteBookmark",vo.getHistoryBookmarkVO3());
		System.out.println("\n Delete 결과:: "  );
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		System.out.println("\n\n");
		
		/*
		*/
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * */
		System.out.println("========================================");
		System.out.println("++Historybookmark.addHistory++");
		System.out.println("========================================");
		
		session.insert("Historybookmark.addHistory",vo.getHistoryBookmarkVO3());
		System.out.println("\n Add Bookmark 결과:: "  );
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		System.out.println("\n\n");
		/*
		*/
		
		/*
		*/
		
		temp_string = "hhhh@hanmail.com";
		System.out.println("========================================");
		System.out.println("++Historybookmark.showBookmark++\t\t["+ temp_string+"]" );
		System.out.println("========================================");
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		System.out.println("현재 Historybookmark 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		
		
		temp_concertVO_list=(ArrayList)session.selectList("Historybookmark.showBookmark",temp_string);
		System.out.println("\n Bookmark만 Show 결과:: "  );
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i));
		}
		System.out.println("\n\n");
		/*
		*/
		

		
		/*
		*/
		temp_string = "hhhh@hanmail.com";
		System.out.println("========================================");
		System.out.println("++Historybookmark.showHistory++\t\t["+temp_string+"]");
		System.out.println("========================================");
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		System.out.println("현재 Historybookmark 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		
		
		temp_concertVO_list=(ArrayList)session.selectList("Historybookmark.showHistory",temp_string);
		System.out.println("\n history만 Show 결과:: "  );
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i));
		}
		System.out.println("\n\n");
		/*
		*/
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////							////////////////////////////////////////
		/////////////////////////////								////////////////////////////////////////
		////////////////////////////           NOTE            ////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		////////////////////////////								////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////

		
		System.out.println("========================================");
		System.out.println("++Note.selectAllNote++");
		System.out.println("========================================");
		temp_noteVO_list = (ArrayList)session.selectList("Note.selectAllNote");
		for (int i = 0; i < temp_noteVO_list.size(); i++) {
			System.out.println(temp_noteVO_list.get(i));
		}
		System.out.println("\n\n");
		
		
		/*
		System.out.println("========================================");
		System.out.println("++Note.deleteNote++");
		System.out.println("========================================");
		temp_int = session.delete("Note.deleteNote","k@gmail.com");
		System.out.println("삭제 결과 = " + temp_int);
		
		temp_noteVO_list = (ArrayList)session.selectList("Note.selectAllNote");
		for (int i = 0; i < temp_noteVO_list.size(); i++) {
			System.out.println(temp_noteVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		
		/*
		temp_string = "k@gmail.com";
		System.out.println("========================================");
		System.out.println("++Note.searchNoteByMemberId++ \t\t["+ temp_string + "]");
		System.out.println("========================================");
		temp_noteVO_list = (ArrayList)session.selectList("Note.searchNoteByMemberId", temp_string);
		for (int i = 0; i < temp_noteVO_list.size(); i++) {
			System.out.println(temp_noteVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
>>>>>>> refs/remotes/originohdong/test
		
	}//main

}//class
