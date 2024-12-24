package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyContactRoleAssignment implements com.shopify.types.Node {
  
  private Company company;

  
  private CompanyContact companyContact;

  
  private CompanyLocation companyLocation;

  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private CompanyContactRole role;

  
  private OffsetDateTime updatedAt;

  public CompanyContactRoleAssignment() {
  }

  
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  
  public CompanyContact getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(CompanyContact companyContact) {
    this.companyContact = companyContact;
  }

  
  public CompanyLocation getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocation companyLocation) {
    this.companyLocation = companyLocation;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public CompanyContactRole getRole() {
    return role;
  }

  public void setRole(CompanyContactRole role) {
    this.role = role;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CompanyContactRoleAssignment{company='" + company + "', companyContact='" + companyContact + "', companyLocation='" + companyLocation + "', createdAt='" + createdAt + "', id='" + id + "', role='" + role + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactRoleAssignment that = (CompanyContactRoleAssignment) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(companyContact, that.companyContact) &&
        Objects.equals(companyLocation, that.companyLocation) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(role, that.role) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, companyContact, companyLocation, createdAt, id, role, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Company company;

    
    private CompanyContact companyContact;

    
    private CompanyLocation companyLocation;

    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private CompanyContactRole role;

    
    private OffsetDateTime updatedAt;

    public CompanyContactRoleAssignment build() {
      CompanyContactRoleAssignment result = new CompanyContactRoleAssignment();
      result.company = this.company;
      result.companyContact = this.companyContact;
      result.companyLocation = this.companyLocation;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.role = this.role;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    
    public Builder companyContact(CompanyContact companyContact) {
      this.companyContact = companyContact;
      return this;
    }

    
    public Builder companyLocation(CompanyLocation companyLocation) {
      this.companyLocation = companyLocation;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder role(CompanyContactRole role) {
      this.role = role;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
