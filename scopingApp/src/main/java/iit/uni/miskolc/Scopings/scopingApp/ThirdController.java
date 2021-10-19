package iit.uni.miskolc.Scopings.scopingApp;


import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdController {

    /*
    Szorgalmi builder
     */

    private final ApplicationContext context;


    public ThirdController(ApplicationContext context) {
        this.context = context;
    }

    @ResponseBody
    @GetMapping("/c")
    public String getARoot(){
        Service service = context.getBean("serviceImpl", Service.class);
        return service.getValue();

    }

    @ResponseBody
    @GetMapping("/beans")
    public String[] getBeans(){
        return context.getBeanDefinitionNames();
    }
}
