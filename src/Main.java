import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InputAll inputAll = new InputAll(); // InputAll 객체 생성
        Order order = new Order(); //Order 객체 생성
        Scanner scanner = new Scanner(System.in); // Scanner 생성
        List orderList = new ArrayList<>(); // 주문 저장하는 List 생성


        System.out.println(BurgerkingMenu.t1);
        System.out.println();
        boolean start = true;
        while (start) {
            BurgerkingMenu.title("BURGERKING MENU");
            BurgerkingMenu menu = new BurgerkingMenu();
            menu.outputM(inputAll.InputM());
            System.out.println();

            BurgerkingMenu.title("ORDER MENU");
            BurgerkingMenu orderName = new BurgerkingMenu();
            orderName.outputO(inputAll.InputO());
            System.out.println();


            String scanner1 = scanner.nextLine();
            if (scanner1.equals("1")) {
                // 와퍼 메뉴 출력
                BurgerkingMenu.title("WHOPPER MENU");
                BurgerkingMenu whopper = new BurgerkingMenu();
                whopper.outputP(inputAll.InputW());
                System.out.println();
                System.out.println("번호 외에 입력시 메인으로 돌아갑니다.");

                // 장바구니 추가 확인, 취소
                BurgerkingMenu s1 = null;
                String scanner2 = scanner.nextLine();
                if(scanner2.equals("1") || scanner2.equals("2") || scanner2.equals("3") || scanner2.equals("4")){
                    s1 = order.outputM(inputAll.InputW(), scanner2);

                } else {
                    System.out.println("잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                    continue;
                }
                String scanner3 = scanner.nextLine();

                // 선택 후 돌아가는 부분.
                if (scanner3.equals("1")) {
                    order.menuCheck2("hamburger");
                    orderList.add(s1);
                    System.out.println();
                    Order.stop3Second();
                } // 취소
                else {
                    System.out.println("취소 되었습니다. 잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                }
            } else if (scanner1.equals("2")) {
                // 와퍼 메뉴 출력
                BurgerkingMenu.title("ALLDAYKING MENU");
                BurgerkingMenu alldayking = new BurgerkingMenu();
                alldayking.outputP(inputAll.InputA());
                System.out.println();
                System.out.println("번호 외에 입력시 메인으로 돌아갑니다.");

                // 장바구니 추가 확인, 취소
                BurgerkingMenu s1 = null;
                String scanner2 = scanner.nextLine();
                if(scanner2.equals("1") || scanner2.equals("2") || scanner2.equals("3") || scanner2.equals("4")){
                s1 = order.outputM(inputAll.InputA(), scanner2);

                } else {
                    System.out.println("잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                    continue;
                }
                String scanner3 = scanner.nextLine();

                // 선택 후 돌아가는 부분.
                if (scanner3.equals("1")) {
                    order.menuCheck2("ALLDAYKING BUGER");
                    orderList.add(s1);
                    System.out.println();
                    Order.stop3Second();
                } // 취소
                else {
                    System.out.println("취소 되었습니다. 잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                }
            } else if (scanner1.equals("3")) {
                // 와퍼 메뉴 출력
                BurgerkingMenu.title("SIDE MENU");
                BurgerkingMenu side = new BurgerkingMenu();
                side.outputP(inputAll.InputS());
                System.out.println();
                System.out.println("번호 외에 입력시 메인으로 돌아갑니다.");

                // 장바구니 추가 확인, 취소
                BurgerkingMenu s1 = null;
                String scanner2 = scanner.nextLine();
                if(scanner2.equals("1") || scanner2.equals("2") || scanner2.equals("3") || scanner2.equals("4")){
                    s1 = order.outputM(inputAll.InputS(), scanner2);

                } else {
                    System.out.println("잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                    continue;
                }
                String scanner3 = scanner.nextLine();

                // 선택 후 돌아가는 부분.
                if (scanner3.equals("1")) {
                    order.menuCheck2("SIDE MENU");
                    orderList.add(s1);
                    System.out.println();
                    Order.stop3Second();
                } // 취소
                else {
                    System.out.println("취소 되었습니다. 잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                }
            } else if (scanner1.equals("4")) {
                // 와퍼 메뉴 출력
                BurgerkingMenu.title("DRINK & DESSERT MENU");
                BurgerkingMenu side = new BurgerkingMenu();
                side.outputP(inputAll.InputD());
                System.out.println();
                System.out.println("번호 외에 입력시 메인으로 돌아갑니다.");

                // 장바구니 추가 확인, 취소
                BurgerkingMenu s1 = null;
                String scanner2 = scanner.nextLine();
                if(scanner2.equals("1") || scanner2.equals("2") || scanner2.equals("3") || scanner2.equals("4")){
                    s1 = order.outputM(inputAll.InputD(), scanner2);

                } else {
                    System.out.println("잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                    continue;
                }
                String scanner3 = scanner.nextLine();

                // 선택 후 돌아가는 부분.
                if (scanner3.equals("1")) {
                    order.menuCheck2("DRINK & DESSERT MENU");
                    orderList.add(s1);
                    System.out.println();
                    Order.stop3Second();
                } // 취소
                else {
                    System.out.println("취소 되었습니다. 잠시 후 메인으로 돌아갑니다.");
                    Order.stop3Second();
                }
            } else if (scanner1.equals("5")) {
                System.out.println("아래와 같이 주문 하시겠습니까?");
                for (int i = 0; i < orderList.size(); i++) {
                    BurgerkingMenu o1 = (BurgerkingMenu) orderList.get(i);
                    double d = (double) o1.getPrice() / 1000;
                    System.out.printf("%-18s \t | %2.1f | %s", o1.getMenu(), d, o1.getDesc());
                    System.out.println();
                }
                // 가격 출력되고, 주문 받는 곳
                int sum = 0;
                double sum1 = 0.0;
                for (int i= 0; i < orderList.size(); i++) {
                    BurgerkingMenu o1 = (BurgerkingMenu) orderList.get(i);
                    sum += o1.getPrice();
                    sum1 = (double) sum/1000;
                }
                System.out.println("[ Total ]");
                System.out.println("W " + sum1);
                System.out.println();
                System.out.println("1.주문" + "\t" + "2.메뉴판");
                String scanner2 = scanner.nextLine();
                if (scanner2.equals("1")) {
                    System.out.println("주문이 완료되었습니다!");

                    System.out.println("대기번호는 [ 1 ] 번 입니다.");
                    System.out.println("잠시 후 메뉴판으로 돌아갑니다.");
                    orderList.clear();
                    Order.stop3Second();
                }
            } else if (scanner1.equals("6")) {
                    System.out.println("진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1.취소 확인" + "\t" + "2.메인으로");
                    String scanner3 = scanner.nextLine();

                    if (scanner3.equals("1")) {
                        System.out.println("주문이 초기화 되었습니다.");
                        System.out.println("잠시 후 메뉴판으로 돌아갑니다.");
                        orderList.clear();
                        Order.stop3Second();
                    } else if (scanner3.equals("2")) {
                        System.out.println("메인으로");
                        System.out.println("잠시 후 메뉴판으로 돌아갑니다.");
                        Order.stop3Second();
                    }
                }else {
                System.out.println("올바른 번호를 입력해주세요.");
                Order.stop3Second();
            }
        }
    }
}