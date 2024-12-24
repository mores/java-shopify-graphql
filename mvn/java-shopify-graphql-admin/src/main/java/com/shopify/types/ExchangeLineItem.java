package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ExchangeLineItem implements com.shopify.types.Node {
  
  private String id;

  
  private LineItem lineItem;

  public ExchangeLineItem() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  @Override
  public String toString() {
    return "ExchangeLineItem{id='" + id + "', lineItem='" + lineItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItem that = (ExchangeLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private LineItem lineItem;

    public ExchangeLineItem build() {
      ExchangeLineItem result = new ExchangeLineItem();
      result.id = this.id;
      result.lineItem = this.lineItem;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }
  }
}
