package dev.fmartinez.practiceprometheus.repository;

import dev.fmartinez.practiceprometheus.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
