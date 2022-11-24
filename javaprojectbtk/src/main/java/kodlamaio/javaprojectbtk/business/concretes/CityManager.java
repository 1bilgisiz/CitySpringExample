package kodlamaio.javaprojectbtk.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.javaprojectbtk.business.Requests.CreateCityRequest;
import kodlamaio.javaprojectbtk.business.Responses.GetAllCityResponse;
import kodlamaio.javaprojectbtk.business.abstracts.CityService;
import kodlamaio.javaprojectbtk.dataAccess.abstracts.CityRepository;
import kodlamaio.javaprojectbtk.entities.City;

@Service
public class CityManager implements CityService {

	private CityRepository cityRepository;

	@Autowired
	public CityManager(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public List<GetAllCityResponse> getAll() {
		List<City> cities = cityRepository.findAll();
		List<GetAllCityResponse> cityResponses = new ArrayList<GetAllCityResponse>();

		for (City city : cities) {

			GetAllCityResponse responsitem = new GetAllCityResponse();
			responsitem.setId(city.getId());
			responsitem.setName(city.getName());

			cityResponses.add(responsitem);
		}

		return cityResponses;
	}

	@Override
	public void add(CreateCityRequest createCityRequest) {

		City city = new City();
		city.setName(createCityRequest.getName());

		this.cityRepository.save(city);

	}

}
