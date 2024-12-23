package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the role and contact to assign on a location.
 */
public class CompanyLocationRoleAssign {
  /**
   * The role ID.
   */
  private String companyContactRoleId;

  /**
   * The company contact ID..
   */
  private String companyContactId;

  public CompanyLocationRoleAssign() {
  }

  /**
   * The role ID.
   */
  public String getCompanyContactRoleId() {
    return companyContactRoleId;
  }

  public void setCompanyContactRoleId(String companyContactRoleId) {
    this.companyContactRoleId = companyContactRoleId;
  }

  /**
   * The company contact ID..
   */
  public String getCompanyContactId() {
    return companyContactId;
  }

  public void setCompanyContactId(String companyContactId) {
    this.companyContactId = companyContactId;
  }

  @Override
  public String toString() {
    return "CompanyLocationRoleAssign{companyContactRoleId='" + companyContactRoleId + "', companyContactId='" + companyContactId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationRoleAssign that = (CompanyLocationRoleAssign) o;
    return Objects.equals(companyContactRoleId, that.companyContactRoleId) &&
        Objects.equals(companyContactId, that.companyContactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyContactRoleId, companyContactId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The role ID.
     */
    private String companyContactRoleId;

    /**
     * The company contact ID..
     */
    private String companyContactId;

    public CompanyLocationRoleAssign build() {
      CompanyLocationRoleAssign result = new CompanyLocationRoleAssign();
      result.companyContactRoleId = this.companyContactRoleId;
      result.companyContactId = this.companyContactId;
      return result;
    }

    /**
     * The role ID.
     */
    public Builder companyContactRoleId(String companyContactRoleId) {
      this.companyContactRoleId = companyContactRoleId;
      return this;
    }

    /**
     * The company contact ID..
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      return this;
    }
  }
}
