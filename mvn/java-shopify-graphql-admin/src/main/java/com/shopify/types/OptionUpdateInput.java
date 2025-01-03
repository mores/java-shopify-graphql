package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OptionUpdateInput {
  
  private String id;

  
  private String name;

  
  private Integer position;

  
  private LinkedMetafieldUpdateInput linkedMetafield;

  public OptionUpdateInput() {
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

  
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  
  public LinkedMetafieldUpdateInput getLinkedMetafield() {
    return linkedMetafield;
  }

  public void setLinkedMetafield(LinkedMetafieldUpdateInput linkedMetafield) {
    this.linkedMetafield = linkedMetafield;
  }

  @Override
  public String toString() {
    return "OptionUpdateInput{id='" + id + "', name='" + name + "', position='" + position + "', linkedMetafield='" + linkedMetafield + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionUpdateInput that = (OptionUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(position, that.position) &&
        Objects.equals(linkedMetafield, that.linkedMetafield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, position, linkedMetafield);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String name;

    
    private Integer position;

    
    private LinkedMetafieldUpdateInput linkedMetafield;

    public OptionUpdateInput build() {
      OptionUpdateInput result = new OptionUpdateInput();
      result.id = this.id;
      result.name = this.name;
      result.position = this.position;
      result.linkedMetafield = this.linkedMetafield;
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

    
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    
    public Builder linkedMetafield(LinkedMetafieldUpdateInput linkedMetafield) {
      this.linkedMetafield = linkedMetafield;
      return this;
    }
  }
}
