import java.util.ArrayList;
import java.util.List;

public class InputAll {

    public List InputM() {
        BurgerkingMenu menu1 = new BurgerkingMenu();
        BurgerkingMenu menu2 = new BurgerkingMenu();
        BurgerkingMenu menu3 = new BurgerkingMenu();
        BurgerkingMenu menu4 = new BurgerkingMenu();
        menu1.setMenu("와퍼", "버거킹의 대표 와퍼를 만나 보세요.!");
        menu2.setMenu("올데이킹", "하루종일 버거! 콜라! 프라이! 다 뿌시자 GO");
        menu3.setMenu("사이드", "햄버거와 함께하는 맛있는 사이드 메뉴");
        menu4.setMenu("음료&디저트", "더 짜릿하게 더 시원하게!");

        List menuList = new ArrayList();
        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        menuList.add(menu4);
        return menuList;
    }

    public List InputO() {
        BurgerkingMenu order1 = new BurgerkingMenu();
        BurgerkingMenu order2 = new BurgerkingMenu();

        order1.setMenu("주문", "장바구니를 확인 후 주문합니다.!");
        order2.setMenu("취소", "진행중인 주문을 취소합니다.");

        List orderList = new ArrayList();
        orderList.add(order1);
        orderList.add(order2);
        return orderList;
    }

    public List InputW() {
        BurgerkingMenu hamburger1 = new BurgerkingMenu();
        BurgerkingMenu hamburger2 = new BurgerkingMenu();
        BurgerkingMenu hamburger3 = new BurgerkingMenu();
        BurgerkingMenu hamburger4 = new BurgerkingMenu();
        hamburger1.setMenuDescPrice("와퍼세트", "불에 직접 구운 순 쇠고기 패티에 싱싱한 야채가 한가득~ 버거킹의 대표 메뉴!", 10500);
        hamburger2.setMenuDescPrice("콰트로치즈와퍼세트", "진짜 불맛을 즐겨라, 4가지 고품격 치즈와 불에 직접 구운 와퍼 패티의 만남!", 11300);
        hamburger3.setMenuDescPrice("불고기와퍼세트", "불에 직접 구운 순 쇠고기 패티가 들어간 와퍼에 달콤한 불고기 소스까지!", 10500);
        hamburger4.setMenuDescPrice("기네스와퍼세트", "기네스 번과 기네스 바비큐 소스의 풍미!", 12200);

        List WhopperList = new ArrayList<>();
        WhopperList.add(hamburger1);
        WhopperList.add(hamburger2);
        WhopperList.add(hamburger3);
        WhopperList.add(hamburger4);
        return WhopperList;

    }

    public List InputA() {
        BurgerkingMenu alldayking1 = new BurgerkingMenu();
        BurgerkingMenu alldayking2 = new BurgerkingMenu();
        BurgerkingMenu alldayking3 = new BurgerkingMenu();
        BurgerkingMenu alldayking4 = new BurgerkingMenu();
        alldayking1.setMenuDescPrice("롱치킨버거세트", "담백한 치킨 패티에 부드러운 마요네즈 소스와 싱싱한 야채가 듬뿍~", 5500);
        alldayking2.setMenuDescPrice("비프불고기버거", "달콤한 불고기소스와 100% 순쇠고기 패티의 감칠맛나는 조화, 비프불고기버거!", 5500);
        alldayking3.setMenuDescPrice("콰트로치즈와퍼주니어세트", "진짜 불맛을 즐겨라, 4가지 고품격 치즈와 불에 직접 구운 와퍼 패티의 만남!", 6000);
        alldayking4.setMenuDescPrice("통새우와퍼주니어세트", "불맛 가득 순쇠고기, 갈릭페퍼 통새우, 스파이시토마토소스가 더해진 프리미엄 버거", 6000);

        List WhopperList = new ArrayList<>();
        WhopperList.add(alldayking1);
        WhopperList.add(alldayking2);
        WhopperList.add(alldayking3);
        WhopperList.add(alldayking4);
        return WhopperList;
    }

    public List InputS() {
        BurgerkingMenu side1 = new BurgerkingMenu();
        BurgerkingMenu side2 = new BurgerkingMenu();
        BurgerkingMenu side3 = new BurgerkingMenu();
        BurgerkingMenu side4 = new BurgerkingMenu();
        side1.setMenuDescPrice("너겟킹", "바삭~ 촉촉~ 한입에 쏙 부드러운 너겟킹!", 3100);
        side2.setMenuDescPrice("어니언링", "더 바삭하게 한 입에 쏙!", 3300);
        side3.setMenuDescPrice("바삭킹", "매콤하게! 바삭하게 튀긴 치킨윙", 4100);
        side4.setMenuDescPrice("프렌치프라이", "세계최고의 감자만 엄선해서 버거킹만의 비법으로 바삭하게!", 3000);


        List sideList = new ArrayList();
        sideList.add(side1);
        sideList.add(side2);
        sideList.add(side3);
        sideList.add(side4);
        return sideList;
    }

    public List InputD() {
        BurgerkingMenu drink1 = new BurgerkingMenu();
        BurgerkingMenu drink2 = new BurgerkingMenu();
        BurgerkingMenu drink3 = new BurgerkingMenu();
        BurgerkingMenu drink4 = new BurgerkingMenu();

        drink1.setMenuDescPrice("코카콜라", "코카-콜라로 더 짜릿하게!", 2900);
        drink2.setMenuDescPrice("스프라이트", "나를 깨우는 상쾌함!", 2900);
        drink3.setMenuDescPrice("망고선데", "여름을 더욱 프루티하게! 망고가 버거킹 선데에 빠졌다!", 1900);
        drink4.setMenuDescPrice("아메리카노", "자연을 담은 버거킹 RA인증커피", 2400);

        List drinkList = new ArrayList();
        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);
        drinkList.add(drink4);
        return drinkList;
    }


}
