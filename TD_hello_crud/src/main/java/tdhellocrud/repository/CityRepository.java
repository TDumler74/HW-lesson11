package tdhellocrud.repository;

import org.springframework.stereotype.Repository;
import tdhellocrud.domain.City;
import java.util.Arrays;
import java.util.List;

@Repository
public class CityRepository {
    List<City> cities = Arrays.asList(
            new City("London"),
            new City("Moskau"),
            new City("Dresden")
    );

    public List<City> findAll(){
        return cities;
    }
    public void save(City city) {
       cities.add(city);
    }

}
