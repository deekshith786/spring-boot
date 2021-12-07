package com.example.eventsourcing.command.api.events;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.eventsourcing.command.api.data.Product;
import com.example.eventsourcing.command.api.data.ProductRepository;

@Component
public class ProductEventsHandler {

	private ProductRepository productRepository;
	
	
    public ProductEventsHandler(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}


	@EventHandler
    	public void on(ProductCreatedEvent event) {
    	
    		Product product = new Product();
    		BeanUtils.copyProperties(event, product);
    		productRepository.save(product);
    }
}
