package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides the capabilities of a metaobject definition.
 */
public class MetaobjectCapabilities {
  /**
   * Indicates whether a metaobject definition can be displayed as a page on the Online Store.
   */
  private MetaobjectCapabilitiesOnlineStore onlineStore;

  /**
   * Indicate whether a metaobject definition is publishable.
   */
  private MetaobjectCapabilitiesPublishable publishable;

  /**
   * Indicate whether a metaobject definition is renderable and exposes SEO data.
   */
  private MetaobjectCapabilitiesRenderable renderable;

  /**
   * Indicate whether a metaobject definition is translatable.
   */
  private MetaobjectCapabilitiesTranslatable translatable;

  public MetaobjectCapabilities() {
  }

  /**
   * Indicates whether a metaobject definition can be displayed as a page on the Online Store.
   */
  public MetaobjectCapabilitiesOnlineStore getOnlineStore() {
    return onlineStore;
  }

  public void setOnlineStore(MetaobjectCapabilitiesOnlineStore onlineStore) {
    this.onlineStore = onlineStore;
  }

  /**
   * Indicate whether a metaobject definition is publishable.
   */
  public MetaobjectCapabilitiesPublishable getPublishable() {
    return publishable;
  }

  public void setPublishable(MetaobjectCapabilitiesPublishable publishable) {
    this.publishable = publishable;
  }

  /**
   * Indicate whether a metaobject definition is renderable and exposes SEO data.
   */
  public MetaobjectCapabilitiesRenderable getRenderable() {
    return renderable;
  }

  public void setRenderable(MetaobjectCapabilitiesRenderable renderable) {
    this.renderable = renderable;
  }

  /**
   * Indicate whether a metaobject definition is translatable.
   */
  public MetaobjectCapabilitiesTranslatable getTranslatable() {
    return translatable;
  }

  public void setTranslatable(MetaobjectCapabilitiesTranslatable translatable) {
    this.translatable = translatable;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilities{onlineStore='" + onlineStore + "', publishable='" + publishable + "', renderable='" + renderable + "', translatable='" + translatable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilities that = (MetaobjectCapabilities) o;
    return Objects.equals(onlineStore, that.onlineStore) &&
        Objects.equals(publishable, that.publishable) &&
        Objects.equals(renderable, that.renderable) &&
        Objects.equals(translatable, that.translatable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineStore, publishable, renderable, translatable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates whether a metaobject definition can be displayed as a page on the Online Store.
     */
    private MetaobjectCapabilitiesOnlineStore onlineStore;

    /**
     * Indicate whether a metaobject definition is publishable.
     */
    private MetaobjectCapabilitiesPublishable publishable;

    /**
     * Indicate whether a metaobject definition is renderable and exposes SEO data.
     */
    private MetaobjectCapabilitiesRenderable renderable;

    /**
     * Indicate whether a metaobject definition is translatable.
     */
    private MetaobjectCapabilitiesTranslatable translatable;

    public MetaobjectCapabilities build() {
      MetaobjectCapabilities result = new MetaobjectCapabilities();
      result.onlineStore = this.onlineStore;
      result.publishable = this.publishable;
      result.renderable = this.renderable;
      result.translatable = this.translatable;
      return result;
    }

    /**
     * Indicates whether a metaobject definition can be displayed as a page on the Online Store.
     */
    public Builder onlineStore(MetaobjectCapabilitiesOnlineStore onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }

    /**
     * Indicate whether a metaobject definition is publishable.
     */
    public Builder publishable(MetaobjectCapabilitiesPublishable publishable) {
      this.publishable = publishable;
      return this;
    }

    /**
     * Indicate whether a metaobject definition is renderable and exposes SEO data.
     */
    public Builder renderable(MetaobjectCapabilitiesRenderable renderable) {
      this.renderable = renderable;
      return this;
    }

    /**
     * Indicate whether a metaobject definition is translatable.
     */
    public Builder translatable(MetaobjectCapabilitiesTranslatable translatable) {
      this.translatable = translatable;
      return this;
    }
  }
}
