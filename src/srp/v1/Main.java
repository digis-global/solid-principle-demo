package srp.v1;

public class Main {
    private User user;

    void run(){
        user = new User();
        user.register();
        user.login();
        user.sendEmail();
    }
}
