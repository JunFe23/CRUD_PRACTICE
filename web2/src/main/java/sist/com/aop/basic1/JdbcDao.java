package sist.com.aop.basic1;

public class JdbcDao  implements ParentDao{

	@Override
	public void insert(Object o) {
		// TODO Auto-generated method stub
		System.out.println("jdbcInsert");
		int rs=10/0;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("jdbcSelect");
		//int rs=10/0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("jdbcupdate");
	}
	
	

}
