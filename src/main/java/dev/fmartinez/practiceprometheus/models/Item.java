package dev.fmartinez.practiceprometheus.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private String name;
    private String description;
    private Double price;
    private boolean enabled;

    @PrePersist
    private void init() {
        this.enabled = true;
    }

    @Serial
    private static final long serialVersionUID = 6387029575722783243L;
}
