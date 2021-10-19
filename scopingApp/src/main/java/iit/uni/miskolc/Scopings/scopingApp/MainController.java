package iit.uni.miskolc.Scopings.scopingApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MainController {
    private final Service service;

    public MainController(Service service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/a")
    public String getRoot(){
        return  service.getValue();
    }
}
