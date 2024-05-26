package dev.fmartinez.practiceprometheus.service;

import dev.fmartinez.practiceprometheus.dto.ItemResponse;
import dev.fmartinez.practiceprometheus.models.Item;
import dev.fmartinez.practiceprometheus.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl {

    private final ItemRepository itemRepository;

    private final ModelMapper modelMapper;

    public List<Item> listAllItemResponse() {
        return itemRepository.findAll();
    }

    public List<ItemResponse> listAllItemResponseResponse() {
        return itemRepository.findAll().stream().map(item -> modelMapper.map(item, ItemResponse.class)).toList();
    }


}
