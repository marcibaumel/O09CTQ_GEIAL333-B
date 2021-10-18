package iit.uni.miskolc.junit5test.demoTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    private Service service;

    @Autowired
    @Qualifier("NeededService")
    public void setService(Service service){
        this.service = service;
    }

    @RequestMapping("/")
    public int returnFive(){
        return service.returnFive();
    }

}