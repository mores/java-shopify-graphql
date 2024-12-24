package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityUpdateInput {
  
  private MetaobjectCapabilityPublishableInput publishable;

  
  private MetaobjectCapabilityTranslatableInput translatable;

  
  private MetaobjectCapabilityRenderableInput renderable;

  
  private MetaobjectCapabilityOnlineStoreInput onlineStore;

  public MetaobjectCapabilityUpdateInput() {
  }

  
  public MetaobjectCapabilityPublishableInput getPublishable() {
    return publishable;
  }

  public void setPublishable(MetaobjectCapabilityPublishableInput publishable) {
    this.publishable = publishable;
  }

  
  public MetaobjectCapabilityTranslatableInput getTranslatable() {
    return translatable;
  }

  public void setTranslatable(MetaobjectCapabilityTranslatableInput translatable) {
    this.translatable = translatable;
  }

  
  public MetaobjectCapabilityRenderableInput getRenderable() {
    return renderable;
  }

  public void setRenderable(MetaobjectCapabilityRenderableInput renderable) {
    this.renderable = renderable;
  }

  
  public MetaobjectCapabilityOnlineStoreInput getOnlineStore() {
    return onlineStore;
  }

  public void setOnlineStore(MetaobjectCapabilityOnlineStoreInput onlineStore) {
    this.onlineStore = onlineStore;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityUpdateInput{publishable='" + publishable + "', translatable='" + translatable + "', renderable='" + renderable + "', onlineStore='" + onlineStore + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityUpdateInput that = (MetaobjectCapabilityUpdateInput) o;
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
    
    private MetaobjectCapabilityPublishableInput publishable;

    
    private MetaobjectCapabilityTranslatableInput translatable;

    
    private MetaobjectCapabilityRenderableInput renderable;

    
    private MetaobjectCapabilityOnlineStoreInput onlineStore;

    public MetaobjectCapabilityUpdateInput build() {
      MetaobjectCapabilityUpdateInput result = new MetaobjectCapabilityUpdateInput();
      result.publishable = this.publishable;
      result.translatable = this.translatable;
      result.renderable = this.renderable;
      result.onlineStore = this.onlineStore;
      return result;
    }

    
    public Builder publishable(MetaobjectCapabilityPublishableInput publishable) {
      this.publishable = publishable;
      return this;
    }

    
    public Builder translatable(MetaobjectCapabilityTranslatableInput translatable) {
      this.translatable = translatable;
      return this;
    }

    
    public Builder renderable(MetaobjectCapabilityRenderableInput renderable) {
      this.renderable = renderable;
      return this;
    }

    
    public Builder onlineStore(MetaobjectCapabilityOnlineStoreInput onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }
  }
}
