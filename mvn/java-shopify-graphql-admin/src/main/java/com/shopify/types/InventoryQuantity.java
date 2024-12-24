package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryQuantity implements com.shopify.types.Node {
  
  private String id;

  
  private String name;

  
  private int quantity;

  
  private OffsetDateTime updatedAt;

  public InventoryQuantity() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "InventoryQuantity{id='" + id + "', name='" + name + "', quantity='" + quantity + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryQuantity that = (InventoryQuantity) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        quantity == that.quantity &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quantity, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String name;

    
    private int quantity;

    
    private OffsetDateTime updatedAt;

    public InventoryQuantity build() {
      InventoryQuantity result = new InventoryQuantity();
      result.id = this.id;
      result.name = this.name;
      result.quantity = this.quantity;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
