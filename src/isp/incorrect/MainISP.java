package isp.incorrect;

public class MainISP {
    void run() {
        Printer hp2001 = new HP2001();
        hp2001.start();
        hp2001.scan();
        hp2001.erase();
        hp2001.scan();
        hp2001.fax();
    }

}
