package org.fkit.dao;

import java.util.List;

import org.fkit.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;




/**
 * 用户DAO实现类
 * @author GJ
 * @date   2015年4月15日
 */
@Component
public class UserDaoImpl   {
	
	@Autowired
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }


	public User login(String userName, String password) {
		String hql = "from User u where u.userName = '"+userName+"' and u.password = '"+password+"'";
		Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
		List<User> users = query.list();

		
		if (users!= null && users.size() > 0) {
			System.out.println("success");
			return users.get(0);
		}
		return null;
	}

}
