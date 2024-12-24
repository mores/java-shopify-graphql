package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MobilePlatformApplicationCreateAppleInput {
  
  private String appId;

  
  private boolean universalLinksEnabled;

  
  private boolean sharedWebCredentialsEnabled;

  
  private Boolean appClipsEnabled;

  
  private String appClipApplicationId;

  public MobilePlatformApplicationCreateAppleInput() {
  }

  
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  public boolean getUniversalLinksEnabled() {
    return universalLinksEnabled;
  }

  public void setUniversalLinksEnabled(boolean universalLinksEnabled) {
    this.universalLinksEnabled = universalLinksEnabled;
  }

  
  public boolean getSharedWebCredentialsEnabled() {
    return sharedWebCredentialsEnabled;
  }

  public void setSharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
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
    return "MobilePlatformApplicationCreateAppleInput{appId='" + appId + "', universalLinksEnabled='" + universalLinksEnabled + "', sharedWebCredentialsEnabled='" + sharedWebCredentialsEnabled + "', appClipsEnabled='" + appClipsEnabled + "', appClipApplicationId='" + appClipApplicationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationCreateAppleInput that = (MobilePlatformApplicationCreateAppleInput) o;
    return Objects.equals(appId, that.appId) &&
        universalLinksEnabled == that.universalLinksEnabled &&
        sharedWebCredentialsEnabled == that.sharedWebCredentialsEnabled &&
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

    
    private boolean universalLinksEnabled;

    
    private boolean sharedWebCredentialsEnabled;

    
    private Boolean appClipsEnabled;

    
    private String appClipApplicationId;

    public MobilePlatformApplicationCreateAppleInput build() {
      MobilePlatformApplicationCreateAppleInput result = new MobilePlatformApplicationCreateAppleInput();
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

    
    public Builder universalLinksEnabled(boolean universalLinksEnabled) {
      this.universalLinksEnabled = universalLinksEnabled;
      return this;
    }

    
    public Builder sharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
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
