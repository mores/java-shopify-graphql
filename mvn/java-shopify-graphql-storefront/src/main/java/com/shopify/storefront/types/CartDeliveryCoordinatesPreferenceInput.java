package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Preferred location used to find the closest pick up point based on coordinates.
 */
public class CartDeliveryCoordinatesPreferenceInput {
  /**
   * The geographic latitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
   */
  private double latitude;

  /**
   * The geographic longitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
   */
  private double longitude;

  /**
   * The two-letter code for the country of the preferred location.
   *   
   * For example, US.
   */
  private CountryCode countryCode;

  public CartDeliveryCoordinatesPreferenceInput() {
  }

  /**
   * The geographic latitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
   */
  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  /**
   * The geographic longitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
   */
  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  /**
   * The two-letter code for the country of the preferred location.
   *   
   * For example, US.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "CartDeliveryCoordinatesPreferenceInput{latitude='" + latitude + "', longitude='" + longitude + "', countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDeliveryCoordinatesPreferenceInput that = (CartDeliveryCoordinatesPreferenceInput) o;
    return latitude == that.latitude &&
        longitude == that.longitude &&
        Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, countryCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The geographic latitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
     */
    private double latitude;

    /**
     * The geographic longitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
     */
    private double longitude;

    /**
     * The two-letter code for the country of the preferred location.
     *   
     * For example, US.
     */
    private CountryCode countryCode;

    public CartDeliveryCoordinatesPreferenceInput build() {
      CartDeliveryCoordinatesPreferenceInput result = new CartDeliveryCoordinatesPreferenceInput();
      result.latitude = this.latitude;
      result.longitude = this.longitude;
      result.countryCode = this.countryCode;
      return result;
    }

    /**
     * The geographic latitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
     */
    public Builder latitude(double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * The geographic longitude for a given location. Coordinates are required in order to set pickUpHandle for pickup points.
     */
    public Builder longitude(double longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * The two-letter code for the country of the preferred location.
     *   
     * For example, US.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}
