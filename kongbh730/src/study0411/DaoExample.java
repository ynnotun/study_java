package study0411;

/*
 * 인터페이스
 * 인터페이스는 객체를 생성하지 않는다.
 * 추상메서드로 이루어져 있다.
 * 인터페이스를 상속받는 클래스는 인터페이스의 모든 추상메서드를 구현해야 한다.
 * 인터페이스를 통해 다중상속을 구현할 수 있다.
 */
interface DataAccessObject //인터페이스
{
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAccessObject//인터페이스를 상속받는 OracleDao 클래스
{
	@Override
	public void select() 
	{
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() 
	{
		System.out.println("Oracle DB에서 삽입");
	}

	@Override
	public void update() 
	{
		System.out.println("Oracle DB에서 수정");
	}

	@Override
	public void delete() 
	{
		System.out.println("Oracle DB에서 삭제");
	}
}

class MySqlDao implements DataAccessObject//인터페이스를 상속받는 MySqlDao 클래스
{
	@Override
	public void select()
	{
		System.out.println("MySql DB에서 검색");
	}

	@Override
	public void insert()
	{
		System.out.println("MySql DB에서 삽입");
	}

	@Override
	public void update() 
	{
		System.out.println("MySql DB에서 수정");
	}

	@Override
	public void delete() 
	{
		System.out.println("MySql DB에서 삭제");
	}
}

public class DaoExample 
{
	public static void dbWork(DataAccessObject dao)//다른 객체지만 인터페이스를 통해 메서드 수행 가능
	{
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) 
	{
		dbWork(new OracleDao());//OracleDao클래스를 인자로 생성해 수행하는 dbWork 메서드
		dbWork(new MySqlDao());//MySqlDao클래스를 인자로 생성해 수행하는 dbWork 메서드
	}
}
