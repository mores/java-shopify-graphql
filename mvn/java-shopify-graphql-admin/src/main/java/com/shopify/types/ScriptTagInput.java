package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ScriptTagInput {
  
  private String src;

  
  private ScriptTagDisplayScope displayScope;

  
  private Boolean cache = false;

  public ScriptTagInput() {
  }

  
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  
  public ScriptTagDisplayScope getDisplayScope() {
    return displayScope;
  }

  public void setDisplayScope(ScriptTagDisplayScope displayScope) {
    this.displayScope = displayScope;
  }

  
  public Boolean getCache() {
    return cache;
  }

  public void setCache(Boolean cache) {
    this.cache = cache;
  }

  @Override
  public String toString() {
    return "ScriptTagInput{src='" + src + "', displayScope='" + displayScope + "', cache='" + cache + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTagInput that = (ScriptTagInput) o;
    return Objects.equals(src, that.src) &&
        Objects.equals(displayScope, that.displayScope) &&
        Objects.equals(cache, that.cache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, displayScope, cache);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String src;

    
    private ScriptTagDisplayScope displayScope;

    
    private Boolean cache = false;

    public ScriptTagInput build() {
      ScriptTagInput result = new ScriptTagInput();
      result.src = this.src;
      result.displayScope = this.displayScope;
      result.cache = this.cache;
      return result;
    }

    
    public Builder src(String src) {
      this.src = src;
      return this;
    }

    
    public Builder displayScope(ScriptTagDisplayScope displayScope) {
      this.displayScope = displayScope;
      return this;
    }

    
    public Builder cache(Boolean cache) {
      this.cache = cache;
      return this;
    }
  }
}
