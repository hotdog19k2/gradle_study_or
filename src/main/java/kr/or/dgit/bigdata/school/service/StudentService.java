package kr.or.dgit.bigdata.school.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.school.dao.StudentDao;
import kr.or.dgit.bigdata.school.dto.Student;
import kr.or.dgit.bigdata.school.util.MyBatisSqlSessionFactory;

public class StudentService {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(StudentService.class);

	private static final StudentService instance = new StudentService();

	public static StudentService getInstance() {
		return instance;
	}

	private StudentService() {
	}


	public List<Student> findAllStudent() {
		if (logger.isDebugEnabled()) {
			logger.debug("findAllStudent() - start");
		}

//		logger.debug("selectbyAll()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
		try {
			List<Student> returnList = studentDao.selectByAll();
			if (logger.isDebugEnabled()) {
				logger.debug("findAllStudent() - end");
			}
			return returnList;
		} finally {
			sqlSession.close();
		}
	}
	
	public Student selectByNo(int studId){
//		logger.debug("selectByNo()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
		try {
			return studentDao.selectByNo(studId);
		} finally {
			sqlSession.close();
		}
	}
	
	public void insertItem(Student std){
//		logger.debug("insertItem()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
		try {
			studentDao.insertItem(std);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	public void deleteItem(int idx){
//		logger.debug("deleteItem()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
		try {
			studentDao.deleteItem(idx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	public void updateItem(Student std){
//		logger.debug("updateItem()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
		try {
			studentDao.updateItem(std);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
