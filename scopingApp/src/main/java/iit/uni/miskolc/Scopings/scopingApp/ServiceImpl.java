package iit.uni.miskolc.Scopings.scopingApp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ServiceImpl implements Service{

    private final Dependency dependency;
    private String value;

    @Value("${own}")
    public void setValue(String value){
        this.value = value;
    }

    public ServiceImpl(Dependency dependency){
        this.value = Double.toString(Math.random());
        this.dependency = dependency;
    }

    @Override
    public String getValue() {
        return value;
    }
}
