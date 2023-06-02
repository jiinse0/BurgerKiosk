import java.util.ArrayList;
import java.util.List;

// 부모
// Menu class : name, description
public class Menu {
    private String name;
    private String description;

    // 생성자
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // 메뉴와 설명 메소드
    public String toString() {
        return this.name + "  |  " + this.description;
    }

    // Getter
    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    // 메인메뉴
    public static List<Menu> MainMenu () {
        List<Menu> mainMenuList = new ArrayList<>();
        mainMenuList.add(new Menu("1. Burgers         |"," 앵거스 비프 통살을 다져만든 버거"));
        mainMenuList.add(new Menu("2. Frozen Custard  |"," 매장에서 신선하게 만드는 아이스크림"));
        mainMenuList.add(new Menu("3. Drinks          |"," 매장에서 직접 만드는 음료"));
        return mainMenuList;
    }
}
