package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Apple mobile platform application.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppleApplication implements MobilePlatformApplication {
  /**
   * The iOS App Clip application ID.
   */
  private String appClipApplicationId;

  /**
   * Whether iOS App Clips are enabled for this app.
   */
  private boolean appClipsEnabled;

  /**
   * The iOS App ID.
   */
  private String appId;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether iOS shared web credentials are enabled for this app.
   */
  private boolean sharedWebCredentialsEnabled;

  /**
   * Whether iOS Universal Links are supported by this app.
   */
  private boolean universalLinksEnabled;

  public AppleApplication() {
  }

  /**
   * The iOS App Clip application ID.
   */
  public String getAppClipApplicationId() {
    return appClipApplicationId;
  }

  public void setAppClipApplicationId(String appClipApplicationId) {
    this.appClipApplicationId = appClipApplicationId;
  }

  /**
   * Whether iOS App Clips are enabled for this app.
   */
  public boolean getAppClipsEnabled() {
    return appClipsEnabled;
  }

  public void setAppClipsEnabled(boolean appClipsEnabled) {
    this.appClipsEnabled = appClipsEnabled;
  }

  /**
   * The iOS App ID.
   */
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether iOS shared web credentials are enabled for this app.
   */
  public boolean getSharedWebCredentialsEnabled() {
    return sharedWebCredentialsEnabled;
  }

  public void setSharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
    this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
  }

  /**
   * Whether iOS Universal Links are supported by this app.
   */
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
    /**
     * The iOS App Clip application ID.
     */
    private String appClipApplicationId;

    /**
     * Whether iOS App Clips are enabled for this app.
     */
    private boolean appClipsEnabled;

    /**
     * The iOS App ID.
     */
    private String appId;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether iOS shared web credentials are enabled for this app.
     */
    private boolean sharedWebCredentialsEnabled;

    /**
     * Whether iOS Universal Links are supported by this app.
     */
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

    /**
     * The iOS App Clip application ID.
     */
    public Builder appClipApplicationId(String appClipApplicationId) {
      this.appClipApplicationId = appClipApplicationId;
      return this;
    }

    /**
     * Whether iOS App Clips are enabled for this app.
     */
    public Builder appClipsEnabled(boolean appClipsEnabled) {
      this.appClipsEnabled = appClipsEnabled;
      return this;
    }

    /**
     * The iOS App ID.
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether iOS shared web credentials are enabled for this app.
     */
    public Builder sharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
      this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
      return this;
    }

    /**
     * Whether iOS Universal Links are supported by this app.
     */
    public Builder universalLinksEnabled(boolean universalLinksEnabled) {
      this.universalLinksEnabled = universalLinksEnabled;
      return this;
    }
  }
}
