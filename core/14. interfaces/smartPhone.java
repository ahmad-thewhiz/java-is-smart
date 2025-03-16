class Phone {
    void call() {
        System.out.println("Making a call...");
    }

    void sms() {
        System.out.println("Sending an SMS...");
    }
}

interface Camera {
    void click();

    void record();
}

interface musicPlayer {
    void play();

    void pause();

    void stop();
}

public class smartPhone extends Phone implements Camera, musicPlayer {

    // Specific method for smartphone
    void videoCall() {
        System.out.println("Making a video call...");
    }

    // Implementation of Camera interface methods
    public void click() {
        System.out.println("Clicking a photo...");
    }

    public void record() {
        System.out.println("Recording a video...");
    }

    // Implementation of musicPlayer interface methods
    public void play() {
        System.out.println("Playing music...");
    }

    public void pause() {
        System.out.println("Pausing music...");
    }

    public void stop() {
        System.out.println("Stopping music...");
    }

    public static void main(String[] args) {
        // Creating an instance of smartPhone
        smartPhone obj = new smartPhone();

        // Demonstrating functionality of smartPhone
        System.out.println("Accessing smartPhone methods:");
        obj.call();
        obj.sms();
        obj.videoCall();
        obj.click();
        obj.record();
        obj.play();
        obj.pause();
        obj.stop();

        // Demonstrating polymorphism
        System.out.println("\nAccessing methods through Phone reference:");
        Phone p = obj;
        p.call();
        p.sms();
        // p cannot access methods of Camera or musicPlayer interfaces

        System.out.println("\nAccessing methods through Camera reference:");
        Camera c = obj;
        c.click();
        c.record();
        // c cannot access methods of Phone or musicPlayer

        System.out.println("\nAccessing methods through musicPlayer reference:");
        musicPlayer m = obj;
        m.play();
        m.pause();
        m.stop();
        // m cannot access methods of Phone or Camera
    }
}
