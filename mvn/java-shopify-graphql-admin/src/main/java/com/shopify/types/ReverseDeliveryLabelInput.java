package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReverseDeliveryLabelInput {
  
  private String fileUrl;

  public ReverseDeliveryLabelInput() {
  }

  
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryLabelInput{fileUrl='" + fileUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryLabelInput that = (ReverseDeliveryLabelInput) o;
    return Objects.equals(fileUrl, that.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fileUrl;

    public ReverseDeliveryLabelInput build() {
      ReverseDeliveryLabelInput result = new ReverseDeliveryLabelInput();
      result.fileUrl = this.fileUrl;
      return result;
    }

    
    public Builder fileUrl(String fileUrl) {
      this.fileUrl = fileUrl;
      return this;
    }
  }
}
