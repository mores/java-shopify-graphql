package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AppUsageRecordCreatePayload {
  
  private AppUsageRecord appUsageRecord;

  
  private List<UserError> userErrors;

  public AppUsageRecordCreatePayload() {
  }

  
  public AppUsageRecord getAppUsageRecord() {
    return appUsageRecord;
  }

  public void setAppUsageRecord(AppUsageRecord appUsageRecord) {
    this.appUsageRecord = appUsageRecord;
  }

  
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
    
    private AppUsageRecord appUsageRecord;

    
    private List<UserError> userErrors;

    public AppUsageRecordCreatePayload build() {
      AppUsageRecordCreatePayload result = new AppUsageRecordCreatePayload();
      result.appUsageRecord = this.appUsageRecord;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder appUsageRecord(AppUsageRecord appUsageRecord) {
      this.appUsageRecord = appUsageRecord;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
