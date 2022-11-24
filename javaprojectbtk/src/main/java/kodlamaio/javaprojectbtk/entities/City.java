package kodlamaio.javaprojectbtk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cities")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "countryCode")
	private String countryCode;

	@Column(name = "discrit")
	private String discrit;

	@Column(name = "population")
	private int population;

}
