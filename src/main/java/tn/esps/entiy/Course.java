package tn.esps.entiy;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
	@Setter
@Entity
public class Course {
	@Id
	
	private Long id;

	private String name;

	private String cost;

	private String time;
}
