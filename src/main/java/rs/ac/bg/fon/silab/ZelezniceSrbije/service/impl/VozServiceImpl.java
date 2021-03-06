package rs.ac.bg.fon.silab.ZelezniceSrbije.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.ac.bg.fon.silab.ZelezniceSrbije.domen.Voz;
import rs.ac.bg.fon.silab.ZelezniceSrbije.repository.VozRepository;
import rs.ac.bg.fon.silab.ZelezniceSrbije.service.VozService;


@Service
@Transactional
public class VozServiceImpl implements VozService{

	@Autowired
	private VozRepository vozRepository;
	
        @Override
	public List<Voz> findAll() {
		System.out.println("findAll");
		return vozRepository.findAll();
	}
}
