package stu.day0415;

//DataAccessObject 인터페이스 선언

interface DataAccessObject{
    void select();
    void insert();
    void update();
    void delete();
// select, insert, update(), delete() 메소드 선언
}
//oracledao 클래스 선언 이 클래스는 dataaccessobject 인터페이스를구현
class OracleDao implements DataAccessObject {

    //oracle 데이터베이스에서 각, 검색, 삽입, 수정, 삭제 작업을 수행하는 기능 구현
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

//mysqldao 클래스 선언 선언 이 클래스는 dataaccessobject 인터페이스를구현
class MysqlDao implements DataAccessObject{
    //mysql 데이터베이스에서 각, 검색, 삽입, 수정, 삭제 작업을 수행하는 기능 구현
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

    // dawork라는 정적 메소드를 선언, dataaccessobject 타입의 객체를 매개변수로 받음
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


