package com.costar.main;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.costar.main.vo.ConcertVO;

public class DBTest {

	public static void main(String[] args) {
		// commit를 해야 디비에 반영됨
		try {
			Reader reader = Resources
					.getResourceAsReader("config/SqlMapConfig.xml");

			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(reader);
			SqlSession session = factory.openSession();

			List<ConcertVO> listWordListResult = session
					.selectList("test.total");
			System.out.println(listWordListResult);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
