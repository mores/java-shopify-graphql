package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MobilePlatformApplicationCreateAndroidInput {
  
  private String applicationId;

  
  private List<String> sha256CertFingerprints;

  
  private boolean appLinksEnabled;

  public MobilePlatformApplicationCreateAndroidInput() {
  }

  
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  
  public List<String> getSha256CertFingerprints() {
    return sha256CertFingerprints;
  }

  public void setSha256CertFingerprints(List<String> sha256CertFingerprints) {
    this.sha256CertFingerprints = sha256CertFingerprints;
  }

  
  public boolean getAppLinksEnabled() {
    return appLinksEnabled;
  }

  public void setAppLinksEnabled(boolean appLinksEnabled) {
    this.appLinksEnabled = appLinksEnabled;
  }

  @Override
  public String toString() {
    return "MobilePlatformApplicationCreateAndroidInput{applicationId='" + applicationId + "', sha256CertFingerprints='" + sha256CertFingerprints + "', appLinksEnabled='" + appLinksEnabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationCreateAndroidInput that = (MobilePlatformApplicationCreateAndroidInput) o;
    return Objects.equals(applicationId, that.applicationId) &&
        Objects.equals(sha256CertFingerprints, that.sha256CertFingerprints) &&
        appLinksEnabled == that.appLinksEnabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, sha256CertFingerprints, appLinksEnabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String applicationId;

    
    private List<String> sha256CertFingerprints;

    
    private boolean appLinksEnabled;

    public MobilePlatformApplicationCreateAndroidInput build() {
      MobilePlatformApplicationCreateAndroidInput result = new MobilePlatformApplicationCreateAndroidInput();
      result.applicationId = this.applicationId;
      result.sha256CertFingerprints = this.sha256CertFingerprints;
      result.appLinksEnabled = this.appLinksEnabled;
      return result;
    }

    
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }

    
    public Builder sha256CertFingerprints(List<String> sha256CertFingerprints) {
      this.sha256CertFingerprints = sha256CertFingerprints;
      return this;
    }

    
    public Builder appLinksEnabled(boolean appLinksEnabled) {
      this.appLinksEnabled = appLinksEnabled;
      return this;
    }
  }
}
