package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilities {
  
  private MetaobjectCapabilitiesOnlineStore onlineStore;

  
  private MetaobjectCapabilitiesPublishable publishable;

  
  private MetaobjectCapabilitiesRenderable renderable;

  
  private MetaobjectCapabilitiesTranslatable translatable;

  public MetaobjectCapabilities() {
  }

  
  public MetaobjectCapabilitiesOnlineStore getOnlineStore() {
    return onlineStore;
  }

  public void setOnlineStore(MetaobjectCapabilitiesOnlineStore onlineStore) {
    this.onlineStore = onlineStore;
  }

  
  public MetaobjectCapabilitiesPublishable getPublishable() {
    return publishable;
  }

  public void setPublishable(MetaobjectCapabilitiesPublishable publishable) {
    this.publishable = publishable;
  }

  
  public MetaobjectCapabilitiesRenderable getRenderable() {
    return renderable;
  }

  public void setRenderable(MetaobjectCapabilitiesRenderable renderable) {
    this.renderable = renderable;
  }

  
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
    
    private MetaobjectCapabilitiesOnlineStore onlineStore;

    
    private MetaobjectCapabilitiesPublishable publishable;

    
    private MetaobjectCapabilitiesRenderable renderable;

    
    private MetaobjectCapabilitiesTranslatable translatable;

    public MetaobjectCapabilities build() {
      MetaobjectCapabilities result = new MetaobjectCapabilities();
      result.onlineStore = this.onlineStore;
      result.publishable = this.publishable;
      result.renderable = this.renderable;
      result.translatable = this.translatable;
      return result;
    }

    
    public Builder onlineStore(MetaobjectCapabilitiesOnlineStore onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }

    
    public Builder publishable(MetaobjectCapabilitiesPublishable publishable) {
      this.publishable = publishable;
      return this;
    }

    
    public Builder renderable(MetaobjectCapabilitiesRenderable renderable) {
      this.renderable = renderable;
      return this;
    }

    
    public Builder translatable(MetaobjectCapabilitiesTranslatable translatable) {
      this.translatable = translatable;
      return this;
    }
  }
}
