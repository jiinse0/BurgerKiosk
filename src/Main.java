
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// 키오스크 메인 화면
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        List<Menu> mainMenuList = Menu.MainMenu();
        List<Product> burgersList = Product.Burgers();
        List<Product> custardList = Product.FrozenCustards();
        List<Product> drinksList = Product.Drinks();

        boolean Ordering = true;
        while (Ordering) {
            System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
            System.out.println();
            System.out.println("[ SHAKESHACK MENU ]");
            for (Menu menu:mainMenuList) {
                System.out.println(menu.getName() + " " + menu.getDescription());
            }

            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Order       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel      | 진행중인 주문을 취소합니다.\n");

            System.out.println("번호를 입력해주세요 : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // 버거
                    // 버거 메뉴 출력
                    System.out.println("[ Burgers MENU ]");
                    for (Product product: burgersList) {
                        System.out.println(product);
                    }
                    // 값을 입력받아 장바구니 저장
                    int burgersNum = sc.nextInt();
                    if (burgersNum > 0 && burgersNum <= burgersList.size()) {
                        Product selectedBurger = burgersList.get(burgersNum - 1);
                        addToCart(selectedBurger, order, sc);
                        boolean addToCart = false;
                        if (!addToCart) {
                            continue;
                        }
                    } else {
                        System.out.println("번호를 잘못 입력하였습니다. 다시 입력해 주세요");
                        continue; // 다시 메인 메뉴판 출력
                    }
                    break;
                case 2: // 커스터드
                    System.out.println("[ Frozen Custard MENU ]");
                    for (Product product: custardList) {
                        System.out.println(product);
                    }
                    // 값을 입력받아 장바구니 저장
                    int custardNum = sc.nextInt();
                    if (custardNum > 0 && custardNum <= custardList.size()) {
                        Product selectedCustard = custardList.get(custardNum - 1);
                        addToCart(selectedCustard, order, sc);
                        boolean addToCart = false;
                        if (!addToCart) {
                            continue;
                        }
                    } else {
                        System.out.println("번호를 잘못 입력하였습니다. 다시 입력해 주세요");
                        continue;
                    }
                    break;
                case 3: // 음료
                    System.out.println("[ Drinks MENU ]");
                    for (Product product: drinksList) {
                        System.out.println(product);
                    }
                    int drinksNum = sc.nextInt();
                    if (drinksNum > 0 && drinksNum <= drinksList.size()) {
                        Product selectedDrinks = drinksList.get(drinksNum - 1);
                        addToCart(selectedDrinks, order, sc);
                        boolean addToCart = false;
                        if (!addToCart) {
                            continue;
                        }
                    } else {
                        System.out.println("번호를 잘못 입력하였습니다. 다시 입력해 주세요");
                        continue;
                    }
                    break;
                case 4: // 장바구니 목록
                    order.orderList();
                    System.out.println();
                    System.out.println("1. 주문      2. 메뉴판");
                    int orderMenuChoice = sc.nextInt();
                    if (orderMenuChoice == 1) {
                        boolean orderCompleted = orderComplete(sc);
                        if (orderCompleted) {
                            continue; // 다시 메인 메뉴판 출력
                        }
                    } else if (orderMenuChoice == 2) {
                        continue; // 메인 메뉴판으로 돌아감
                    } else {
                        System.out.println("번호를 잘못 입력하였습니다. 다시 입력해 주세요\n");
                        continue;
                    }
                    break;
                case 5: // 주문 취소
                    System.out.println("진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1. 확인         2. 취소");
                    int cancelNum = sc.nextInt();
                    if (cancelNum == 1) {
                        order.clearProducts(); // addProduct 메소드 초기화
                        System.out.println("주문 취소가 완료됐습니다.");
                        continue; // while 루프의 처음으로 이동하여 메인 화면 출력
                    } else {
                        Ordering = false; // 주문 진행 종료
                    }
                    break;
                default:
                    System.out.println("번호를 잘못 입력하였습니다. 다시 입력해 주세요\n");
                    continue;
            }
            break;
        }
    }

    // 장바구니 추가
    public static boolean addToCart(Product product, Order order, Scanner sc) {
        System.out.println("선택한 상품: " + product);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인     2. 취소");
        int addChoice = sc.nextInt();
        if (addChoice == 1) {
            order.addProduct(product);
            System.out.println("해당 상품을 장바구니에 추가하였습니다.");
            return true;
        } else {
            System.out.println("장바구니에 상품 추가를 취소합니다.");
            return false;
        }
    }

    // 주문 완료
    public static boolean orderComplete(Scanner sc) {
        System.out.println("주문이 완료되었습니다!");
        System.out.println("대기번호는 [ 1 ] 번 입니다.");
        System.out.print("(3초후 메뉴판으로 돌아갑니다.)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}

