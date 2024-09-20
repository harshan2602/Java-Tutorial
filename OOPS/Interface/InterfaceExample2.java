package OOPS.Interface;

class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface ICamera {
    void click();

    void record();
}

interface IMusicPlayer {
    void play();

    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
//    public void videoCall() {
//        System.out.println("Smart Phone video calling");
//    }

    public void click() {
        System.out.println("Smart Phone Clicking Photo");
    }

    public void record() {
        System.out.println("Smart Phone recording video");
    }

    public void play() {
        System.out.println("Smart Phone playing music");
    }

    public void stop() {
        System.out.println("Smart Phone stopped playing music");
    }

}

public class InterfaceExample2 {

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone(); //you can call all methods
        ICamera cp = new SmartPhone(); // you can only call Camera interface methods
        IMusicPlayer mp = new SmartPhone(); //you can only call MusicPlayer interface methods
        mp.play();
        mp.stop();
        sp.call();


    }

}
