package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PurchasingCompanyInput {
  
  private String companyId;

  
  private String companyContactId;

  
  private String companyLocationId;

  public PurchasingCompanyInput() {
  }

  
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  
  public String getCompanyContactId() {
    return companyContactId;
  }

  public void setCompanyContactId(String companyContactId) {
    this.companyContactId = companyContactId;
  }

  
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  @Override
  public String toString() {
    return "PurchasingCompanyInput{companyId='" + companyId + "', companyContactId='" + companyContactId + "', companyLocationId='" + companyLocationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurchasingCompanyInput that = (PurchasingCompanyInput) o;
    return Objects.equals(companyId, that.companyId) &&
        Objects.equals(companyContactId, that.companyContactId) &&
        Objects.equals(companyLocationId, that.companyLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyContactId, companyLocationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String companyId;

    
    private String companyContactId;

    
    private String companyLocationId;

    public PurchasingCompanyInput build() {
      PurchasingCompanyInput result = new PurchasingCompanyInput();
      result.companyId = this.companyId;
      result.companyContactId = this.companyContactId;
      result.companyLocationId = this.companyLocationId;
      return result;
    }

    
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      return this;
    }

    
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      return this;
    }

    
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }
  }
}
