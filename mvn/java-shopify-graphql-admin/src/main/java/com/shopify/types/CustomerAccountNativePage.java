package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerAccountNativePage implements com.shopify.types.CustomerAccountPage, com.shopify.types.Navigable, com.shopify.types.Node {
  
  private String defaultCursor;

  
  private String handle;

  
  private String id;

  
  private CustomerAccountNativePagePageType pageType;

  
  private String title;

  public CustomerAccountNativePage() {
  }

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public CustomerAccountNativePagePageType getPageType() {
    return pageType;
  }

  public void setPageType(CustomerAccountNativePagePageType pageType) {
    this.pageType = pageType;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CustomerAccountNativePage{defaultCursor='" + defaultCursor + "', handle='" + handle + "', id='" + id + "', pageType='" + pageType + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccountNativePage that = (CustomerAccountNativePage) o;
    return Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(pageType, that.pageType) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCursor, handle, id, pageType, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String defaultCursor;

    
    private String handle;

    
    private String id;

    
    private CustomerAccountNativePagePageType pageType;

    
    private String title;

    public CustomerAccountNativePage build() {
      CustomerAccountNativePage result = new CustomerAccountNativePage();
      result.defaultCursor = this.defaultCursor;
      result.handle = this.handle;
      result.id = this.id;
      result.pageType = this.pageType;
      result.title = this.title;
      return result;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder pageType(CustomerAccountNativePagePageType pageType) {
      this.pageType = pageType;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
