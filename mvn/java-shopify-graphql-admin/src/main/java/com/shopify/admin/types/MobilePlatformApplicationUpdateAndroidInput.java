package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for an Android based mobile platform application.
 */
public class MobilePlatformApplicationUpdateAndroidInput {
  /**
   * Android application ID.
   */
  private String applicationId;

  /**
   * The SHA256 fingerprints of the app’s signing certificate.
   */
  private List<String> sha256CertFingerprints;

  /**
   * Whether Android App Links are supported by this app.
   */
  private Boolean appLinksEnabled;

  public MobilePlatformApplicationUpdateAndroidInput() {
  }

  /**
   * Android application ID.
   */
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  /**
   * The SHA256 fingerprints of the app’s signing certificate.
   */
  public List<String> getSha256CertFingerprints() {
    return sha256CertFingerprints;
  }

  public void setSha256CertFingerprints(List<String> sha256CertFingerprints) {
    this.sha256CertFingerprints = sha256CertFingerprints;
  }

  /**
   * Whether Android App Links are supported by this app.
   */
  public Boolean getAppLinksEnabled() {
    return appLinksEnabled;
  }

  public void setAppLinksEnabled(Boolean appLinksEnabled) {
    this.appLinksEnabled = appLinksEnabled;
  }

  @Override
  public String toString() {
    return "MobilePlatformApplicationUpdateAndroidInput{applicationId='" + applicationId + "', sha256CertFingerprints='" + sha256CertFingerprints + "', appLinksEnabled='" + appLinksEnabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationUpdateAndroidInput that = (MobilePlatformApplicationUpdateAndroidInput) o;
    return Objects.equals(applicationId, that.applicationId) &&
        Objects.equals(sha256CertFingerprints, that.sha256CertFingerprints) &&
        Objects.equals(appLinksEnabled, that.appLinksEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, sha256CertFingerprints, appLinksEnabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Android application ID.
     */
    private String applicationId;

    /**
     * The SHA256 fingerprints of the app’s signing certificate.
     */
    private List<String> sha256CertFingerprints;

    /**
     * Whether Android App Links are supported by this app.
     */
    private Boolean appLinksEnabled;

    public MobilePlatformApplicationUpdateAndroidInput build() {
      MobilePlatformApplicationUpdateAndroidInput result = new MobilePlatformApplicationUpdateAndroidInput();
      result.applicationId = this.applicationId;
      result.sha256CertFingerprints = this.sha256CertFingerprints;
      result.appLinksEnabled = this.appLinksEnabled;
      return result;
    }

    /**
     * Android application ID.
     */
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }

    /**
     * The SHA256 fingerprints of the app’s signing certificate.
     */
    public Builder sha256CertFingerprints(List<String> sha256CertFingerprints) {
      this.sha256CertFingerprints = sha256CertFingerprints;
      return this;
    }

    /**
     * Whether Android App Links are supported by this app.
     */
    public Builder appLinksEnabled(Boolean appLinksEnabled) {
      this.appLinksEnabled = appLinksEnabled;
      return this;
    }
  }
}
