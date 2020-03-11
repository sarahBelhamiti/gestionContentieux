package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Physique;
import com.inti.service.interfaces.IPhysiqueService;



@RestController
public class PhysiqueController {
	@Autowired
	IPhysiqueService physiqueService;

	@RequestMapping(value = "physiques", method = RequestMethod.GET)
	public List<Physique> findAll() {
		return physiqueService.findAll();
	}

	@RequestMapping(value = "physiques/{idPhysique}", method = RequestMethod.GET)
	public Physique findOne(@PathVariable("idPhysique") Long id) {
		return physiqueService.findOne(id);
	}

	@RequestMapping(value = "physiques", method = RequestMethod.POST)
	public Physique savePhysique(@RequestBody Physique physique) {
		return physiqueService.save(physique);
	}

	@RequestMapping(value = "physiques/{idPhysique}", method = RequestMethod.DELETE)
	public void deletePhysique(@PathVariable("idPhysique") Long id) {
		physiqueService.delete(id);
	}

	@RequestMapping(value = "physiques/{idPhysique}", method = RequestMethod.PUT)
	public Physique updatePhysique(@PathVariable("idPhysique") Long id, @RequestBody Physique physique) {
		Physique currentPhysique = physiqueService.findOne(id);
		currentPhysique.setAdresseTiers(physique.getAdresseTiers());
		currentPhysique.setTelTiers(physique.getTelTiers());
		currentPhysique.setCin(physique.getCin());
		currentPhysique.setNomPhysique(physique.getNomPhysique());
		currentPhysique.setPrenomPhysique(physique.getPrenomPhysique());
		return physiqueService.save(currentPhysique);
	}


}
