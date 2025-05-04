package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a mobile application platform type.
 */
public class MobilePlatformApplicationCreateInput {
  /**
   * Android based mobile platform application.
   */
  private MobilePlatformApplicationCreateAndroidInput android;

  /**
   * Apple based mobile platform application.
   */
  private MobilePlatformApplicationCreateAppleInput apple;

  public MobilePlatformApplicationCreateInput() {
  }

  /**
   * Android based mobile platform application.
   */
  public MobilePlatformApplicationCreateAndroidInput getAndroid() {
    return android;
  }

  public void setAndroid(MobilePlatformApplicationCreateAndroidInput android) {
    this.android = android;
  }

  /**
   * Apple based mobile platform application.
   */
  public MobilePlatformApplicationCreateAppleInput getApple() {
    return apple;
  }

  public void setApple(MobilePlatformApplicationCreateAppleInput apple) {
    this.apple = apple;
  }

  @Override
  public String toString() {
    return "MobilePlatformApplicationCreateInput{android='" + android + "', apple='" + apple + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MobilePlatformApplicationCreateInput that = (MobilePlatformApplicationCreateInput) o;
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
     * Android based mobile platform application.
     */
    private MobilePlatformApplicationCreateAndroidInput android;

    /**
     * Apple based mobile platform application.
     */
    private MobilePlatformApplicationCreateAppleInput apple;

    public MobilePlatformApplicationCreateInput build() {
      MobilePlatformApplicationCreateInput result = new MobilePlatformApplicationCreateInput();
      result.android = this.android;
      result.apple = this.apple;
      return result;
    }

    /**
     * Android based mobile platform application.
     */
    public Builder android(MobilePlatformApplicationCreateAndroidInput android) {
      this.android = android;
      return this;
    }

    /**
     * Apple based mobile platform application.
     */
    public Builder apple(MobilePlatformApplicationCreateAppleInput apple) {
      this.apple = apple;
      return this;
    }
  }
}
