package com.juanka.photoresistor.photoController;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinAnalogInput;
import com.pi4j.io.gpio.RaspiPin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class photoController {

    public String start() {
        return "PhotoResistor test started";
    }

    @RequestMapping("/test")
    public static GpioPinAnalogInput test (){

        GpioController gpio = GpioFactory.getInstance();

        GpioPinAnalogInput photoresistor = gpio.provisionAnalogInputPin(RaspiPin.GPIO_01, "Fotoresistencia");


        return (photoresistor);
    }

}
