package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appUsageRecordCreate` mutation.
 */
public class AppUsageRecordCreatePayload {
  /**
   * The newly created app usage record.
   */
  private AppUsageRecord appUsageRecord;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public AppUsageRecordCreatePayload() {
  }

  /**
   * The newly created app usage record.
   */
  public AppUsageRecord getAppUsageRecord() {
    return appUsageRecord;
  }

  public void setAppUsageRecord(AppUsageRecord appUsageRecord) {
    this.appUsageRecord = appUsageRecord;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AppUsageRecordCreatePayload{appUsageRecord='" + appUsageRecord + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsageRecordCreatePayload that = (AppUsageRecordCreatePayload) o;
    return Objects.equals(appUsageRecord, that.appUsageRecord) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUsageRecord, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created app usage record.
     */
    private AppUsageRecord appUsageRecord;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public AppUsageRecordCreatePayload build() {
      AppUsageRecordCreatePayload result = new AppUsageRecordCreatePayload();
      result.appUsageRecord = this.appUsageRecord;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created app usage record.
     */
    public Builder appUsageRecord(AppUsageRecord appUsageRecord) {
      this.appUsageRecord = appUsageRecord;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
