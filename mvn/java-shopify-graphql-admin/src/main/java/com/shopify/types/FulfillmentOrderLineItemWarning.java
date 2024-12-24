package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOrderLineItemWarning {
  
  private String description;

  
  private String title;

  public FulfillmentOrderLineItemWarning() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemWarning{description='" + description + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemWarning that = (FulfillmentOrderLineItemWarning) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String description;

    
    private String title;

    public FulfillmentOrderLineItemWarning build() {
      FulfillmentOrderLineItemWarning result = new FulfillmentOrderLineItemWarning();
      result.description = this.description;
      result.title = this.title;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
