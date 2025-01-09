package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An action associated to a shop alert, such as adding a credit card.
 */
public class ShopAlertAction {
  /**
   * The text for the button in the alert. For example, _Add credit card_.
   */
  private String title;

  /**
   * The target URL that the button links to.
   */
  private String url;

  public ShopAlertAction() {
  }

  /**
   * The text for the button in the alert. For example, _Add credit card_.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The target URL that the button links to.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ShopAlertAction{title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopAlertAction that = (ShopAlertAction) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The text for the button in the alert. For example, _Add credit card_.
     */
    private String title;

    /**
     * The target URL that the button links to.
     */
    private String url;

    public ShopAlertAction build() {
      ShopAlertAction result = new ShopAlertAction();
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    /**
     * The text for the button in the alert. For example, _Add credit card_.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The target URL that the button links to.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
