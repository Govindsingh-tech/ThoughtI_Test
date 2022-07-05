package com.thoughti.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughti.model.Item;
import com.thoughti.model.Orders;

public interface ItemsRepo extends JpaRepository<Item, Integer>{


}
