package br.com.chiquitto.appviagens.repositories;

import br.com.chiquitto.appviagens.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
@RepositoryRestResource(path="hoteis")
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
