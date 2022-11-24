package kodlamaio.javaprojectbtk.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.javaprojectbtk.business.Requests.CreateCityRequest;
import kodlamaio.javaprojectbtk.business.Responses.GetAllCityResponse;
import kodlamaio.javaprojectbtk.business.abstracts.CityService;

@RestController
@RequestMapping("/api/cities")
public class cityController {

	private CityService cityService;

	@Autowired
	public cityController(CityService cityService) {

		this.cityService = cityService;
	}

	@GetMapping("/getall")
	public List<GetAllCityResponse> getall() {
		return cityService.getAll();

	}

	@PostMapping("/add")
	public void add(CreateCityRequest cityRequest) {
		this.cityService.add(cityRequest);

	}

}
