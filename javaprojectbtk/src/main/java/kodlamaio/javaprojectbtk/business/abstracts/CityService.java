package kodlamaio.javaprojectbtk.business.abstracts;

import java.util.List;

import kodlamaio.javaprojectbtk.business.Requests.CreateCityRequest;
import kodlamaio.javaprojectbtk.business.Responses.GetAllCityResponse;

public interface CityService {

	List<GetAllCityResponse> getAll();

	void add(CreateCityRequest createCityRequest);
}
