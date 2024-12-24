package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerAccountAppExtensionPage implements com.shopify.types.CustomerAccountPage, com.shopify.types.Navigable, com.shopify.types.Node {
  
  private String appExtensionUuid;

  
  private String defaultCursor;

  
  private String handle;

  
  private String id;

  
  private String title;

  public CustomerAccountAppExtensionPage() {
  }

  
  public String getAppExtensionUuid() {
    return appExtensionUuid;
  }

  public void setAppExtensionUuid(String appExtensionUuid) {
    this.appExtensionUuid = appExtensionUuid;
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

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CustomerAccountAppExtensionPage{appExtensionUuid='" + appExtensionUuid + "', defaultCursor='" + defaultCursor + "', handle='" + handle + "', id='" + id + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccountAppExtensionPage that = (CustomerAccountAppExtensionPage) o;
    return Objects.equals(appExtensionUuid, that.appExtensionUuid) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appExtensionUuid, defaultCursor, handle, id, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String appExtensionUuid;

    
    private String defaultCursor;

    
    private String handle;

    
    private String id;

    
    private String title;

    public CustomerAccountAppExtensionPage build() {
      CustomerAccountAppExtensionPage result = new CustomerAccountAppExtensionPage();
      result.appExtensionUuid = this.appExtensionUuid;
      result.defaultCursor = this.defaultCursor;
      result.handle = this.handle;
      result.id = this.id;
      result.title = this.title;
      return result;
    }

    
    public Builder appExtensionUuid(String appExtensionUuid) {
      this.appExtensionUuid = appExtensionUuid;
      return this;
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

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
