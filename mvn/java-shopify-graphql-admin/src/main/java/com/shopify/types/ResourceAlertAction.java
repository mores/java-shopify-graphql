package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ResourceAlertAction {
  
  private boolean primary;

  
  private String show;

  
  private String title;

  
  private String url;

  public ResourceAlertAction() {
  }

  
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  
  public String getShow() {
    return show;
  }

  public void setShow(String show) {
    this.show = show;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ResourceAlertAction{primary='" + primary + "', show='" + show + "', title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceAlertAction that = (ResourceAlertAction) o;
    return primary == that.primary &&
        Objects.equals(show, that.show) &&
        Objects.equals(title, that.title) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, show, title, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean primary;

    
    private String show;

    
    private String title;

    
    private String url;

    public ResourceAlertAction build() {
      ResourceAlertAction result = new ResourceAlertAction();
      result.primary = this.primary;
      result.show = this.show;
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    
    public Builder show(String show) {
      this.show = show;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
