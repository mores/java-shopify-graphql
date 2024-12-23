package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an explicit access grant to be deleted for the metafields under this definition.
 */
public class MetafieldAccessGrantDeleteInput {
  /**
   * The grantee whose grant should be deleted.
   */
  private String grantee;

  public MetafieldAccessGrantDeleteInput() {
  }

  /**
   * The grantee whose grant should be deleted.
   */
  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  @Override
  public String toString() {
    return "MetafieldAccessGrantDeleteInput{grantee='" + grantee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessGrantDeleteInput that = (MetafieldAccessGrantDeleteInput) o;
    return Objects.equals(grantee, that.grantee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The grantee whose grant should be deleted.
     */
    private String grantee;

    public MetafieldAccessGrantDeleteInput build() {
      MetafieldAccessGrantDeleteInput result = new MetafieldAccessGrantDeleteInput();
      result.grantee = this.grantee;
      return result;
    }

    /**
     * The grantee whose grant should be deleted.
     */
    public Builder grantee(String grantee) {
      this.grantee = grantee;
      return this;
    }
  }
}
