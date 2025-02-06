package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The renderable capability data for the metaobject definition.
 */
public class MetaobjectCapabilityDefinitionDataRenderable {
  /**
   * The metaobject field used as an alias for the SEO page description.
   */
  private String metaDescriptionKey;

  /**
   * The metaobject field used as an alias for the SEO page title.
   */
  private String metaTitleKey;

  public MetaobjectCapabilityDefinitionDataRenderable() {
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

  /**
   * The metaobject field used as an alias for the SEO page title.
   */
  public String getMetaTitleKey() {
    return metaTitleKey;
  }

  public void setMetaTitleKey(String metaTitleKey) {
    this.metaTitleKey = metaTitleKey;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDefinitionDataRenderable{metaDescriptionKey='" + metaDescriptionKey + "', metaTitleKey='" + metaTitleKey + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDefinitionDataRenderable that = (MetaobjectCapabilityDefinitionDataRenderable) o;
    return Objects.equals(metaDescriptionKey, that.metaDescriptionKey) &&
        Objects.equals(metaTitleKey, that.metaTitleKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaDescriptionKey, metaTitleKey);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metaobject field used as an alias for the SEO page description.
     */
    private String metaDescriptionKey;

    /**
     * The metaobject field used as an alias for the SEO page title.
     */
    private String metaTitleKey;

    public MetaobjectCapabilityDefinitionDataRenderable build() {
      MetaobjectCapabilityDefinitionDataRenderable result = new MetaobjectCapabilityDefinitionDataRenderable();
      result.metaDescriptionKey = this.metaDescriptionKey;
      result.metaTitleKey = this.metaTitleKey;
      return result;
    }

    /**
     * The metaobject field used as an alias for the SEO page description.
     */
    public Builder metaDescriptionKey(String metaDescriptionKey) {
      this.metaDescriptionKey = metaDescriptionKey;
      return this;
    }

    /**
     * The metaobject field used as an alias for the SEO page title.
     */
    public Builder metaTitleKey(String metaTitleKey) {
      this.metaTitleKey = metaTitleKey;
      return this;
    }
  }
}
