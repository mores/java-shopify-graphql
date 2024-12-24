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
public class CheckoutProfile implements com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private OffsetDateTime editedAt;

  
  private String id;

  
  private boolean isPublished;

  
  private String name;

  
  private boolean typOspPagesActive;

  
  private OffsetDateTime updatedAt;

  public CheckoutProfile() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public OffsetDateTime getEditedAt() {
    return editedAt;
  }

  public void setEditedAt(OffsetDateTime editedAt) {
    this.editedAt = editedAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public boolean getTypOspPagesActive() {
    return typOspPagesActive;
  }

  public void setTypOspPagesActive(boolean typOspPagesActive) {
    this.typOspPagesActive = typOspPagesActive;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CheckoutProfile{createdAt='" + createdAt + "', editedAt='" + editedAt + "', id='" + id + "', isPublished='" + isPublished + "', name='" + name + "', typOspPagesActive='" + typOspPagesActive + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutProfile that = (CheckoutProfile) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(editedAt, that.editedAt) &&
        Objects.equals(id, that.id) &&
        isPublished == that.isPublished &&
        Objects.equals(name, that.name) &&
        typOspPagesActive == that.typOspPagesActive &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, editedAt, id, isPublished, name, typOspPagesActive, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private OffsetDateTime editedAt;

    
    private String id;

    
    private boolean isPublished;

    
    private String name;

    
    private boolean typOspPagesActive;

    
    private OffsetDateTime updatedAt;

    public CheckoutProfile build() {
      CheckoutProfile result = new CheckoutProfile();
      result.createdAt = this.createdAt;
      result.editedAt = this.editedAt;
      result.id = this.id;
      result.isPublished = this.isPublished;
      result.name = this.name;
      result.typOspPagesActive = this.typOspPagesActive;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder editedAt(OffsetDateTime editedAt) {
      this.editedAt = editedAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder typOspPagesActive(boolean typOspPagesActive) {
      this.typOspPagesActive = typOspPagesActive;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
