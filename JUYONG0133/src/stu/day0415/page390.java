package stu.day0415;

//page390 인터페이스
interface page390_7{
    void select();
    void insert();
    void update();
    void delete();

}
//oracledao 클래스 선언
class OracleDao implements page390_7 {
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
class MysqlDao implements page390_7{

}
public class page390 {
    public static void main(String[] args) {

    }
}
