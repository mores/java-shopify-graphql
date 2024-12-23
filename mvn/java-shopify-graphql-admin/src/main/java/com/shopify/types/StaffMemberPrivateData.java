package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents the data used to customize the Shopify admin experience for a logged-in staff member.
 */
public class StaffMemberPrivateData {
  /**
   * The URL to the staff member's account settings page.
   */
  private String accountSettingsUrl;

  /**
   * The date and time when the staff member was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Access permissions for the staff member.
   */
  private List<StaffMemberPermission> permissions;

  public StaffMemberPrivateData() {
  }

  /**
   * The URL to the staff member's account settings page.
   */
  public String getAccountSettingsUrl() {
    return accountSettingsUrl;
  }

  public void setAccountSettingsUrl(String accountSettingsUrl) {
    this.accountSettingsUrl = accountSettingsUrl;
  }

  /**
   * The date and time when the staff member was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Access permissions for the staff member.
   */
  public List<StaffMemberPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<StaffMemberPermission> permissions) {
    this.permissions = permissions;
  }

  @Override
  public String toString() {
    return "StaffMemberPrivateData{accountSettingsUrl='" + accountSettingsUrl + "', createdAt='" + createdAt + "', permissions='" + permissions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StaffMemberPrivateData that = (StaffMemberPrivateData) o;
    return Objects.equals(accountSettingsUrl, that.accountSettingsUrl) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(permissions, that.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSettingsUrl, createdAt, permissions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL to the staff member's account settings page.
     */
    private String accountSettingsUrl;

    /**
     * The date and time when the staff member was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Access permissions for the staff member.
     */
    private List<StaffMemberPermission> permissions;

    public StaffMemberPrivateData build() {
      StaffMemberPrivateData result = new StaffMemberPrivateData();
      result.accountSettingsUrl = this.accountSettingsUrl;
      result.createdAt = this.createdAt;
      result.permissions = this.permissions;
      return result;
    }

    /**
     * The URL to the staff member's account settings page.
     */
    public Builder accountSettingsUrl(String accountSettingsUrl) {
      this.accountSettingsUrl = accountSettingsUrl;
      return this;
    }

    /**
     * The date and time when the staff member was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Access permissions for the staff member.
     */
    public Builder permissions(List<StaffMemberPermission> permissions) {
      this.permissions = permissions;
      return this;
    }
  }
}
