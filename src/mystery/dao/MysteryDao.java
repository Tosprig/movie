package mystery.dao;

import java.util.List;

import org.hibernate.Session;

import bigbang.HibernateSessionFactory;

public class MysteryDao {// Database Access Object 数据库连接对象
    public void delete(String name) {
        Session session = HibernateSessionFactory.getSession();//开启一个会话
		try {
			//System.out.println("DAO:"+name);
            session.beginTransaction();//开启一个事务
            Mystery instance = (Mystery)session.get("mystery.dao.Mystery", name);
			session.delete(instance);
            session.getTransaction().commit();//提交事务
		} catch (RuntimeException e) {
            session.getTransaction().rollback();//如果出错，回滚事务（撤回）
			throw e;
		}finally{
			session.close();//关闭会话
		}
	}
	public void add(Mystery my){
		Session session = HibernateSessionFactory.getSession();//开启一个会话
		try{
			session.beginTransaction();//开启一个事务
			session.save(my);
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
	public List<Mystery> show(){
		Session session = HibernateSessionFactory.getSession();//开启一个会话
		try{
			session.beginTransaction();//开启一个事务
			List<Mystery> instance = session.createQuery("from Mystery").list();//一list类返回所有Love类型的对象
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
