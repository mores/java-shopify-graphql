package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BlogFeed {
  
  private String location;

  
  private String path;

  public BlogFeed() {
  }

  
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public String toString() {
    return "BlogFeed{location='" + location + "', path='" + path + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogFeed that = (BlogFeed) o;
    return Objects.equals(location, that.location) &&
        Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, path);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String location;

    
    private String path;

    public BlogFeed build() {
      BlogFeed result = new BlogFeed();
      result.location = this.location;
      result.path = this.path;
      return result;
    }

    
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    
    public Builder path(String path) {
      this.path = path;
      return this;
    }
  }
}
