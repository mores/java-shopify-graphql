package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
 *
 * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
 */
public class MetafieldAccessGrantInput {
  /**
   * The grantee being granted access.
   */
  private String grantee;

  /**
   * The level of access being granted.
   */
  private MetafieldGrantAccessLevel access;

  public MetafieldAccessGrantInput() {
  }

  /**
   * The grantee being granted access.
   */
  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  /**
   * The level of access being granted.
   */
  public MetafieldGrantAccessLevel getAccess() {
    return access;
  }

  public void setAccess(MetafieldGrantAccessLevel access) {
    this.access = access;
  }

  @Override
  public String toString() {
    return "MetafieldAccessGrantInput{grantee='" + grantee + "', access='" + access + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessGrantInput that = (MetafieldAccessGrantInput) o;
    return Objects.equals(grantee, that.grantee) &&
        Objects.equals(access, that.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantee, access);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The grantee being granted access.
     */
    private String grantee;

    /**
     * The level of access being granted.
     */
    private MetafieldGrantAccessLevel access;

    public MetafieldAccessGrantInput build() {
      MetafieldAccessGrantInput result = new MetafieldAccessGrantInput();
      result.grantee = this.grantee;
      result.access = this.access;
      return result;
    }

    /**
     * The grantee being granted access.
     */
    public Builder grantee(String grantee) {
      this.grantee = grantee;
      return this;
    }

    /**
     * The level of access being granted.
     */
    public Builder access(MetafieldGrantAccessLevel access) {
      this.access = access;
      return this;
    }
  }
}
