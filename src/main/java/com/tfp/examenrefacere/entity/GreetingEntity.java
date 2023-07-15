package com.tfp.examenrefacere.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "greeting")
public class GreetingEntity {

    @Id
    private int GreetingID;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Price")
    private int Price;

    @Column(name = "TypeID")
    private int TypeID;

    @Column(name = "CategoryID")
    private int CategoryID;

}
