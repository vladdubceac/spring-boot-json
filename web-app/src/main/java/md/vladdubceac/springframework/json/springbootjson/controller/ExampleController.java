package md.vladdubceac.springframework.json.springbootjson.controller;

import md.vladdubceac.springframework.json.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress(){
        return new ShippingAddress();
    };
}
