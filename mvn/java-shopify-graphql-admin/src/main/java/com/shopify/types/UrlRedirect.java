package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class UrlRedirect implements com.shopify.types.Node {
  
  private String id;

  
  private String path;

  
  private String target;

  public UrlRedirect() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "UrlRedirect{id='" + id + "', path='" + path + "', target='" + target + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirect that = (UrlRedirect) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(path, that.path) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, target);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String path;

    
    private String target;

    public UrlRedirect build() {
      UrlRedirect result = new UrlRedirect();
      result.id = this.id;
      result.path = this.path;
      result.target = this.target;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    
    public Builder target(String target) {
      this.target = target;
      return this;
    }
  }
}
