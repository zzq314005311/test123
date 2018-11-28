package impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateAccessor;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.record;
import entity.Record;

public class Recordimpl extends HibernateDaoSupport implements record {

	public void Record() {

	}

	@Override
	public List<Record> cha() {
		return getHibernateTemplate().execute(new HibernateCallback<List<Record>>() {
			@Override
			public List<entity.Record> doInHibernate(Session session) throws HibernateException, SQLException {
				List<Record> list = session.createQuery(" from Record").list();
				return list;
			}
		});
	}

}
