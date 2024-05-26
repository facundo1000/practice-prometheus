package dev.fmartinez.practiceprometheus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemResponse {

    @JsonProperty(value = "name", required = true)
    private String name;
    @JsonProperty(value = "description", required = true)
    private String description;
    @JsonProperty(value = "price" , required = true)
    private Double price;

}
