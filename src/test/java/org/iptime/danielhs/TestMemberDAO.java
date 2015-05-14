package org.iptime.danielhs;

import org.iptime.danielhs.model.MemberDAO;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMemberDAO {
	ApplicationContext ctx;
	
	@Before
	public void readXML() {
		ctx = new ClassPathXmlApplicationContext("test.xml");
		assertNotNull(ctx);
	}
	
	@Test
	public void test() {
		MemberDAO dao=(MemberDAO)ctx.getBean("memberDAO");
		System.out.println(dao.findMemberById("admin"));
	}

}
