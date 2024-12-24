package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MobilePlatformApplicationDeletePayload {
  
  private String deletedMobilePlatformApplicationId;

  
  private List<MobilePlatformApplicationUserError> userErrors;

  public MobilePlatformApplicationDeletePayload() {
  }

  
  public String getDeletedMobilePlatformApplicationId() {
    return deletedMobilePlatformApplicationId;
  }

  public void setDeletedMobilePlatformApplicationId(String deletedMobilePlatformApplicationId) {
    this.deletedMobilePlatformApplicationId = deletedMobilePlatformApplicationId;
  }

  
  public List<MobilePlatformApplicationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MobilePlatformApplicationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MobilePlatformApplicationDeletePayload{deletedMobilePlatformApplicationId='" + deletedMobilePlatformApplicationId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationDeletePayload that = (MobilePlatformApplicationDeletePayload) o;
    return Objects.equals(deletedMobilePlatformApplicationId, that.deletedMobilePlatformApplicationId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMobilePlatformApplicationId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedMobilePlatformApplicationId;

    
    private List<MobilePlatformApplicationUserError> userErrors;

    public MobilePlatformApplicationDeletePayload build() {
      MobilePlatformApplicationDeletePayload result = new MobilePlatformApplicationDeletePayload();
      result.deletedMobilePlatformApplicationId = this.deletedMobilePlatformApplicationId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedMobilePlatformApplicationId(String deletedMobilePlatformApplicationId) {
      this.deletedMobilePlatformApplicationId = deletedMobilePlatformApplicationId;
      return this;
    }

    
    public Builder userErrors(List<MobilePlatformApplicationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
