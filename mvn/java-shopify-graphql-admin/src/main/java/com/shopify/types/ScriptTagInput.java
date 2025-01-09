package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a script tag. This input object is used when creating or updating
 * a script tag to specify its URL, where it should be included, and how it will be cached.
 */
public class ScriptTagInput {
  /**
   * The URL of the remote script. For example: `https://example.com/path/to/script.js`.
   */
  private String src;

  /**
   * The page or pages on the online store where the script should be included.
   */
  private ScriptTagDisplayScope displayScope;

  /**
   * Whether the Shopify CDN can cache and serve the script tag.
   * If `true`, then the script will be cached and served by the CDN.
   * The cache expires 15 minutes after the script tag is successfully returned.
   * If `false`, then the script is served as is.
   * The default value is `false`.
   */
  private Boolean cache = false;

  public ScriptTagInput() {
  }

  /**
   * The URL of the remote script. For example: `https://example.com/path/to/script.js`.
   */
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  /**
   * The page or pages on the online store where the script should be included.
   */
  public ScriptTagDisplayScope getDisplayScope() {
    return displayScope;
  }

  public void setDisplayScope(ScriptTagDisplayScope displayScope) {
    this.displayScope = displayScope;
  }

  /**
   * Whether the Shopify CDN can cache and serve the script tag.
   * If `true`, then the script will be cached and served by the CDN.
   * The cache expires 15 minutes after the script tag is successfully returned.
   * If `false`, then the script is served as is.
   * The default value is `false`.
   */
  public Boolean getCache() {
    return cache;
  }

  public void setCache(Boolean cache) {
    this.cache = cache;
  }

  @Override
  public String toString() {
    return "ScriptTagInput{src='" + src + "', displayScope='" + displayScope + "', cache='" + cache + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTagInput that = (ScriptTagInput) o;
    return Objects.equals(src, that.src) &&
        Objects.equals(displayScope, that.displayScope) &&
        Objects.equals(cache, that.cache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, displayScope, cache);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL of the remote script. For example: `https://example.com/path/to/script.js`.
     */
    private String src;

    /**
     * The page or pages on the online store where the script should be included.
     */
    private ScriptTagDisplayScope displayScope;

    /**
     * Whether the Shopify CDN can cache and serve the script tag.
     * If `true`, then the script will be cached and served by the CDN.
     * The cache expires 15 minutes after the script tag is successfully returned.
     * If `false`, then the script is served as is.
     * The default value is `false`.
     */
    private Boolean cache = false;

    public ScriptTagInput build() {
      ScriptTagInput result = new ScriptTagInput();
      result.src = this.src;
      result.displayScope = this.displayScope;
      result.cache = this.cache;
      return result;
    }

    /**
     * The URL of the remote script. For example: `https://example.com/path/to/script.js`.
     */
    public Builder src(String src) {
      this.src = src;
      return this;
    }

    /**
     * The page or pages on the online store where the script should be included.
     */
    public Builder displayScope(ScriptTagDisplayScope displayScope) {
      this.displayScope = displayScope;
      return this;
    }

    /**
     * Whether the Shopify CDN can cache and serve the script tag.
     * If `true`, then the script will be cached and served by the CDN.
     * The cache expires 15 minutes after the script tag is successfully returned.
     * If `false`, then the script is served as is.
     * The default value is `false`.
     */
    public Builder cache(Boolean cache) {
      this.cache = cache;
      return this;
    }
  }
}
