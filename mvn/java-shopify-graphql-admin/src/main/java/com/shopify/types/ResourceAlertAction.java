package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An action associated to a resource alert, such as editing variants.
 */
public class ResourceAlertAction {
  /**
   * Whether the action appears as a button or as a link.
   */
  private boolean primary;

  /**
   * Resource for the action to show.
   */
  private String show;

  /**
   * The text for the button in the alert. For example, _Edit variants_.
   */
  private String title;

  /**
   * The target URL that the button links to.
   */
  private String url;

  public ResourceAlertAction() {
  }

  /**
   * Whether the action appears as a button or as a link.
   */
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  /**
   * Resource for the action to show.
   */
  public String getShow() {
    return show;
  }

  public void setShow(String show) {
    this.show = show;
  }

  /**
   * The text for the button in the alert. For example, _Edit variants_.
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
    return "ResourceAlertAction{primary='" + primary + "', show='" + show + "', title='" + title + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceAlertAction that = (ResourceAlertAction) o;
    return primary == that.primary &&
        Objects.equals(show, that.show) &&
        Objects.equals(title, that.title) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, show, title, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the action appears as a button or as a link.
     */
    private boolean primary;

    /**
     * Resource for the action to show.
     */
    private String show;

    /**
     * The text for the button in the alert. For example, _Edit variants_.
     */
    private String title;

    /**
     * The target URL that the button links to.
     */
    private String url;

    public ResourceAlertAction build() {
      ResourceAlertAction result = new ResourceAlertAction();
      result.primary = this.primary;
      result.show = this.show;
      result.title = this.title;
      result.url = this.url;
      return result;
    }

    /**
     * Whether the action appears as a button or as a link.
     */
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    /**
     * Resource for the action to show.
     */
    public Builder show(String show) {
      this.show = show;
      return this;
    }

    /**
     * The text for the button in the alert. For example, _Edit variants_.
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
