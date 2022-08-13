package tn.esps.entiy;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="student_id")
	private Student student;
}
