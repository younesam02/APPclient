package ProjetClient.dao;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdProduit;
	private String Nom;
	private Date DateExpiration;
}
