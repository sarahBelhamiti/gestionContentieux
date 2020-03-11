package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Moral;
import com.inti.service.interfaces.IMoralService;

@RestController
public class MoralController {
	@Autowired
	IMoralService moralService;

	@RequestMapping(value = "morals", method = RequestMethod.GET)
	public List<Moral> findAll() {
		return moralService.findAll();
	}

	@RequestMapping(value = "morals/{idMoral}", method = RequestMethod.GET)
	public Moral findOne(@PathVariable("idMoral") Long id) {
		return moralService.findOne(id);
	}

	@RequestMapping(value = "morals", method = RequestMethod.POST)
	public Moral saveMoral(@RequestBody Moral moral) {
		return moralService.save(moral);
	}

	@RequestMapping(value = "morals/{idMoral}", method = RequestMethod.DELETE)
	public void deleteMoral(@PathVariable("idMoral") Long id) {
		moralService.delete(id);
	}

	@RequestMapping(value = "morals/{idMoral}", method = RequestMethod.PUT)
	public Moral updateMoral(@PathVariable("idMoral") Long id, @RequestBody Moral moral) {
		Moral currentMoral = moralService.findOne(id);
		currentMoral.setAdresseTiers(moral.getAdresseTiers());
		currentMoral.setTelTiers(moral.getTelTiers());
		currentMoral.setSiret(moral.getSiret());
		return moralService.save(currentMoral);
	}
}
