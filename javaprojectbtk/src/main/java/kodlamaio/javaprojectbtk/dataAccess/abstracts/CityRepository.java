package kodlamaio.javaprojectbtk.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.javaprojectbtk.entities.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
