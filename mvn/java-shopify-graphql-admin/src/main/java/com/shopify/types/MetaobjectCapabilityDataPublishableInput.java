package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDataPublishableInput {
  
  private MetaobjectStatus status;

  public MetaobjectCapabilityDataPublishableInput() {
  }

  
  public MetaobjectStatus getStatus() {
    return status;
  }

  public void setStatus(MetaobjectStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDataPublishableInput{status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDataPublishableInput that = (MetaobjectCapabilityDataPublishableInput) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectStatus status;

    public MetaobjectCapabilityDataPublishableInput build() {
      MetaobjectCapabilityDataPublishableInput result = new MetaobjectCapabilityDataPublishableInput();
      result.status = this.status;
      return result;
    }

    
    public Builder status(MetaobjectStatus status) {
      this.status = status;
      return this;
    }
  }
}
