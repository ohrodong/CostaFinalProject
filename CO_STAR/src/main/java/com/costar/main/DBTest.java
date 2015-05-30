package com.costar.main;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBTest {

	public static void main(String[] args) {
		// commit를 해야 디비에 반영됨
		try {
			Reader reader = Resources
					.getResourceAsReader("config/SqlMapConfig.xml");

			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(reader);
			SqlSession session = factory.openSession();
		 
//			session.


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
