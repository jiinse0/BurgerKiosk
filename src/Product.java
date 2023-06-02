
import java.util.ArrayList;
import java.util.List;

// 자식
// Product class : name, price, description
//    - Product extends Menu : name, description
public class Product extends Menu {
    private double price;

    public Product(String name, double price, String description) {
        super(name, description);
        this.price = price;
    }

    // 메뉴와 가격, 설명 메소드
    @Override
    public String toString() {
        return getName() + this.price + getDescription();
    }

    // Getter
    public double getPrice() {
        return this.price;
    }

    // 버거 메뉴
    public static List<Product> Burgers () {
        List<Product> burgersList = new ArrayList<>();
        burgersList.add(new Product("1. ShackBurger   | W ",6.9," | 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersList.add(new Product("2. SmokeShack    | W ",8.9," | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersList.add(new Product("3. Shroom Burger | W ",9.4," | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        burgersList.add(new Product("4. Cheeseburger  | W ",6.9," | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersList.add(new Product("5. Hamburger     | W ",5.4," | 비프패티를 기반으로 야채가 들어간 기본버거"));
        return burgersList;
    }

    // 커스터드 메뉴
    public static List<Product> FrozenCustards () {
        List<Product> custardList = new ArrayList<>();
        custardList.add(new Product("1. Shaker         | W ",5.9," | 바닐라, 초콜렛, 솔티드 카라멩, 블랙&화이트, 스트로베리, 피넛버터, 커피"));
        custardList.add(new Product("2. Floats         | W ",5.9," | 루트 비어, 퍼플 카우, 크림시클"));
        custardList.add(new Product("3. Concretes      | W ",4.9," | 바닐라, 초콜렛, Flavor of the Week"));
        custardList.add(new Product("4. Red Bean Shake | W ",6.5," | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"));
        return custardList;
    }

    // 음료 메뉴
    public static List<Product> Drinks () {
        List<Product> drinksList = new ArrayList<>();
        drinksList.add(new Product("1. Fifty/Fifty         | W ",3.5," | 레몬에이드와 아이스티의 만남"));
        drinksList.add(new Product("2. Shack-made Lemonade | W ",5.9," | 매장에서 직접 만드는 상큼한 레몬에이드"));
        drinksList.add(new Product("3. Fountain Soda       | W ",2.7," | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프"));
        drinksList.add(new Product("4. Abita Root Beer     | W ",4.4," | 청량감 있는 독특한 미국식 무알콜 탄산음료"));
        return drinksList;
    }

    // 맥주 메뉴
    public static List<Product> Beers () {
        List<Product> beerList = new ArrayList<>();
        beerList.add(new Product("1. ShackMeister Ale   | W ",9.8," | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"));
        beerList.add(new Product("2. Magpie Brewing Co. | W ",6.8," | Magpie Brewing Co."));
        beerList.add(new Product("3. The Hand and Malt  | W ",6.8," | The Hand and Malt"));
        return beerList;
    }
}