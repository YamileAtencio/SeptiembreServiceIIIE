package com.idat.SeptiembreIIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.SeptiembreIIIE.model.Producto;
import com.idat.SeptiembreIIIE.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repositorio;

	@Override
	public void guardar(Producto producto) {
		repositorio.save(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		repositorio.saveAndFlush(producto);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Producto> listar() {
		return repositorio.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
