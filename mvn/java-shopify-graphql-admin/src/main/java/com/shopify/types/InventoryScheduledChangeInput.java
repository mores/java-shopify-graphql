package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class InventoryScheduledChangeInput {
  
  private OffsetDateTime expectedAt;

  
  private String fromName;

  
  private String toName;

  public InventoryScheduledChangeInput() {
  }

  
  public OffsetDateTime getExpectedAt() {
    return expectedAt;
  }

  public void setExpectedAt(OffsetDateTime expectedAt) {
    this.expectedAt = expectedAt;
  }

  
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  
  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  @Override
  public String toString() {
    return "InventoryScheduledChangeInput{expectedAt='" + expectedAt + "', fromName='" + fromName + "', toName='" + toName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryScheduledChangeInput that = (InventoryScheduledChangeInput) o;
    return Objects.equals(expectedAt, that.expectedAt) &&
        Objects.equals(fromName, that.fromName) &&
        Objects.equals(toName, that.toName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedAt, fromName, toName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime expectedAt;

    
    private String fromName;

    
    private String toName;

    public InventoryScheduledChangeInput build() {
      InventoryScheduledChangeInput result = new InventoryScheduledChangeInput();
      result.expectedAt = this.expectedAt;
      result.fromName = this.fromName;
      result.toName = this.toName;
      return result;
    }

    
    public Builder expectedAt(OffsetDateTime expectedAt) {
      this.expectedAt = expectedAt;
      return this;
    }

    
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }

    
    public Builder toName(String toName) {
      this.toName = toName;
      return this;
    }
  }
}
