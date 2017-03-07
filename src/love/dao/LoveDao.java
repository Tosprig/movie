package love.dao;


import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import bigbang.HibernateSessionFactory;

public class LoveDao {// Database Access Object 数据库连接对象
	

	
    public void delete(String name) {
        Session session = HibernateSessionFactory.getSession();//开启一个会话
		try {
			//System.out.println("DAO:"+name);
            session.beginTransaction();//开启一个事务
			Love instance = (Love)session.get("love.dao.Love", name);
			session.delete(instance);
            session.getTransaction().commit();//提交事务
		} catch (RuntimeException e) {
            session.getTransaction().rollback();//如果出错，回滚事务（撤回）
			throw e;
		}finally{
			session.close();//关闭会话
		}
	}
	public void add(Love love){
		Session session = HibernateSessionFactory.getSession();//开启一个会话
		try{
			session.beginTransaction();//开启一个事务
			session.save(love);
			session.getTransaction().commit();//提交事务
		}
		catch(RuntimeException e){
			session.getTransaction().rollback();//如果出错，回滚事务（撤回）
			throw e;
		}finally{
			session.close();//关闭会话
		}
	}
	/**
	 * 返回数据库中所有Love
	 * @return
	 */
	public List<Love> show(){
		Session session = HibernateSessionFactory.getSession();//开启一个会话
		try{
			session.beginTransaction();//开启一个事务
			List<Love> instance = session.createQuery("from Love").list();//一list类返回所有Love类型的对象
			session.getTransaction().commit();//提交事务
			return instance;
		}catch(RuntimeException e){
			session.getTransaction().rollback();//如果出错，回滚事务（撤回）
			throw e;
		}finally{
			session.close();//关闭会话
			}
		}
	}
	
