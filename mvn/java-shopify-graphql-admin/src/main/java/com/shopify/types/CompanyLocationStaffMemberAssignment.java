package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A representation of store's staff member who is assigned to a [company
 * location](https://shopify.dev/api/admin-graphql/latest/objects/CompanyLocation)
 * of the shop. The staff member's actions will be limited to objects associated
 * with the assigned company location.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyLocationStaffMemberAssignment implements com.shopify.types.Node {
  /**
   * The company location the staff member is assigned to.
   */
  private CompanyLocation companyLocation;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Represents the data of a staff member who's assigned to a company location.
   */
  private StaffMember staffMember;

  public CompanyLocationStaffMemberAssignment() {
  }

  /**
   * The company location the staff member is assigned to.
   */
  public CompanyLocation getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocation companyLocation) {
    this.companyLocation = companyLocation;
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
   * Represents the data of a staff member who's assigned to a company location.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  @Override
  public String toString() {
    return "CompanyLocationStaffMemberAssignment{companyLocation='" + companyLocation + "', id='" + id + "', staffMember='" + staffMember + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationStaffMemberAssignment that = (CompanyLocationStaffMemberAssignment) o;
    return Objects.equals(companyLocation, that.companyLocation) &&
        Objects.equals(id, that.id) &&
        Objects.equals(staffMember, that.staffMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocation, id, staffMember);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company location the staff member is assigned to.
     */
    private CompanyLocation companyLocation;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Represents the data of a staff member who's assigned to a company location.
     */
    private StaffMember staffMember;

    public CompanyLocationStaffMemberAssignment build() {
      CompanyLocationStaffMemberAssignment result = new CompanyLocationStaffMemberAssignment();
      result.companyLocation = this.companyLocation;
      result.id = this.id;
      result.staffMember = this.staffMember;
      return result;
    }

    /**
     * The company location the staff member is assigned to.
     */
    public Builder companyLocation(CompanyLocation companyLocation) {
      this.companyLocation = companyLocation;
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
     * Represents the data of a staff member who's assigned to a company location.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }
  }
}
