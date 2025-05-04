package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an Apple based mobile platform application.
 */
public class MobilePlatformApplicationUpdateAppleInput {
  /**
   * Apple application ID.
   */
  private String appId;

  /**
   * Whether Apple Universal Links are supported by this app.
   */
  private Boolean universalLinksEnabled;

  /**
   * Whether Apple shared web credentials are enabled for this app.
   */
  private Boolean sharedWebCredentialsEnabled;

  /**
   * Whether Apple App Clips are enabled for this app.
   */
  private Boolean appClipsEnabled;

  /**
   * The Apple App Clip application ID.
   */
  private String appClipApplicationId;

  public MobilePlatformApplicationUpdateAppleInput() {
  }

  /**
   * Apple application ID.
   */
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * Whether Apple Universal Links are supported by this app.
   */
  public Boolean getUniversalLinksEnabled() {
    return universalLinksEnabled;
  }

  public void setUniversalLinksEnabled(Boolean universalLinksEnabled) {
    this.universalLinksEnabled = universalLinksEnabled;
  }

  /**
   * Whether Apple shared web credentials are enabled for this app.
   */
  public Boolean getSharedWebCredentialsEnabled() {
    return sharedWebCredentialsEnabled;
  }

  public void setSharedWebCredentialsEnabled(Boolean sharedWebCredentialsEnabled) {
    this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
  }

  /**
   * Whether Apple App Clips are enabled for this app.
   */
  public Boolean getAppClipsEnabled() {
    return appClipsEnabled;
  }

  public void setAppClipsEnabled(Boolean appClipsEnabled) {
    this.appClipsEnabled = appClipsEnabled;
  }

  /**
   * The Apple App Clip application ID.
   */
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
    /**
     * Apple application ID.
     */
    private String appId;

    /**
     * Whether Apple Universal Links are supported by this app.
     */
    private Boolean universalLinksEnabled;

    /**
     * Whether Apple shared web credentials are enabled for this app.
     */
    private Boolean sharedWebCredentialsEnabled;

    /**
     * Whether Apple App Clips are enabled for this app.
     */
    private Boolean appClipsEnabled;

    /**
     * The Apple App Clip application ID.
     */
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

    /**
     * Apple application ID.
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    /**
     * Whether Apple Universal Links are supported by this app.
     */
    public Builder universalLinksEnabled(Boolean universalLinksEnabled) {
      this.universalLinksEnabled = universalLinksEnabled;
      return this;
    }

    /**
     * Whether Apple shared web credentials are enabled for this app.
     */
    public Builder sharedWebCredentialsEnabled(Boolean sharedWebCredentialsEnabled) {
      this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
      return this;
    }

    /**
     * Whether Apple App Clips are enabled for this app.
     */
    public Builder appClipsEnabled(Boolean appClipsEnabled) {
      this.appClipsEnabled = appClipsEnabled;
      return this;
    }

    /**
     * The Apple App Clip application ID.
     */
    public Builder appClipApplicationId(String appClipApplicationId) {
      this.appClipApplicationId = appClipApplicationId;
      return this;
    }
  }
}
