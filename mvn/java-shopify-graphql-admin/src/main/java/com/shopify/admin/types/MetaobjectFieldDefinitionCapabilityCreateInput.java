package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating capabilities on a metaobject field definition.
 */
public class MetaobjectFieldDefinitionCapabilityCreateInput {
  /**
   * The input for configuring the admin filterable capability.
   */
  private MetaobjectFieldCapabilityAdminFilterableInput adminFilterable;

  public MetaobjectFieldDefinitionCapabilityCreateInput() {
  }

  /**
   * The input for configuring the admin filterable capability.
   */
  public MetaobjectFieldCapabilityAdminFilterableInput getAdminFilterable() {
    return adminFilterable;
  }

  public void setAdminFilterable(MetaobjectFieldCapabilityAdminFilterableInput adminFilterable) {
    this.adminFilterable = adminFilterable;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinitionCapabilityCreateInput{adminFilterable='" + adminFilterable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionCapabilityCreateInput that = (MetaobjectFieldDefinitionCapabilityCreateInput) o;
    return Objects.equals(adminFilterable, that.adminFilterable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminFilterable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input for configuring the admin filterable capability.
     */
    private MetaobjectFieldCapabilityAdminFilterableInput adminFilterable;

    public MetaobjectFieldDefinitionCapabilityCreateInput build() {
      MetaobjectFieldDefinitionCapabilityCreateInput result = new MetaobjectFieldDefinitionCapabilityCreateInput();
      result.adminFilterable = this.adminFilterable;
      return result;
    }

    /**
     * The input for configuring the admin filterable capability.
     */
    public Builder adminFilterable(MetaobjectFieldCapabilityAdminFilterableInput adminFilterable) {
      this.adminFilterable = adminFilterable;
      return this;
    }
  }
}
