package service;

import java.util.List;

import dao.DictionDAO;
import vo.DictionVO;
import vo.ReferVO;


public class DictionService {

		private DictionDAO dicDao;
		
		public DictionService(DictionDAO dicDao) {
			this.dicDao = dicDao;
		}

		public int inertK(DictionVO kvo) {
			return dicDao.insertK(kvo);
		}

		public int insertE(DictionVO evo) {
			return dicDao.insertE(evo);
		}

		public int insertRefer(ReferVO vo) {
			return dicDao.insertRefer(vo);
		}
		

}
