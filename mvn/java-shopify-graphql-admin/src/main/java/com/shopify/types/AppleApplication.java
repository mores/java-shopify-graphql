package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppleApplication implements MobilePlatformApplication {
  
  private String appClipApplicationId;

  
  private boolean appClipsEnabled;

  
  private String appId;

  
  private String id;

  
  private boolean sharedWebCredentialsEnabled;

  
  private boolean universalLinksEnabled;

  public AppleApplication() {
  }

  
  public String getAppClipApplicationId() {
    return appClipApplicationId;
  }

  public void setAppClipApplicationId(String appClipApplicationId) {
    this.appClipApplicationId = appClipApplicationId;
  }

  
  public boolean getAppClipsEnabled() {
    return appClipsEnabled;
  }

  public void setAppClipsEnabled(boolean appClipsEnabled) {
    this.appClipsEnabled = appClipsEnabled;
  }

  
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getSharedWebCredentialsEnabled() {
    return sharedWebCredentialsEnabled;
  }

  public void setSharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
    this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
  }

  
  public boolean getUniversalLinksEnabled() {
    return universalLinksEnabled;
  }

  public void setUniversalLinksEnabled(boolean universalLinksEnabled) {
    this.universalLinksEnabled = universalLinksEnabled;
  }

  @Override
  public String toString() {
    return "AppleApplication{appClipApplicationId='" + appClipApplicationId + "', appClipsEnabled='" + appClipsEnabled + "', appId='" + appId + "', id='" + id + "', sharedWebCredentialsEnabled='" + sharedWebCredentialsEnabled + "', universalLinksEnabled='" + universalLinksEnabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppleApplication that = (AppleApplication) o;
    return Objects.equals(appClipApplicationId, that.appClipApplicationId) &&
        appClipsEnabled == that.appClipsEnabled &&
        Objects.equals(appId, that.appId) &&
        Objects.equals(id, that.id) &&
        sharedWebCredentialsEnabled == that.sharedWebCredentialsEnabled &&
        universalLinksEnabled == that.universalLinksEnabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appClipApplicationId, appClipsEnabled, appId, id, sharedWebCredentialsEnabled, universalLinksEnabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String appClipApplicationId;

    
    private boolean appClipsEnabled;

    
    private String appId;

    
    private String id;

    
    private boolean sharedWebCredentialsEnabled;

    
    private boolean universalLinksEnabled;

    public AppleApplication build() {
      AppleApplication result = new AppleApplication();
      result.appClipApplicationId = this.appClipApplicationId;
      result.appClipsEnabled = this.appClipsEnabled;
      result.appId = this.appId;
      result.id = this.id;
      result.sharedWebCredentialsEnabled = this.sharedWebCredentialsEnabled;
      result.universalLinksEnabled = this.universalLinksEnabled;
      return result;
    }

    
    public Builder appClipApplicationId(String appClipApplicationId) {
      this.appClipApplicationId = appClipApplicationId;
      return this;
    }

    
    public Builder appClipsEnabled(boolean appClipsEnabled) {
      this.appClipsEnabled = appClipsEnabled;
      return this;
    }

    
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder sharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
      this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
      return this;
    }

    
    public Builder universalLinksEnabled(boolean universalLinksEnabled) {
      this.universalLinksEnabled = universalLinksEnabled;
      return this;
    }
  }
}
