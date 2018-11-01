package org.tain.hello.dao;

import java.util.List;

import org.tain.hello.vo.Person;

public interface PersonDao {

	public List<Person> selectAll(); // ��� �� ��������
	public Person selectById(int id); // Ư���� �� ��������
	public int insert(Person person); // ����
	public void update(Person person); // ������Ʈ
	public void delete(int id); // ����
}
