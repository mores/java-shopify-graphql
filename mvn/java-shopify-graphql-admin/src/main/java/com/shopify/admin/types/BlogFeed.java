package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * RSS feed provider details for blog syndication. This object contains the
 * location and path information for external feed services that were previously
 * integrated with the blog.
 *
 * The `BlogFeed` object maintains the feed URL and path to ensure existing feed subscriptions continue working.
 *
 * Use the `BlogFeed` object to:
 * - Access RSS feed provider configuration
 * - Retrieve feed location and path information
 * - Maintain existing feed syndication settings
 *
 * > Note:
 * > This is a legacy feature. New integrations with external feed services are not supported.
 */
public class BlogFeed {
  /**
   * Blog feed provider url.
   */
  private String location;

  /**
   * Blog feed provider path.
   */
  private String path;

  public BlogFeed() {
  }

  /**
   * Blog feed provider url.
   */
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Blog feed provider path.
   */
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public String toString() {
    return "BlogFeed{location='" + location + "', path='" + path + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogFeed that = (BlogFeed) o;
    return Objects.equals(location, that.location) &&
        Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, path);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Blog feed provider url.
     */
    private String location;

    /**
     * Blog feed provider path.
     */
    private String path;

    public BlogFeed build() {
      BlogFeed result = new BlogFeed();
      result.location = this.location;
      result.path = this.path;
      return result;
    }

    /**
     * Blog feed provider url.
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Blog feed provider path.
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }
  }
}
