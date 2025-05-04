package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The CompanyContactRoleAssignment describes the company and location associated to a company contact's role.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyContactRoleAssignment implements com.shopify.admin.types.Node {
  /**
   * The company this role assignment belongs to.
   */
  private Company company;

  /**
   * The company contact for whom this role is assigned.
   */
  private CompanyContact companyContact;

  /**
   * The company location to which the role is assigned.
   */
  private CompanyLocation companyLocation;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The role that's assigned to the company contact.
   */
  private CompanyContactRole role;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was last updated.
   */
  private OffsetDateTime updatedAt;

  public CompanyContactRoleAssignment() {
  }

  /**
   * The company this role assignment belongs to.
   */
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   * The company contact for whom this role is assigned.
   */
  public CompanyContact getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(CompanyContact companyContact) {
    this.companyContact = companyContact;
  }

  /**
   * The company location to which the role is assigned.
   */
  public CompanyLocation getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocation companyLocation) {
    this.companyLocation = companyLocation;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The role that's assigned to the company contact.
   */
  public CompanyContactRole getRole() {
    return role;
  }

  public void setRole(CompanyContactRole role) {
    this.role = role;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was last updated.
   */
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
    /**
     * The company this role assignment belongs to.
     */
    private Company company;

    /**
     * The company contact for whom this role is assigned.
     */
    private CompanyContact companyContact;

    /**
     * The company location to which the role is assigned.
     */
    private CompanyLocation companyLocation;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The role that's assigned to the company contact.
     */
    private CompanyContactRole role;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was last updated.
     */
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

    /**
     * The company this role assignment belongs to.
     */
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    /**
     * The company contact for whom this role is assigned.
     */
    public Builder companyContact(CompanyContact companyContact) {
      this.companyContact = companyContact;
      return this;
    }

    /**
     * The company location to which the role is assigned.
     */
    public Builder companyLocation(CompanyLocation companyLocation) {
      this.companyLocation = companyLocation;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The role that's assigned to the company contact.
     */
    public Builder role(CompanyContactRole role) {
      this.role = role;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment record was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
