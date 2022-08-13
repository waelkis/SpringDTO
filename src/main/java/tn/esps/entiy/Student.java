package tn.esps.entiy;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Student {
	
	@Id
	private Long id;
	
	private String name;
	
	private String age;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "student")
	private List<Course> courses ;

}
