package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CurrencySettingEdge {
  
  private String cursor;

  
  private CurrencySetting node;

  public CurrencySettingEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public CurrencySetting getNode() {
    return node;
  }

  public void setNode(CurrencySetting node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "CurrencySettingEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CurrencySettingEdge that = (CurrencySettingEdge) o;
    return Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, node);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String cursor;

    
    private CurrencySetting node;

    public CurrencySettingEdge build() {
      CurrencySettingEdge result = new CurrencySettingEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(CurrencySetting node) {
      this.node = node;
      return this;
    }
  }
}
