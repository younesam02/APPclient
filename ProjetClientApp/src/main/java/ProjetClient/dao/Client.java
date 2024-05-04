package ProjetClient.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Client {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
    private String nom;
    private String prenom;
    private String motDePasse;
    private String email;
    private String telephone;
    private String adresse;
    private String ville;
    private String codePostal;
    private String pays;}
