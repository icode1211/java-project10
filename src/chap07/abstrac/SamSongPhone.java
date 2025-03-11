package chap07.abstrac;

public class SamSongPhone extends Phone {

    @Override
    public void turnOff() {
        System.out.println("samsong phone off");
    }

    public static void main(String[] args) {
        // 추상 클래스로 객체 생성 불가!
//        Phone phone = new Phone();

        // 추상클래스(Phone)의 "다형성" 실습해보기
//        Phone phone2 = new SamSongPhone();
//        Phone phone3 = new LGPhone();
//        Phone phone4 = new SmartPhone();

        SamSongPhone samsong = new SamSongPhone();
        samsong.turnOn();
        samsong.turnOff();
    }
}
