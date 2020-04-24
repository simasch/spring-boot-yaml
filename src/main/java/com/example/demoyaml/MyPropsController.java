package com.example.demoyaml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPropsController {

    private final MyProps myProps;

    public MyPropsController(MyProps myProps) {
        this.myProps = myProps;
    }

    @GetMapping("myprops")
    public String get() {
        SampleProps firstSample = myProps.getFirstSample();

        return firstSample.getLabel();
    }

}
