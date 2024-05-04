package ProjetClient.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetClient.dao.Produit;

public interface IGestionProduit extends JpaRepository<Produit, Long> {

}
