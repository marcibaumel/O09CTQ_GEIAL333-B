package iit.uni.miskolc.junit5test.demoTest;

public interface Service {
    void calculate();
    int returnFive();
    int callHelpAndUseReturnValue();
    void callHelpAndPassParameter5();
    String getImportantAbstract(String a);
    String getFirst3Char(String a);
}
