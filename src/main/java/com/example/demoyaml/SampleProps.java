package com.example.demoyaml;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data
@AllArgsConstructor
@ConstructorBinding
public class SampleProps {

    private String key;
    private String label;

}
