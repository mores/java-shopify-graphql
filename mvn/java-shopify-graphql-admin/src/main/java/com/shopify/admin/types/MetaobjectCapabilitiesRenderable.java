package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The renderable capability of a metaobject definition.
 */
public class MetaobjectCapabilitiesRenderable {
  /**
   * The data associated with the renderable capability.
   */
  private MetaobjectCapabilityDefinitionDataRenderable data;

  /**
   * Indicates if the capability is enabled.
   */
  private boolean enabled;

  public MetaobjectCapabilitiesRenderable() {
  }

  /**
   * The data associated with the renderable capability.
   */
  public MetaobjectCapabilityDefinitionDataRenderable getData() {
    return data;
  }

  public void setData(MetaobjectCapabilityDefinitionDataRenderable data) {
    this.data = data;
  }

  /**
   * Indicates if the capability is enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilitiesRenderable{data='" + data + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilitiesRenderable that = (MetaobjectCapabilitiesRenderable) o;
    return Objects.equals(data, that.data) &&
        enabled == that.enabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The data associated with the renderable capability.
     */
    private MetaobjectCapabilityDefinitionDataRenderable data;

    /**
     * Indicates if the capability is enabled.
     */
    private boolean enabled;

    public MetaobjectCapabilitiesRenderable build() {
      MetaobjectCapabilitiesRenderable result = new MetaobjectCapabilitiesRenderable();
      result.data = this.data;
      result.enabled = this.enabled;
      return result;
    }

    /**
     * The data associated with the renderable capability.
     */
    public Builder data(MetaobjectCapabilityDefinitionDataRenderable data) {
      this.data = data;
      return this;
    }

    /**
     * Indicates if the capability is enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
