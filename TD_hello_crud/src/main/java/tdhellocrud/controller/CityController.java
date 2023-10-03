package tdhellocrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tdhellocrud.domain.City;
import tdhellocrud.service.CityService;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;
    @GetMapping("/cities")
    public String cities(Model model){
        List<City> cities = cityService.findAll();
        model.addAttribute("cities",cities);
        return "citiesView";
    }
}
