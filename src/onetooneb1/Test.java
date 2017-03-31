package onetooneb1;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(876435654, "audi", "silver");
		User u1 = new User("tamojit", 28, v1);
		v1.setUser(u1);

		SessionFactory factory = new Configuration()
				.configure(
						new File(
								"D:\\Workspace_New\\Test_Hibernate\\src\\onetooneb1\\hibernate.cfg.xml"))
				.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		session.saveOrUpdate(u1);
		session.saveOrUpdate(v1);

		session.getTransaction().commit();
		session.close();
	}
}
