package com.juanka.photoresistor.photoController;

import com.pi4j.io.gpio.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class photoController {

    @RequestMapping("/")
    public String start() {
        return "PhotoResistor test started";
    }

    @RequestMapping("/test")
    public static GpioPinDigitalInput test (){

        GpioController gpio = GpioFactory.getInstance();

        GpioPinDigitalInput photoresistor = gpio.provisionDigitalInputPin(RaspiPin.GPIO_01, "Fotoresistencia");


        return (photoresistor);
    }

}
