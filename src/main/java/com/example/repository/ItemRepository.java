package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {

}
