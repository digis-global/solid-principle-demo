package isp.correct;

public class MainISP {
    void run(){
        Printer portablePrinter = new HP2020Portable();
        portablePrinter.start();
        portablePrinter.stop();
        portablePrinter.erase();
    }
}
