package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * <div class="note">&lt;h4>Theme app extensions&lt;/h4>
 *   <p>If your app integrates with a Shopify theme and you plan to submit it to the
 * Shopify App Store, you must use theme app extensions instead of Script tags.
 * Script tags can only be used with vintage themes. <a
 * href="/apps/online-store#what-integration-method-should-i-use"
 * target="_blank">Learn more</a>.</p></div>
 *
 * <div class="note">&lt;h4>Script tag deprecation&lt;/h4>
 *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
 * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
 * to Checkout Extensibility</a> before this date. <a
 * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to work
 * alongside Checkout Extensibility until August 28, 2025.</p></div>
 *
 *
 * A script tag represents remote JavaScript code that is loaded into the pages of
 * a shop's storefront or the **Order status** page of checkout.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ScriptTag implements com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Node {
  /**
   * Whether the Shopify CDN can cache and serve the script tag.
   * If `true`, then the script will be cached and served by the CDN.
   * The cache expires 15 minutes after the script tag is successfully returned.
   * If `false`, then the script will be served as is.
   */
  private boolean cache;

  /**
   * The date and time when the script tag was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The page or pages on the online store that the script should be included.
   */
  private ScriptTagDisplayScope displayScope;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The URL to the remote script.
   */
  private String src;

  /**
   * The date and time when the script tag was last updated.
   */
  private OffsetDateTime updatedAt;

  public ScriptTag() {
  }

  /**
   * Whether the Shopify CDN can cache and serve the script tag.
   * If `true`, then the script will be cached and served by the CDN.
   * The cache expires 15 minutes after the script tag is successfully returned.
   * If `false`, then the script will be served as is.
   */
  public boolean getCache() {
    return cache;
  }

  public void setCache(boolean cache) {
    this.cache = cache;
  }

  /**
   * The date and time when the script tag was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The page or pages on the online store that the script should be included.
   */
  public ScriptTagDisplayScope getDisplayScope() {
    return displayScope;
  }

  public void setDisplayScope(ScriptTagDisplayScope displayScope) {
    this.displayScope = displayScope;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The URL to the remote script.
   */
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  /**
   * The date and time when the script tag was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "ScriptTag{cache='" + cache + "', createdAt='" + createdAt + "', displayScope='" + displayScope + "', id='" + id + "', legacyResourceId='" + legacyResourceId + "', src='" + src + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTag that = (ScriptTag) o;
    return cache == that.cache &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(displayScope, that.displayScope) &&
        Objects.equals(id, that.id) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(src, that.src) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cache, createdAt, displayScope, id, legacyResourceId, src, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the Shopify CDN can cache and serve the script tag.
     * If `true`, then the script will be cached and served by the CDN.
     * The cache expires 15 minutes after the script tag is successfully returned.
     * If `false`, then the script will be served as is.
     */
    private boolean cache;

    /**
     * The date and time when the script tag was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The page or pages on the online store that the script should be included.
     */
    private ScriptTagDisplayScope displayScope;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The URL to the remote script.
     */
    private String src;

    /**
     * The date and time when the script tag was last updated.
     */
    private OffsetDateTime updatedAt;

    public ScriptTag build() {
      ScriptTag result = new ScriptTag();
      result.cache = this.cache;
      result.createdAt = this.createdAt;
      result.displayScope = this.displayScope;
      result.id = this.id;
      result.legacyResourceId = this.legacyResourceId;
      result.src = this.src;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Whether the Shopify CDN can cache and serve the script tag.
     * If `true`, then the script will be cached and served by the CDN.
     * The cache expires 15 minutes after the script tag is successfully returned.
     * If `false`, then the script will be served as is.
     */
    public Builder cache(boolean cache) {
      this.cache = cache;
      return this;
    }

    /**
     * The date and time when the script tag was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The page or pages on the online store that the script should be included.
     */
    public Builder displayScope(ScriptTagDisplayScope displayScope) {
      this.displayScope = displayScope;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The URL to the remote script.
     */
    public Builder src(String src) {
      this.src = src;
      return this;
    }

    /**
     * The date and time when the script tag was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
