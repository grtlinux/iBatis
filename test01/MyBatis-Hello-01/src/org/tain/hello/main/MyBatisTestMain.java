package org.tain.hello.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.tain.hello.dao.PersonDao;
import org.tain.hello.mybatis.MyBatisConnectionFactory;
import org.tain.hello.vo.Person;

public class MyBatisTestMain {
	
	public static void main(String args[]) {

		// Mybatis 세션연결
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(true);
		
		// Mapper 연결
		PersonDao person = sqlSession.getMapper(PersonDao.class);

		// Select
		List<Person> persons = null;
		persons = person.selectAll();
		for (int i = 0; i < persons.size(); i++) {
			System.out.println("Person Name : " + persons.get(i).getName());
		}

		// Insert
		Person p = new Person();
		p.setName("테스터");
		person.insert(p);
		System.out.println("return key : " + p.getId());

		// update
		p.setId(14);
		p.setName("Terry");
		person.update(p);
		System.out.println("return key : " + p.getId());

		// Delete
		p.setId(16);
		person.delete(p.getId());
		System.out.println("return key : " + p.getId());
	}
}


