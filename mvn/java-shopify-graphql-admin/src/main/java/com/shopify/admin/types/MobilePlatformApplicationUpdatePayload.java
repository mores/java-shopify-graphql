package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `mobilePlatformApplicationUpdate` mutation.
 */
public class MobilePlatformApplicationUpdatePayload {
  /**
   * Created mobile platform application.
   */
  private MobilePlatformApplication mobilePlatformApplication;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MobilePlatformApplicationUserError> userErrors;

  public MobilePlatformApplicationUpdatePayload() {
  }

  /**
   * Created mobile platform application.
   */
  public MobilePlatformApplication getMobilePlatformApplication() {
    return mobilePlatformApplication;
  }

  public void setMobilePlatformApplication(MobilePlatformApplication mobilePlatformApplication) {
    this.mobilePlatformApplication = mobilePlatformApplication;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MobilePlatformApplicationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MobilePlatformApplicationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MobilePlatformApplicationUpdatePayload{mobilePlatformApplication='" + mobilePlatformApplication + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationUpdatePayload that = (MobilePlatformApplicationUpdatePayload) o;
    return Objects.equals(mobilePlatformApplication, that.mobilePlatformApplication) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobilePlatformApplication, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Created mobile platform application.
     */
    private MobilePlatformApplication mobilePlatformApplication;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MobilePlatformApplicationUserError> userErrors;

    public MobilePlatformApplicationUpdatePayload build() {
      MobilePlatformApplicationUpdatePayload result = new MobilePlatformApplicationUpdatePayload();
      result.mobilePlatformApplication = this.mobilePlatformApplication;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Created mobile platform application.
     */
    public Builder mobilePlatformApplication(MobilePlatformApplication mobilePlatformApplication) {
      this.mobilePlatformApplication = mobilePlatformApplication;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MobilePlatformApplicationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
