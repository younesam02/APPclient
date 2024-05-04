package ProjetClient.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetClient.dao.Interaction;

public interface IGestionInteraction extends JpaRepository<Interaction, Long> {

}
