package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreThemeFileBodyText implements OnlineStoreThemeFileBody {
  
  private String content;

  public OnlineStoreThemeFileBodyText() {
  }

  
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileBodyText{content='" + content + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileBodyText that = (OnlineStoreThemeFileBodyText) o;
    return Objects.equals(content, that.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String content;

    public OnlineStoreThemeFileBodyText build() {
      OnlineStoreThemeFileBodyText result = new OnlineStoreThemeFileBodyText();
      result.content = this.content;
      return result;
    }

    
    public Builder content(String content) {
      this.content = content;
      return this;
    }
  }
}
