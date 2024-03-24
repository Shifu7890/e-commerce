package com.example.ecommerce.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name= "seller")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Builder
public class Seller {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;


String name;

@Column(unique = true)
String emailId;

int age;

String mobNo;

@OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
List<Product>product= new ArrayList<>();


    
}
