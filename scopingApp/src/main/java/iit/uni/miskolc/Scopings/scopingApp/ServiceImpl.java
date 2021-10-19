package iit.uni.miskolc.Scopings.scopingApp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceImpl implements Service{

    private final Dependency dependency;
    private final String value;

    public ServiceImpl(Dependency dependency){
        this.value = Double.toString(Math.random());
        this.dependency = dependency;
    }

    @Override
    public String getValue() {
        return value;
    }
}
