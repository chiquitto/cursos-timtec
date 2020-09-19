package br.com.chiquitto.viagemspring.services;

import br.com.chiquitto.viagemspring.model.Hotel;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
@RestController
@RequestMapping(path = "/hoteis")
public class HotelService {
    
    private Map<Integer, Hotel> hoteis;
    
    @PostConstruct
    private void init() {
        hoteis = new HashMap<>();
        
        Hotel hotel1 = new Hotel();
        hotel1.setId(1);
        hotel1.setNome("Hotel 1");
        hotel1.setEndereco("Av Brasil");
        hoteis.put(hotel1.getId(), hotel1);
    }
    
    @RequestMapping(path = "/{id}")
    public Hotel findHotelById(@PathVariable("id") Integer id) {
        return hoteis.get(id);
    }
    
}
