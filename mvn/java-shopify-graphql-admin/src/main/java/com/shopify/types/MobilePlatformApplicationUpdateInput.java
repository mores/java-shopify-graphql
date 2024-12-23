package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the mobile platform application platform type.
 */
public class MobilePlatformApplicationUpdateInput {
  /**
   * Android based Mobile Platform Application.
   */
  private MobilePlatformApplicationUpdateAndroidInput android;

  /**
   * Apple based Mobile Platform Application.
   */
  private MobilePlatformApplicationUpdateAppleInput apple;

  public MobilePlatformApplicationUpdateInput() {
  }

  /**
   * Android based Mobile Platform Application.
   */
  public MobilePlatformApplicationUpdateAndroidInput getAndroid() {
    return android;
  }

  public void setAndroid(MobilePlatformApplicationUpdateAndroidInput android) {
    this.android = android;
  }

  /**
   * Apple based Mobile Platform Application.
   */
  public MobilePlatformApplicationUpdateAppleInput getApple() {
    return apple;
  }

  public void setApple(MobilePlatformApplicationUpdateAppleInput apple) {
    this.apple = apple;
  }

  @Override
  public String toString() {
    return "MobilePlatformApplicationUpdateInput{android='" + android + "', apple='" + apple + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationUpdateInput that = (MobilePlatformApplicationUpdateInput) o;
    return Objects.equals(android, that.android) &&
        Objects.equals(apple, that.apple);
  }

  @Override
  public int hashCode() {
    return Objects.hash(android, apple);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Android based Mobile Platform Application.
     */
    private MobilePlatformApplicationUpdateAndroidInput android;

    /**
     * Apple based Mobile Platform Application.
     */
    private MobilePlatformApplicationUpdateAppleInput apple;

    public MobilePlatformApplicationUpdateInput build() {
      MobilePlatformApplicationUpdateInput result = new MobilePlatformApplicationUpdateInput();
      result.android = this.android;
      result.apple = this.apple;
      return result;
    }

    /**
     * Android based Mobile Platform Application.
     */
    public Builder android(MobilePlatformApplicationUpdateAndroidInput android) {
      this.android = android;
      return this;
    }

    /**
     * Apple based Mobile Platform Application.
     */
    public Builder apple(MobilePlatformApplicationUpdateAppleInput apple) {
      this.apple = apple;
      return this;
    }
  }
}
