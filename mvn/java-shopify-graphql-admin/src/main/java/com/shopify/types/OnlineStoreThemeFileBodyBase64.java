package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreThemeFileBodyBase64 implements OnlineStoreThemeFileBody {
  
  private String contentBase64;

  public OnlineStoreThemeFileBodyBase64() {
  }

  
  public String getContentBase64() {
    return contentBase64;
  }

  public void setContentBase64(String contentBase64) {
    this.contentBase64 = contentBase64;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileBodyBase64{contentBase64='" + contentBase64 + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileBodyBase64 that = (OnlineStoreThemeFileBodyBase64) o;
    return Objects.equals(contentBase64, that.contentBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentBase64);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String contentBase64;

    public OnlineStoreThemeFileBodyBase64 build() {
      OnlineStoreThemeFileBodyBase64 result = new OnlineStoreThemeFileBodyBase64();
      result.contentBase64 = this.contentBase64;
      return result;
    }

    
    public Builder contentBase64(String contentBase64) {
      this.contentBase64 = contentBase64;
      return this;
    }
  }
}
