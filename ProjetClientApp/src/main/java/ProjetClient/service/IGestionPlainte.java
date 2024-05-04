package ProjetClient.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetClient.dao.Plainte;

public interface IGestionPlainte extends JpaRepository<Plainte, Long>{

}
