package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `backupRegionUpdate` mutation.
 */
public class BackupRegionUpdatePayload {
  /**
   * Returns the updated backup region.
   */
  private MarketRegion backupRegion;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketUserError> userErrors;

  public BackupRegionUpdatePayload() {
  }

  /**
   * Returns the updated backup region.
   */
  public MarketRegion getBackupRegion() {
    return backupRegion;
  }

  public void setBackupRegion(MarketRegion backupRegion) {
    this.backupRegion = backupRegion;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MarketUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "BackupRegionUpdatePayload{backupRegion='" + backupRegion + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BackupRegionUpdatePayload that = (BackupRegionUpdatePayload) o;
    return Objects.equals(backupRegion, that.backupRegion) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupRegion, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns the updated backup region.
     */
    private MarketRegion backupRegion;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketUserError> userErrors;

    public BackupRegionUpdatePayload build() {
      BackupRegionUpdatePayload result = new BackupRegionUpdatePayload();
      result.backupRegion = this.backupRegion;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Returns the updated backup region.
     */
    public Builder backupRegion(MarketRegion backupRegion) {
      this.backupRegion = backupRegion;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MarketUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
