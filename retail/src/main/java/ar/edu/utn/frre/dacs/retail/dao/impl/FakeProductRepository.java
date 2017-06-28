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
package ar.edu.utn.frre.dacs.retail.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.utn.frre.dacs.retail.dao.ProductRepository;
import ar.edu.utn.frre.dacs.retail.model.Product;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@Service
public class FakeProductRepository implements ProductRepository {
	
	private static final List<Product> products;
	
	static {
		products = new ArrayList<Product>(3);
		products.add(new Product(1L, "Coca Cola 1.5L", new BigDecimal(35.0)));
		products.add(new Product(2L, "Fernet Branca 1L", new BigDecimal(215.75)));
		products.add(new Product(3L, "Lays Stax", new BigDecimal(55.75)));
	}

	@Override
	public List<Product> findAll() {
		return products;
	}

}
