import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Order : product method
public class Order {
    // 상품 객체를 담기 위한 리스트
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }
    // 상품을 주문에 추가하는 메서드
    public void addProduct(Product product) {
        products.add(product);
    }
    public void clearProducts() {
        products.clear();
    }
    // Getter
    // 주문에 포함된 상품 목록을 반환하는 메서드
    public List<Product> getProducts() {
        return products;
    }

    void orderList() { // 장바구니 목록 출력
        List<Product> orderProducts = this.getProducts();

        System.out.println("아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[ Orders ]");

        double total = 0; // 총 가격을 저장할 변수
        for (Product products : orderProducts) {
            System.out.println(products); // 주문한 메뉴 출력
            total += products.getPrice(); // 상품의 가격을 총 가격에 더함
        }
        System.out.println("[ Total ]");
        System.out.println("주문한 상품의 총 가격: " + "W " +total);
    }


}
