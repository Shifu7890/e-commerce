package com.example.ecommerce.model;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name= "ordered")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Ordered {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String orderNo;

int totalValue;
 @CreationTimestamp
    Date orderDate;

    String cardUsed;

@ManyToOne
@JoinColumn
Customer customer;

@OneToMany(mappedBy = "ordered" , cascade = CascadeType.ALL)
List<Item>items = new ArrayList<>();



    
}
