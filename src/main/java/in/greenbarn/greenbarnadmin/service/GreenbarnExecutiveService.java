package in.greenbarn.greenbarnadmin.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.greenbarn.greenbarnadmin.model.GreenbarnExecutive;
import in.greenbarn.greenbarnadmin.repository.GreenbarnExecutiveRepository;

@Service
public class GreenbarnExecutiveService {

	@Autowired
	GreenbarnExecutiveRepository greenbarnAgentRepository;

	public boolean createExecutive(GreenbarnExecutive greenbarnExecutive) {
		greenbarnAgentRepository.save(greenbarnExecutive);
		return true;
	}

	public ArrayList<GreenbarnExecutive> getExecutives() {
		return (ArrayList<GreenbarnExecutive>) greenbarnAgentRepository.findAll();

	}
}