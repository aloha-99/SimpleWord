package service;

import java.util.List;

import dao.DictionDAO;
import dao.WordDAO;
import vo.AdminVO;
import vo.DictionVO;
import vo.ReferVO;
import vo.WordVO;

public class WordService {

		private WordDAO worddao;
		private DictionDAO dicdao;
		
		public WordService(WordDAO worddao, DictionDAO dicdao) {
			this.worddao = worddao;
			this.dicdao = dicdao;
		}
		public List<WordVO> userWordList(int user_no) {
			return worddao.userWordList(user_no);
		}
		public int update(WordVO vo) {
			return worddao.update(vo);
		}
		public String getMemo(int word_no) {
			return worddao.getMemo(word_no);
		}
		public int delete(int word_no) {
			return worddao.delete(word_no);
		}
		public List<AdminVO> meaningList(DictionVO vo) {
			return worddao.meaningList(vo);
		}
		public int insert(WordVO vo) {
			return worddao.insert(vo);
		}
		public int updateLike(WordVO vo) {
			return worddao.updateLike(vo);
		}
		public int inertK(DictionVO kvo) {
			return dicdao.insertK(kvo);
		}
		public int insertE(DictionVO evo) {
			return dicdao.insertE(evo);
		}
		public int insertRefer(ReferVO vo) {
			return dicdao.insertRefer(vo);
		}

	}
