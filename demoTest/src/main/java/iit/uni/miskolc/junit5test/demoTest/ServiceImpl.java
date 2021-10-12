package iit.uni.miskolc.junit5test.demoTest;

public class ServiceImpl implements Service{
    private final Dependency dependency;

    public ServiceImpl(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public void calculate() { }
}
