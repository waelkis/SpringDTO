package tn.esps.entiy;

import javax.persistence.Id;

public class Course {
	@Id
	private Long id;

	private String name;

	private String cost;

	private String time;
}
