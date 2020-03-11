package com.inti.restController;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Affaire;
import com.inti.entities.Phase;
import com.inti.entities.Tache;
import com.inti.entities.Tribunal;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.ITacheService;



@RestController
public class TacheController {
	@Autowired
	ITacheService tacheService;

	@RequestMapping(value = "taches", method = RequestMethod.GET)
	public List<Tache> findAll() {
		return tacheService.findAll();
	}

	@RequestMapping(value = "taches/{idTache}", method = RequestMethod.GET)
	public Tache findOne(@PathVariable("idTache") Long id) {
		return tacheService.findOne(id);
	}

	@RequestMapping(value = "taches", method = RequestMethod.POST)
	public Tache saveTache(@RequestBody Tache tache) {
		return tacheService.save(tache);
	}

	@RequestMapping(value = "taches/{idTache}", method = RequestMethod.DELETE)
	public void deleteTache(@PathVariable("idTache") Long id) {
		tacheService.delete(id);
	}

	@RequestMapping(value = "taches/{idTache}", method = RequestMethod.PUT)
	public Tache updateTache(@PathVariable("idTache") Long id, @RequestBody Tache tache) {
		Tache currentTache = tacheService.findOne(id);
		currentTache.setDateCreation(tache.getDateCreation());
		currentTache.setTitre(tache.getTitre());
		currentTache.setDescriptionTache(tache.getDescriptionTache());
		currentTache.setStatutAudience(tache.isStatutAudience());
		currentTache.setUtilisateur(tache.getUtilisateur());
		currentTache.setAffaire(tache.getAffaire());
		currentTache.setTribunal(tache.getTribunal());
		currentTache.setPhases(tache.getPhases());
		return tacheService.save(currentTache);
	}

}
