package org.tain.hello.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.tain.hello.dao.PersonDao;
import org.tain.hello.mybatis.MyBatisConnectionFactory;
import org.tain.hello.vo.Person;

public class MyBatisTestMain {
	
	private static final boolean flag = true;
	
	public static void main(String args[]) {

		// Mybatis 세션연결
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(true);
		
		// Mapper 연결
		PersonDao personDao = sqlSession.getMapper(PersonDao.class);

		// domain
		Person p = null;
		
		if (flag) {
			// Insert
			for (int i=0; i < 20; i++) {
				p = new Person(String.format("Name-%03d", i));
				personDao.insert(p);
			}
			System.out.println("Insert OK!!");
		}
		
		if (flag) {
			// Select
			List<Person> persons = personDao.selectAll();
			for (int i = 0; i < persons.size(); i++) {
				System.out.println(">>>>> Person : " + persons.get(i));
			}
		}
		if (flag) {
			// update
			p = new Person("Terry");
			p.setId(14);
			personDao.update(p);
			System.out.println("Update Person : " + personDao.selectById(p.getId()));
		}

		if (flag) {
			// Delete
			personDao.delete(16);
			System.out.println("Delete OK!!!");
		}
		
		if (flag) {
			// Select
			List<Person> persons = personDao.selectAll();
			for (int i = 0; i < persons.size(); i++) {
				System.out.println(">>>>> Person : " + persons.get(i));
			}
		}
		
		if (flag) {
			// Delete All
			personDao.deleteAll();
			System.out.println("Delete All OK!!!");
		}
	}
}


