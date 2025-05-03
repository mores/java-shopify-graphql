package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to specify a geographical location.
 */
public class GeoCoordinateInput {
  /**
   * The coordinate's latitude value.
   */
  private double latitude;

  /**
   * The coordinate's longitude value.
   */
  private double longitude;

  public GeoCoordinateInput() {
  }

  /**
   * The coordinate's latitude value.
   */
  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  /**
   * The coordinate's longitude value.
   */
  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  @Override
  public String toString() {
    return "GeoCoordinateInput{latitude='" + latitude + "', longitude='" + longitude + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GeoCoordinateInput that = (GeoCoordinateInput) o;
    return latitude == that.latitude &&
        longitude == that.longitude;
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The coordinate's latitude value.
     */
    private double latitude;

    /**
     * The coordinate's longitude value.
     */
    private double longitude;

    public GeoCoordinateInput build() {
      GeoCoordinateInput result = new GeoCoordinateInput();
      result.latitude = this.latitude;
      result.longitude = this.longitude;
      return result;
    }

    /**
     * The coordinate's latitude value.
     */
    public Builder latitude(double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * The coordinate's longitude value.
     */
    public Builder longitude(double longitude) {
      this.longitude = longitude;
      return this;
    }
  }
}
