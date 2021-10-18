package iit.uni.miskolc.junit5test.demoTest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("NotNeededService")
public class BetterServiceIml implements Service{

    @Override
    public void calculate() {

    }

    @Override
    public int returnFive() {
        return 15;
    }

    @Override
    public int callHelpAndUseReturnValue() {
        return 0;
    }

    @Override
    public void callHelpAndPassParameter5() {

    }

    @Override
    public String getImportantAbstract(String a) {
        return null;
    }

    @Override
    public String getFirst3Char(String a) {
        return null;
    }
}
