package dao;

import org.apache.ibatis.session.SqlSession;

import vo.DictionVO;
import vo.ReferVO;

public class DictionDAO {

	private SqlSession sqlSession;
	
	public DictionDAO(SqlSession sqlSession) { 
		this.sqlSession = sqlSession;				
	}

	public int insertK(DictionVO kvo) {
		sqlSession.insert("diction.insertK", kvo);
		return kvo.getDiction_no();
	}

	public int insertE(DictionVO evo) {
		sqlSession.insert("diction.insertE", evo);
		return evo.getDiction_no();
	}

	public int insertRefer(ReferVO vo) {
		return sqlSession.insert("diction.insertRefer", vo);
	}
}
