package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ScriptTag implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private boolean cache;

  
  private OffsetDateTime createdAt;

  
  private ScriptTagDisplayScope displayScope;

  
  private String id;

  
  private String legacyResourceId;

  
  private String src;

  
  private OffsetDateTime updatedAt;

  public ScriptTag() {
  }

  
  public boolean getCache() {
    return cache;
  }

  public void setCache(boolean cache) {
    this.cache = cache;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public ScriptTagDisplayScope getDisplayScope() {
    return displayScope;
  }

  public void setDisplayScope(ScriptTagDisplayScope displayScope) {
    this.displayScope = displayScope;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "ScriptTag{cache='" + cache + "', createdAt='" + createdAt + "', displayScope='" + displayScope + "', id='" + id + "', legacyResourceId='" + legacyResourceId + "', src='" + src + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTag that = (ScriptTag) o;
    return cache == that.cache &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(displayScope, that.displayScope) &&
        Objects.equals(id, that.id) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(src, that.src) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cache, createdAt, displayScope, id, legacyResourceId, src, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean cache;

    
    private OffsetDateTime createdAt;

    
    private ScriptTagDisplayScope displayScope;

    
    private String id;

    
    private String legacyResourceId;

    
    private String src;

    
    private OffsetDateTime updatedAt;

    public ScriptTag build() {
      ScriptTag result = new ScriptTag();
      result.cache = this.cache;
      result.createdAt = this.createdAt;
      result.displayScope = this.displayScope;
      result.id = this.id;
      result.legacyResourceId = this.legacyResourceId;
      result.src = this.src;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder cache(boolean cache) {
      this.cache = cache;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder displayScope(ScriptTagDisplayScope displayScope) {
      this.displayScope = displayScope;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder src(String src) {
      this.src = src;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
