package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PurchasingCompany implements PurchasingEntity {
  
  private Company company;

  
  private CompanyContact contact;

  
  private CompanyLocation location;

  public PurchasingCompany() {
  }

  
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  
  public CompanyContact getContact() {
    return contact;
  }

  public void setContact(CompanyContact contact) {
    this.contact = contact;
  }

  
  public CompanyLocation getLocation() {
    return location;
  }

  public void setLocation(CompanyLocation location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "PurchasingCompany{company='" + company + "', contact='" + contact + "', location='" + location + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurchasingCompany that = (PurchasingCompany) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(contact, that.contact) &&
        Objects.equals(location, that.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, contact, location);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Company company;

    
    private CompanyContact contact;

    
    private CompanyLocation location;

    public PurchasingCompany build() {
      PurchasingCompany result = new PurchasingCompany();
      result.company = this.company;
      result.contact = this.contact;
      result.location = this.location;
      return result;
    }

    
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    
    public Builder contact(CompanyContact contact) {
      this.contact = contact;
      return this;
    }

    
    public Builder location(CompanyLocation location) {
      this.location = location;
      return this;
    }
  }
}
