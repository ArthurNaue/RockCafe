package com.RockCafe.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

   private String imageid;

   public enum itemType {
      PERMANENTE, TEMPORARIO
   }

   @Enumerated(EnumType.STRING)
   private itemType itemType;
   private Date itemTime;

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

   public itemType getItemType() 
   {
      return itemType;
   }

   public void setItemType(itemType newItemType) 
   {
      this.itemType = newItemType;
   }

   public Date getItemTime() {
      return itemTime;
   }

   public void setItemTime(Date newItemTime) 
   {
      this.itemTime = newItemTime;
   }

   public String getImageid() 
   {
      return imageid;
   }

   public void setImageid(String newImageid) 
   {
      this.imageid = newImageid;
   }
}