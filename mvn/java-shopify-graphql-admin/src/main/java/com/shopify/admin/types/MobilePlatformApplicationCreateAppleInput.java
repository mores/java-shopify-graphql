package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an Apple based mobile platform application.
 */
public class MobilePlatformApplicationCreateAppleInput {
  /**
   * Apple application ID.
   */
  private String appId;

  /**
   * Whether Apple Universal Links are supported by this app.
   */
  private boolean universalLinksEnabled;

  /**
   * Whether Apple shared web credentials are enabled for this app.
   */
  private boolean sharedWebCredentialsEnabled;

  /**
   * Whether Apple app clips are enabled for this app.
   */
  private Boolean appClipsEnabled;

  /**
   * The Apple app clip application ID.
   */
  private String appClipApplicationId;

  public MobilePlatformApplicationCreateAppleInput() {
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
  public boolean getUniversalLinksEnabled() {
    return universalLinksEnabled;
  }

  public void setUniversalLinksEnabled(boolean universalLinksEnabled) {
    this.universalLinksEnabled = universalLinksEnabled;
  }

  /**
   * Whether Apple shared web credentials are enabled for this app.
   */
  public boolean getSharedWebCredentialsEnabled() {
    return sharedWebCredentialsEnabled;
  }

  public void setSharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
    this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
  }

  /**
   * Whether Apple app clips are enabled for this app.
   */
  public Boolean getAppClipsEnabled() {
    return appClipsEnabled;
  }

  public void setAppClipsEnabled(Boolean appClipsEnabled) {
    this.appClipsEnabled = appClipsEnabled;
  }

  /**
   * The Apple app clip application ID.
   */
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
    /**
     * Apple application ID.
     */
    private String appId;

    /**
     * Whether Apple Universal Links are supported by this app.
     */
    private boolean universalLinksEnabled;

    /**
     * Whether Apple shared web credentials are enabled for this app.
     */
    private boolean sharedWebCredentialsEnabled;

    /**
     * Whether Apple app clips are enabled for this app.
     */
    private Boolean appClipsEnabled;

    /**
     * The Apple app clip application ID.
     */
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
    public Builder universalLinksEnabled(boolean universalLinksEnabled) {
      this.universalLinksEnabled = universalLinksEnabled;
      return this;
    }

    /**
     * Whether Apple shared web credentials are enabled for this app.
     */
    public Builder sharedWebCredentialsEnabled(boolean sharedWebCredentialsEnabled) {
      this.sharedWebCredentialsEnabled = sharedWebCredentialsEnabled;
      return this;
    }

    /**
     * Whether Apple app clips are enabled for this app.
     */
    public Builder appClipsEnabled(Boolean appClipsEnabled) {
      this.appClipsEnabled = appClipsEnabled;
      return this;
    }

    /**
     * The Apple app clip application ID.
     */
    public Builder appClipApplicationId(String appClipApplicationId) {
      this.appClipApplicationId = appClipApplicationId;
      return this;
    }
  }
}
