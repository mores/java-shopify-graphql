package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MobilePlatformApplicationUpdateInput {
  
  private MobilePlatformApplicationUpdateAndroidInput android;

  
  private MobilePlatformApplicationUpdateAppleInput apple;

  public MobilePlatformApplicationUpdateInput() {
  }

  
  public MobilePlatformApplicationUpdateAndroidInput getAndroid() {
    return android;
  }

  public void setAndroid(MobilePlatformApplicationUpdateAndroidInput android) {
    this.android = android;
  }

  
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
    
    private MobilePlatformApplicationUpdateAndroidInput android;

    
    private MobilePlatformApplicationUpdateAppleInput apple;

    public MobilePlatformApplicationUpdateInput build() {
      MobilePlatformApplicationUpdateInput result = new MobilePlatformApplicationUpdateInput();
      result.android = this.android;
      result.apple = this.apple;
      return result;
    }

    
    public Builder android(MobilePlatformApplicationUpdateAndroidInput android) {
      this.android = android;
      return this;
    }

    
    public Builder apple(MobilePlatformApplicationUpdateAppleInput apple) {
      this.apple = apple;
      return this;
    }
  }
}
