package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields of the renderable capability for SEO aliases.
 */
public class MetaobjectCapabilityDefinitionDataRenderableInput {
  /**
   * The metaobject field used as an alias for the SEO page title.
   */
  private String metaTitleKey;

  /**
   * The metaobject field used as an alias for the SEO page description.
   */
  private String metaDescriptionKey;

  public MetaobjectCapabilityDefinitionDataRenderableInput() {
  }

  /**
   * The metaobject field used as an alias for the SEO page title.
   */
  public String getMetaTitleKey() {
    return metaTitleKey;
  }

  public void setMetaTitleKey(String metaTitleKey) {
    this.metaTitleKey = metaTitleKey;
  }

  /**
   * The metaobject field used as an alias for the SEO page description.
   */
  public String getMetaDescriptionKey() {
    return metaDescriptionKey;
  }

  public void setMetaDescriptionKey(String metaDescriptionKey) {
    this.metaDescriptionKey = metaDescriptionKey;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDefinitionDataRenderableInput{metaTitleKey='" + metaTitleKey + "', metaDescriptionKey='" + metaDescriptionKey + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDefinitionDataRenderableInput that = (MetaobjectCapabilityDefinitionDataRenderableInput) o;
    return Objects.equals(metaTitleKey, that.metaTitleKey) &&
        Objects.equals(metaDescriptionKey, that.metaDescriptionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaTitleKey, metaDescriptionKey);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metaobject field used as an alias for the SEO page title.
     */
    private String metaTitleKey;

    /**
     * The metaobject field used as an alias for the SEO page description.
     */
    private String metaDescriptionKey;

    public MetaobjectCapabilityDefinitionDataRenderableInput build() {
      MetaobjectCapabilityDefinitionDataRenderableInput result = new MetaobjectCapabilityDefinitionDataRenderableInput();
      result.metaTitleKey = this.metaTitleKey;
      result.metaDescriptionKey = this.metaDescriptionKey;
      return result;
    }

    /**
     * The metaobject field used as an alias for the SEO page title.
     */
    public Builder metaTitleKey(String metaTitleKey) {
      this.metaTitleKey = metaTitleKey;
      return this;
    }

    /**
     * The metaobject field used as an alias for the SEO page description.
     */
    public Builder metaDescriptionKey(String metaDescriptionKey) {
      this.metaDescriptionKey = metaDescriptionKey;
      return this;
    }
  }
}
