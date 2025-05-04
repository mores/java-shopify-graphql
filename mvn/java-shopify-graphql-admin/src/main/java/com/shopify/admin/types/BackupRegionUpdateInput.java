package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a backup region with exactly one required option.
 */
public class BackupRegionUpdateInput {
  /**
   * A country code for the backup region.
   */
  private CountryCode countryCode;

  public BackupRegionUpdateInput() {
  }

  /**
   * A country code for the backup region.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "BackupRegionUpdateInput{countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BackupRegionUpdateInput that = (BackupRegionUpdateInput) o;
    return Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A country code for the backup region.
     */
    private CountryCode countryCode;

    public BackupRegionUpdateInput build() {
      BackupRegionUpdateInput result = new BackupRegionUpdateInput();
      result.countryCode = this.countryCode;
      return result;
    }

    /**
     * A country code for the backup region.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}
