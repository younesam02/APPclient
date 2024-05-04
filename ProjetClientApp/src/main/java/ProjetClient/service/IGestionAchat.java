package ProjetClient.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetClient.dao.Achat;

public interface IGestionAchat extends JpaRepository<Achat, Long>{

}
