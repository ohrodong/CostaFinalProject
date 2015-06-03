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

		
		
//		Historybookmark
		
//		session.selectList("Historybookmark.showHistory")
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

		
		/*
		System.out.println("========================================");
		System.out.println("++Historybookmark.deleteBookmark++");
		System.out.println("========================================");
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		System.out.println("현재 Historybookmark 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		
		session.delete("Historybookmark.deleteBookmark",vo.getHistoryBookmarkVO3());
		System.out.println("\n Delete 결과:: "  );
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		System.out.println("\n\n");
		
		
		
		System.out.println("========================================");
		System.out.println("++Historybookmark.addBookmark++");
		System.out.println("========================================");
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		System.out.println("현재 Historybookmark 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		
		session.insert("Historybookmark.addBookmark",vo.getHistoryBookmarkVO3());
		System.out.println("\n Add Bookmark 결과:: "  );
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		/*
		System.out.println("========================================");
		System.out.println("++Historybookmark.showBookmark++");
		System.out.println("========================================");
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		System.out.println("현재 Historybookmark 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		
		temp_string = "hhhh@hanmail.com";
		temp_concertVO_list=(ArrayList)session.selectList("Historybookmark.showBookmark",temp_string);
		System.out.println("\n Bookmark만 Show 결과:: "  );
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		

		
		/*
		System.out.println("========================================");
		System.out.println("++Historybookmark.showHistory++");
		System.out.println("========================================");
		temp_historyBookmarkVO_list=(ArrayList)session.selectList("Historybookmark.showHistoryBookmark");
		System.out.println("현재 Historybookmark 테이블에 저장되어 있는 값::");
		for (int i = 0; i < temp_historyBookmarkVO_list.size(); i++) {
			System.out.println(temp_historyBookmarkVO_list.get(i));
		}
		
		temp_string = "hhhh@hanmail.com";
		temp_concertVO_list=(ArrayList)session.selectList("Historybookmark.showHistory",temp_string);
		System.out.println("\n Bookmark만 Show 결과:: "  );
		for (int i = 0; i < temp_concertVO_list.size(); i++) {
			System.out.println(temp_concertVO_list.get(i));
		}
		System.out.println("\n\n");
		*/
		
		
		
		
		
	}//main

}//class
