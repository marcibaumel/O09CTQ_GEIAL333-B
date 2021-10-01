package hu.me.iit.webalk.firstApp;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
public class MainController {

    @GetMapping(path="/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    private ResponseDto gyoker(){
        ResponseDto responseDto = new ResponseDto();

        responseDto.setId(123);
        responseDto.setMsg("Üdv");

        return  responseDto;
    }
}
