package patterns.structural.adapter.cyk;


import patterns.structural.adapter.cyk.instance.Print;
import patterns.structural.adapter.cyk.instance.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
