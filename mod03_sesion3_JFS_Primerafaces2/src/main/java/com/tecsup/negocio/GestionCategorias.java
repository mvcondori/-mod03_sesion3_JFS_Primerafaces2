package com.tecsup.negocio;

import java.util.ArrayList;
import java.util.Collection;

import com.tecsup.excepcion.DAOExcepcion;
import com.tecsup.modelo.Categoria;

public class GestionCategorias {

	static Collection<Categoria> categorias = new ArrayList<Categoria>(); 
	
	static {
		categorias.add(new Categoria(1,"Electr�nica","1"));
		categorias.add(new Categoria(2,"Libros","2"));
		categorias.add(new Categoria(3,"Deportes","3"));
	}
	
	
	public Collection<Categoria> listar() throws DAOExcepcion {
		// TODO Auto-generated method stub
		return categorias;
	}

	
}
