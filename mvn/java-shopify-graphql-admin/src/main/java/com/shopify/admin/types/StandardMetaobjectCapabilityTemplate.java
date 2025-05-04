package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Describes a capability that is enabled on a Metaobject Definition.
 */
public class StandardMetaobjectCapabilityTemplate {
  /**
   * The type of capability that's enabled for the metaobject definition.
   */
  private MetaobjectCapabilityType capabilityType;

  public StandardMetaobjectCapabilityTemplate() {
  }

  /**
   * The type of capability that's enabled for the metaobject definition.
   */
  public MetaobjectCapabilityType getCapabilityType() {
    return capabilityType;
  }

  public void setCapabilityType(MetaobjectCapabilityType capabilityType) {
    this.capabilityType = capabilityType;
  }

  @Override
  public String toString() {
    return "StandardMetaobjectCapabilityTemplate{capabilityType='" + capabilityType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetaobjectCapabilityTemplate that = (StandardMetaobjectCapabilityTemplate) o;
    return Objects.equals(capabilityType, that.capabilityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilityType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of capability that's enabled for the metaobject definition.
     */
    private MetaobjectCapabilityType capabilityType;

    public StandardMetaobjectCapabilityTemplate build() {
      StandardMetaobjectCapabilityTemplate result = new StandardMetaobjectCapabilityTemplate();
      result.capabilityType = this.capabilityType;
      return result;
    }

    /**
     * The type of capability that's enabled for the metaobject definition.
     */
    public Builder capabilityType(MetaobjectCapabilityType capabilityType) {
      this.capabilityType = capabilityType;
      return this;
    }
  }
}
