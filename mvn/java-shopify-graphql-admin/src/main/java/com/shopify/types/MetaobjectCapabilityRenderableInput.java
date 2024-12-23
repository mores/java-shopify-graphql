package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for enabling and disabling the renderable capability.
 */
public class MetaobjectCapabilityRenderableInput {
  /**
   * Indicates whether the capability should be enabled or disabled.
   */
  private boolean enabled;

  /**
   * The data associated with the renderable capability.
   */
  private MetaobjectCapabilityDefinitionDataRenderableInput data;

  public MetaobjectCapabilityRenderableInput() {
  }

  /**
   * Indicates whether the capability should be enabled or disabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The data associated with the renderable capability.
   */
  public MetaobjectCapabilityDefinitionDataRenderableInput getData() {
    return data;
  }

  public void setData(MetaobjectCapabilityDefinitionDataRenderableInput data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityRenderableInput{enabled='" + enabled + "', data='" + data + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityRenderableInput that = (MetaobjectCapabilityRenderableInput) o;
    return enabled == that.enabled &&
        Objects.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, data);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates whether the capability should be enabled or disabled.
     */
    private boolean enabled;

    /**
     * The data associated with the renderable capability.
     */
    private MetaobjectCapabilityDefinitionDataRenderableInput data;

    public MetaobjectCapabilityRenderableInput build() {
      MetaobjectCapabilityRenderableInput result = new MetaobjectCapabilityRenderableInput();
      result.enabled = this.enabled;
      result.data = this.data;
      return result;
    }

    /**
     * Indicates whether the capability should be enabled or disabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The data associated with the renderable capability.
     */
    public Builder data(MetaobjectCapabilityDefinitionDataRenderableInput data) {
      this.data = data;
      return this;
    }
  }
}
