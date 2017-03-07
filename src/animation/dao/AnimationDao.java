package animation.dao;

import java.util.List;

import org.hibernate.Session;

import bigbang.HibernateSessionFactory;

public class AnimationDao {// Database Access Object 数据库连接对象
    public void delete(String name) {
        Session session = HibernateSessionFactory.getSession();//开启一个会话
		try {
			
            session.beginTransaction();//开启一个事务
            Animation instance = (Animation)session.get("animation.dao.Animation", name);
			session.delete(instance);
            session.getTransaction().commit();//提交事务
		} catch (RuntimeException e) {
            session.getTransaction().rollback();//如果出错，回滚事务（撤回）
			throw e;
		}finally{
			session.close();//关闭会话
		}
	}
	public void add(Animation anima){
		Session session = HibernateSessionFactory.getSession();//开启一个会话
		try{
			session.beginTransaction();//开启一个事务
			session.save(anima);
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
	public List<Animation> show(){
		Session session = HibernateSessionFactory.getSession();//开启一个会话
		try{
			session.beginTransaction();//开启一个事务
			List<Animation> instance = session.createQuery("from Animation").list();//一list类返回所有Love类型的对象
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
