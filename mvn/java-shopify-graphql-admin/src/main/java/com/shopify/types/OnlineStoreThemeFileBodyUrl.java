package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreThemeFileBodyUrl implements OnlineStoreThemeFileBody {
  
  private String url;

  public OnlineStoreThemeFileBodyUrl() {
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileBodyUrl{url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileBodyUrl that = (OnlineStoreThemeFileBodyUrl) o;
    return Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String url;

    public OnlineStoreThemeFileBodyUrl build() {
      OnlineStoreThemeFileBodyUrl result = new OnlineStoreThemeFileBodyUrl();
      result.url = this.url;
      return result;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
