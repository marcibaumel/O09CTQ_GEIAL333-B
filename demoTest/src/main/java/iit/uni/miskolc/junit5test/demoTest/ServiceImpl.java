package iit.uni.miskolc.junit5test.demoTest;

public class ServiceImpl implements Service{
    private final Dependency dependency;

    public ServiceImpl(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public void calculate() {
        dependency.helpNoParameterNoReturnValue();
    }

    @Override
    public int returnFive() {
        return 5;
    }

    @Override
    public int callHelpAndUseReturnValue() {
        int result = dependency.helpNoParameterReturnValue();
        return result;
    }
}
