package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FlowGenerateSignaturePayload {
  
  private String payload;

  
  private String signature;

  
  private List<UserError> userErrors;

  public FlowGenerateSignaturePayload() {
  }

  
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FlowGenerateSignaturePayload{payload='" + payload + "', signature='" + signature + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FlowGenerateSignaturePayload that = (FlowGenerateSignaturePayload) o;
    return Objects.equals(payload, that.payload) &&
        Objects.equals(signature, that.signature) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, signature, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String payload;

    
    private String signature;

    
    private List<UserError> userErrors;

    public FlowGenerateSignaturePayload build() {
      FlowGenerateSignaturePayload result = new FlowGenerateSignaturePayload();
      result.payload = this.payload;
      result.signature = this.signature;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder payload(String payload) {
      this.payload = payload;
      return this;
    }

    
    public Builder signature(String signature) {
      this.signature = signature;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
