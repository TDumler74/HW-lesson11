package tdhellocrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdhellocrud.domain.City;
import tdhellocrud.domain.Event;
import tdhellocrud.repository.CityRepository;
import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public List<City> findAll(){
        return cityRepository.findAll();
    }

    public void add(City city){
        cityRepository.save(city);
    }
}
