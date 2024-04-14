package stu.day0415;

//page390 인터페이스
interface DataAccessObject{
    void select();
    void insert();
    void update();
    void delete();

}
//oracledao 클래스 선언
class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("oracledb에서 검색");
    }
    @Override
    public void insert() {
        System.out.println("oracledb에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("oracledb에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("oracledb에서 삭제");
    }
}

//mysqldao 클래스 선언
class MysqlDao implements DataAccessObject{
    @Override
    public void select() {
        System.out.println("mysqldb에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("mysqldb에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("mysqldb에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("mysqldb에서 삭제");
    }
}
public class page390 {
    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MysqlDao());
    }
}


