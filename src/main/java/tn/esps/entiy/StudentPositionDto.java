package tn.esps.entiy;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentPositionDto {
	
    private Long id;
	
	private String name;
	
	private List<CourseRes> courseRes =new ArrayList<>();

}
