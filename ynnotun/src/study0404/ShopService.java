package study0404;

public class ShopService {
	// 정적 참조 변수(싱글톤 객체를 담을 변수)
    private static ShopService shopService;

    // private 생성자
    private ShopService() {
    }
    
    // getInstance()
    public static ShopService getInstance() {
        if (shopService == null) {
        	shopService = new ShopService();
        }
        
        return shopService;
    }
}
