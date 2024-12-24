package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AndroidApplication implements MobilePlatformApplication {
  
  private boolean appLinksEnabled;

  
  private String applicationId;

  
  private String id;

  
  private List<String> sha256CertFingerprints;

  public AndroidApplication() {
  }

  
  public boolean getAppLinksEnabled() {
    return appLinksEnabled;
  }

  public void setAppLinksEnabled(boolean appLinksEnabled) {
    this.appLinksEnabled = appLinksEnabled;
  }

  
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<String> getSha256CertFingerprints() {
    return sha256CertFingerprints;
  }

  public void setSha256CertFingerprints(List<String> sha256CertFingerprints) {
    this.sha256CertFingerprints = sha256CertFingerprints;
  }

  @Override
  public String toString() {
    return "AndroidApplication{appLinksEnabled='" + appLinksEnabled + "', applicationId='" + applicationId + "', id='" + id + "', sha256CertFingerprints='" + sha256CertFingerprints + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AndroidApplication that = (AndroidApplication) o;
    return appLinksEnabled == that.appLinksEnabled &&
        Objects.equals(applicationId, that.applicationId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(sha256CertFingerprints, that.sha256CertFingerprints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLinksEnabled, applicationId, id, sha256CertFingerprints);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean appLinksEnabled;

    
    private String applicationId;

    
    private String id;

    
    private List<String> sha256CertFingerprints;

    public AndroidApplication build() {
      AndroidApplication result = new AndroidApplication();
      result.appLinksEnabled = this.appLinksEnabled;
      result.applicationId = this.applicationId;
      result.id = this.id;
      result.sha256CertFingerprints = this.sha256CertFingerprints;
      return result;
    }

    
    public Builder appLinksEnabled(boolean appLinksEnabled) {
      this.appLinksEnabled = appLinksEnabled;
      return this;
    }

    
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder sha256CertFingerprints(List<String> sha256CertFingerprints) {
      this.sha256CertFingerprints = sha256CertFingerprints;
      return this;
    }
  }
}
