package uz.pdp.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name;

    private String description;

    private Double price;

    private boolean basket;

    private boolean recommendation;

    @ManyToOne
    private Category categoryId;

    @ManyToOne
    private Sale sale;

    @OneToOne
    private Attachment attachment;
}
