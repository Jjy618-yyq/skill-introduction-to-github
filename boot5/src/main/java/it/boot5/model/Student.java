package it.boot5.model;




import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Component
@Data
@ConfigurationProperties(prefix = "stu")
public class Student {

    private String stuName;
    private Integer stuAge;
    private String[] stuSubjects;
    private List<String> stuHobby;
    private Set<String> stukC;
    private Map<String,Integer> stucJ;


}
