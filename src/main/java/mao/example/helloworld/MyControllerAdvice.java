package mao.example.helloworld;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {

    @ResponseBody
    @ExceptionHandler(value=mao.example.helloworld.ApplicationException.class)
    public Map<String,Object> myException(Exception ex){
        Map<String,Object> map = new HashMap<>();
        map.put("code",-800);
        map.put("msg",ex.getMessage());
        return  map;
    }
}
