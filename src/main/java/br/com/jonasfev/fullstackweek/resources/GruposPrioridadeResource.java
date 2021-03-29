package br.com.jonasfev.fullstackweek.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jonasfev.fullstackweek.domain.GruposPrioridade;
import br.com.jonasfev.fullstackweek.repositorie.GruposPrioridadeRepository;


@RestController
@RequestMapping("/gruposprioridade")

public class GruposPrioridadeResource {
	
	@Autowired
	private GruposPrioridadeRepository gruposPrioridadeRepository;

	@GetMapping
	public List<GruposPrioridade> listarTodos(){
		return gruposPrioridadeRepository.findAll();
		
	}
	
	@GetMapping("{/codigo}")
	public GruposPrioridade buscarPeloCodigo(@PathVariable Long codigo) {
		return gruposPrioridadeRepository.findById(codigo).orElse(null);
			
		}
	}


