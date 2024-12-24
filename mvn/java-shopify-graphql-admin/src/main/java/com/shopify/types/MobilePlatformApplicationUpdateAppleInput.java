package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MobilePlatformApplicationUpdateAppleInput {
  
  private String appId;

  
  private Boolean universalLinksEnabled;

  
  private Boolean sharedWebCredentialsEnabled;

  
  private Boolean appClipsEnabled;

  
  private String appClipApplicationId;

  public MobilePlatformApplicationUpdateAppleInput() {
  }

  
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  public Boolean getUniversalLinksEnabled() {
    return universalLinksEnabled;
  }

  public void setUniversalLinksEnabled(Boolean universalLinksEnabled) {
    this.universalLinksEnabled = universalLinksEnabled;
  }

  
  public Boolean getSharedWebCredentialsEnabled() {
    return sharedWebCredentialsEnabled;
  }

  public void setSharedWebCredentialsEnabled(Boolean sharedWebCredentialsEnabled) {
    this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
  }

  
  public Boolean getAppClipsEnabled() {
    return appClipsEnabled;
  }

  public void setAppClipsEnabled(Boolean appClipsEnabled) {
    this.appClipsEnabled = appClipsEnabled;
  }

  
  public String getAppClipApplicationId() {
    return appClipApplicationId;
  }

  public void setAppClipApplicationId(String appClipApplicationId) {
    this.appClipApplicationId = appClipApplicationId;
  }

  @Override
  public String toString() {
    return "MobilePlatformApplicationUpdateAppleInput{appId='" + appId + "', universalLinksEnabled='" + universalLinksEnabled + "', sharedWebCredentialsEnabled='" + sharedWebCredentialsEnabled + "', appClipsEnabled='" + appClipsEnabled + "', appClipApplicationId='" + appClipApplicationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationUpdateAppleInput that = (MobilePlatformApplicationUpdateAppleInput) o;
    return Objects.equals(appId, that.appId) &&
        Objects.equals(universalLinksEnabled, that.universalLinksEnabled) &&
        Objects.equals(sharedWebCredentialsEnabled, that.sharedWebCredentialsEnabled) &&
        Objects.equals(appClipsEnabled, that.appClipsEnabled) &&
        Objects.equals(appClipApplicationId, that.appClipApplicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, universalLinksEnabled, sharedWebCredentialsEnabled, appClipsEnabled, appClipApplicationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String appId;

    
    private Boolean universalLinksEnabled;

    
    private Boolean sharedWebCredentialsEnabled;

    
    private Boolean appClipsEnabled;

    
    private String appClipApplicationId;

    public MobilePlatformApplicationUpdateAppleInput build() {
      MobilePlatformApplicationUpdateAppleInput result = new MobilePlatformApplicationUpdateAppleInput();
      result.appId = this.appId;
      result.universalLinksEnabled = this.universalLinksEnabled;
      result.sharedWebCredentialsEnabled = this.sharedWebCredentialsEnabled;
      result.appClipsEnabled = this.appClipsEnabled;
      result.appClipApplicationId = this.appClipApplicationId;
      return result;
    }

    
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    
    public Builder universalLinksEnabled(Boolean universalLinksEnabled) {
      this.universalLinksEnabled = universalLinksEnabled;
      return this;
    }

    
    public Builder sharedWebCredentialsEnabled(Boolean sharedWebCredentialsEnabled) {
      this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
      return this;
    }

    
    public Builder appClipsEnabled(Boolean appClipsEnabled) {
      this.appClipsEnabled = appClipsEnabled;
      return this;
    }

    
    public Builder appClipApplicationId(String appClipApplicationId) {
      this.appClipApplicationId = appClipApplicationId;
      return this;
    }
  }
}
