package stu.day0407;
/*
    -싱글톤 패턴
     private ShopService() 는 private으로 선언되었기 때문에 외부에서 이 클래스를 인스턴스화 할수 없음
     그래서 public static ShopService getInstance 정적메소드로 shopserivce인스턴스를 반환, 이 메소드를 통해서 외부에 유일한 인스턴스를 얻을수있음
 */
public class page280_18 {

    public static class ShopService{

        private static ShopService shopservice = new ShopService(); //private 접근 권한을 갖는 정적 필드 초기화

        private ShopService(){ //private 접근 권한을 갖는 생성자 선언

        }

        public static ShopService getInstance(){        //public 접근 권한을 갖는 정적메소드 선언
            return shopservice;
        }

    }

    public static void main(String[] args) {

        //정적메소드를 호출해서 싱글톤 객체 얻음
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();


        //동일한 객체를 얻어왔는지 확인
        if(obj1 == obj2){
            System.out.println("같은 ShopService 객체입니다.");
        }
        else {
            System.out.println("다른 ShopService 객체 입니다.");
        }
    }
}
