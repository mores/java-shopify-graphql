package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Capabilities available for a metaobject field definition.
 */
public class MetaobjectFieldDefinitionCapabilities {
  /**
   * Indicate whether a metaobject field definition is configured for filtering.
   */
  private MetaobjectFieldCapabilityAdminFilterable adminFilterable;

  public MetaobjectFieldDefinitionCapabilities() {
  }

  /**
   * Indicate whether a metaobject field definition is configured for filtering.
   */
  public MetaobjectFieldCapabilityAdminFilterable getAdminFilterable() {
    return adminFilterable;
  }

  public void setAdminFilterable(MetaobjectFieldCapabilityAdminFilterable adminFilterable) {
    this.adminFilterable = adminFilterable;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinitionCapabilities{adminFilterable='" + adminFilterable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionCapabilities that = (MetaobjectFieldDefinitionCapabilities) o;
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
     * Indicate whether a metaobject field definition is configured for filtering.
     */
    private MetaobjectFieldCapabilityAdminFilterable adminFilterable;

    public MetaobjectFieldDefinitionCapabilities build() {
      MetaobjectFieldDefinitionCapabilities result = new MetaobjectFieldDefinitionCapabilities();
      result.adminFilterable = this.adminFilterable;
      return result;
    }

    /**
     * Indicate whether a metaobject field definition is configured for filtering.
     */
    public Builder adminFilterable(MetaobjectFieldCapabilityAdminFilterable adminFilterable) {
      this.adminFilterable = adminFilterable;
      return this;
    }
  }
}
