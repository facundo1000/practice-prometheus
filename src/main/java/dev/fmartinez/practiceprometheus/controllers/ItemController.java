package dev.fmartinez.practiceprometheus.controllers;

import dev.fmartinez.practiceprometheus.dto.ItemResponse;
import dev.fmartinez.practiceprometheus.models.Item;
import dev.fmartinez.practiceprometheus.service.ItemServiceImpl;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ItemController {

    private final ItemServiceImpl service;

    @GetMapping("/list")
    @Timed(value = "get.items", description = "list all items", extraTags = {"list","full-response"})
    public ResponseEntity<List<Item>> listItemResponse() {
        return ResponseEntity.ok(service.listAllItemResponse());
    }

    @GetMapping("/list2")
    @Timed(value = "get.response.items", description = "list all items-response", extraTags = {"list","items-response"})
    public ResponseEntity<List<ItemResponse>> listAllItem() {
        return ResponseEntity.ok(service.listAllItemResponseResponse());
    }
}
