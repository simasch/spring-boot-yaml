package com.example.demoyaml;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.lang.NonNull;

import java.util.List;

@ConfigurationProperties("example")
@ConstructorBinding
@Data
@AllArgsConstructor
public class MyProps {

    @NonNull
    private String neededProperty;
    @NonNull
    private List<SampleProps> lstNeededProperty;

    public SampleProps getFirstSample() {
        return lstNeededProperty.get(0);
    }

}
