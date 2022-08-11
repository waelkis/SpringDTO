package tn.esps.entiy;

import javax.persistence.Entity;
import javax.persistence.Id;

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

}
