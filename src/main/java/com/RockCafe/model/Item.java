package com.RockCafe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item 
{
   @Column(name = "item_id")
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private String itemdesc;
   private Float price;

   public Float getPrice() 
   {
      return price;
   }

   public void setPrice(Float price) 
   {
      this.price = price;
   }

   public Long getId() 
   {
    return id;
   }

   public void setId(Long id) 
   {
    this.id = id;
   }

   public String getName() 
   {
    return name;
   }

   public void setName(String name) 
   {
    this.name = name;
   }

   public String getItemdesc() 
   {
    return itemdesc;
   }

   public void setItemdesc(String newItemDesc) 
   {
    this.itemdesc = newItemDesc;
   }
}