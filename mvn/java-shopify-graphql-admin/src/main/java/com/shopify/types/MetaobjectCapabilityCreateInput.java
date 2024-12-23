package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating a metaobject capability.
 */
public class MetaobjectCapabilityCreateInput {
  /**
   * The input for enabling the publishable capability.
   */
  private MetaobjectCapabilityPublishableInput publishable;

  /**
   * The input for enabling the translatable capability.
   */
  private MetaobjectCapabilityTranslatableInput translatable;

  /**
   * The input for enabling the renderable capability.
   */
  private MetaobjectCapabilityRenderableInput renderable;

  /**
   * The input for enabling the Online Store capability.
   */
  private MetaobjectCapabilityOnlineStoreInput onlineStore;

  public MetaobjectCapabilityCreateInput() {
  }

  /**
   * The input for enabling the publishable capability.
   */
  public MetaobjectCapabilityPublishableInput getPublishable() {
    return publishable;
  }

  public void setPublishable(MetaobjectCapabilityPublishableInput publishable) {
    this.publishable = publishable;
  }

  /**
   * The input for enabling the translatable capability.
   */
  public MetaobjectCapabilityTranslatableInput getTranslatable() {
    return translatable;
  }

  public void setTranslatable(MetaobjectCapabilityTranslatableInput translatable) {
    this.translatable = translatable;
  }

  /**
   * The input for enabling the renderable capability.
   */
  public MetaobjectCapabilityRenderableInput getRenderable() {
    return renderable;
  }

  public void setRenderable(MetaobjectCapabilityRenderableInput renderable) {
    this.renderable = renderable;
  }

  /**
   * The input for enabling the Online Store capability.
   */
  public MetaobjectCapabilityOnlineStoreInput getOnlineStore() {
    return onlineStore;
  }

  public void setOnlineStore(MetaobjectCapabilityOnlineStoreInput onlineStore) {
    this.onlineStore = onlineStore;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityCreateInput{publishable='" + publishable + "', translatable='" + translatable + "', renderable='" + renderable + "', onlineStore='" + onlineStore + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityCreateInput that = (MetaobjectCapabilityCreateInput) o;
    return Objects.equals(publishable, that.publishable) &&
        Objects.equals(translatable, that.translatable) &&
        Objects.equals(renderable, that.renderable) &&
        Objects.equals(onlineStore, that.onlineStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishable, translatable, renderable, onlineStore);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input for enabling the publishable capability.
     */
    private MetaobjectCapabilityPublishableInput publishable;

    /**
     * The input for enabling the translatable capability.
     */
    private MetaobjectCapabilityTranslatableInput translatable;

    /**
     * The input for enabling the renderable capability.
     */
    private MetaobjectCapabilityRenderableInput renderable;

    /**
     * The input for enabling the Online Store capability.
     */
    private MetaobjectCapabilityOnlineStoreInput onlineStore;

    public MetaobjectCapabilityCreateInput build() {
      MetaobjectCapabilityCreateInput result = new MetaobjectCapabilityCreateInput();
      result.publishable = this.publishable;
      result.translatable = this.translatable;
      result.renderable = this.renderable;
      result.onlineStore = this.onlineStore;
      return result;
    }

    /**
     * The input for enabling the publishable capability.
     */
    public Builder publishable(MetaobjectCapabilityPublishableInput publishable) {
      this.publishable = publishable;
      return this;
    }

    /**
     * The input for enabling the translatable capability.
     */
    public Builder translatable(MetaobjectCapabilityTranslatableInput translatable) {
      this.translatable = translatable;
      return this;
    }

    /**
     * The input for enabling the renderable capability.
     */
    public Builder renderable(MetaobjectCapabilityRenderableInput renderable) {
      this.renderable = renderable;
      return this;
    }

    /**
     * The input for enabling the Online Store capability.
     */
    public Builder onlineStore(MetaobjectCapabilityOnlineStoreInput onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }
  }
}
