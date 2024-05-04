package ProjetClient.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetClient.dao.Client;

public interface IGestionClient extends JpaRepository<Client, Long> {

}
