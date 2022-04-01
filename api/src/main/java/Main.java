
//https://github.com/netology-code/jd-homeworks/blob/master/builders/task1/README.md
public class Main {

    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());



    }
}
