package org.tain.hello.dao;

import java.util.List;

import org.tain.hello.vo.Person;

public interface PersonDao {

	public List<Person> selectAll(); // 모든 행 가져오기
	public Person selectById(int id); // 특정한 행 가져오기
	public int insert(Person person); // 삽입
	public void update(Person person); // 업데이트
	public void delete(int id); // 삭제
}
