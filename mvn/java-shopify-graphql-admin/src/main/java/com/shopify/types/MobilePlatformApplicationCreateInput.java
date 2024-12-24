package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MobilePlatformApplicationCreateInput {
  
  private MobilePlatformApplicationCreateAndroidInput android;

  
  private MobilePlatformApplicationCreateAppleInput apple;

  public MobilePlatformApplicationCreateInput() {
  }

  
  public MobilePlatformApplicationCreateAndroidInput getAndroid() {
    return android;
  }

  public void setAndroid(MobilePlatformApplicationCreateAndroidInput android) {
    this.android = android;
  }

  
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
    
    private MobilePlatformApplicationCreateAndroidInput android;

    
    private MobilePlatformApplicationCreateAppleInput apple;

    public MobilePlatformApplicationCreateInput build() {
      MobilePlatformApplicationCreateInput result = new MobilePlatformApplicationCreateInput();
      result.android = this.android;
      result.apple = this.apple;
      return result;
    }

    
    public Builder android(MobilePlatformApplicationCreateAndroidInput android) {
      this.android = android;
      return this;
    }

    
    public Builder apple(MobilePlatformApplicationCreateAppleInput apple) {
      this.apple = apple;
      return this;
    }
  }
}
