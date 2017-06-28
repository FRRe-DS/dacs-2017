/*
 * Copyright (C) 2017 UTN-FRRe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.jaxrs.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import ar.edu.utn.frre.dacs.jaxrs.dao.ProductoDao;
import ar.edu.utn.frre.dacs.jaxrs.model.Producto;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@Stateless
@Local(ProductoDao.class)
public class FakeProductoDaoImpl implements ProductoDao {
	
	private static final List<Producto> l;
	
	static {
		l = new ArrayList<Producto>();
		
		Producto p1 = new Producto();
		
		p1.setId(1L);
		p1.setNombre("Coca Cola 1.5L");
		p1.setPrecio(new BigDecimal(55.0));
		
		Producto p2 = new Producto();
		
		p2.setId(2L);
		p2.setNombre("Fernet Branca 0.75L");
		p2.setPrecio(new BigDecimal(150.3));
		
		l.add(p1);
		l.add(p2);
	}

	public List<Producto> findAll() {
		return l;
	}

}
