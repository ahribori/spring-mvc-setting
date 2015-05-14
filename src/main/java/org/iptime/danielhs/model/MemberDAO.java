package org.iptime.danielhs.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

/**
 * spring containerë¡œë???SqlSessionFactoryBean??ê°??ê³??ˆëŠ”
 * SqlSessionTemplate ê°ì²´ë¥?ì£¼ìž…(DI)ë°›ëŠ”?? 
 * 
 * SqlSessionTempate>SqlSessionFactoryBean>dbcp 
 * @author KOSTA
 *
 */
public class MemberDAO {
	private SqlSessionTemplate sqlSessionTemplate;
	public MemberDAO(SqlSessionTemplate sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public MemberVO findMemberById(String id){
		return sqlSessionTemplate.selectOne(
				"member.findMemberById",id);
	}
	public void register(MemberVO vo){
		sqlSessionTemplate.insert("member.register",vo);
	}
	public List<MemberVO> findByAddress(String address) {
		return sqlSessionTemplate.selectList("member.findByAddress",address);
	}
}












