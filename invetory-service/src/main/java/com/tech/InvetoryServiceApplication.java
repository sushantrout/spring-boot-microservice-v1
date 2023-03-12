package com.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InvetoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvetoryServiceApplication.class, args);
	}

	/*
	 * @Bean public CommandLineRunner loadData(InventoryRepository
	 * inventoryRepository) { return args -> { Inventory inventory = new
	 * Inventory(); inventory.setSkuCode("iphone_13"); inventory.setQuantity(100);
	 * 
	 * Inventory inventory1 = new Inventory();
	 * inventory1.setSkuCode("iphone_13_red"); inventory1.setQuantity(0);
	 * 
	 * inventoryRepository.save(inventory); inventoryRepository.save(inventory1); };
	 * }
	 */
}
