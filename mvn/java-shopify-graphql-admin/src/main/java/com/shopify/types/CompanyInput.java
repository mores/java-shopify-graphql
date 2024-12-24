package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class CompanyInput {
  
  private String name;

  
  private String note;

  
  private String externalId;

  
  private OffsetDateTime customerSince;

  public CompanyInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public OffsetDateTime getCustomerSince() {
    return customerSince;
  }

  public void setCustomerSince(OffsetDateTime customerSince) {
    this.customerSince = customerSince;
  }

  @Override
  public String toString() {
    return "CompanyInput{name='" + name + "', note='" + note + "', externalId='" + externalId + "', customerSince='" + customerSince + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyInput that = (CompanyInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(customerSince, that.customerSince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, note, externalId, customerSince);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String note;

    
    private String externalId;

    
    private OffsetDateTime customerSince;

    public CompanyInput build() {
      CompanyInput result = new CompanyInput();
      result.name = this.name;
      result.note = this.note;
      result.externalId = this.externalId;
      result.customerSince = this.customerSince;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    
    public Builder customerSince(OffsetDateTime customerSince) {
      this.customerSince = customerSince;
      return this;
    }
  }
}
