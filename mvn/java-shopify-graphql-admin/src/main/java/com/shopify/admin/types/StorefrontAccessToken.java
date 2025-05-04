package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A token that's used to delegate unauthenticated access scopes to clients that need to access
 * the unauthenticated [Storefront API](https://shopify.dev/docs/api/storefront).
 *
 * An app can have a maximum of 100 active storefront access
 * tokens for each shop.
 *
 * [Get started with the Storefront API](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/getting-started).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StorefrontAccessToken implements com.shopify.admin.types.Node {
  /**
   * List of permissions associated with the token.
   */
  private List<AccessScope> accessScopes;

  /**
   * The issued public access token.
   */
  private String accessToken;

  /**
   * The date and time when the public access token was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * An arbitrary title for each token determined by the developer, used for reference         purposes.
   */
  private String title;

  /**
   * The date and time when the storefront access token was updated.
   */
  private OffsetDateTime updatedAt;

  public StorefrontAccessToken() {
  }

  /**
   * List of permissions associated with the token.
   */
  public List<AccessScope> getAccessScopes() {
    return accessScopes;
  }

  public void setAccessScopes(List<AccessScope> accessScopes) {
    this.accessScopes = accessScopes;
  }

  /**
   * The issued public access token.
   */
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * The date and time when the public access token was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
   * An arbitrary title for each token determined by the developer, used for reference         purposes.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The date and time when the storefront access token was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "StorefrontAccessToken{accessScopes='" + accessScopes + "', accessToken='" + accessToken + "', createdAt='" + createdAt + "', id='" + id + "', title='" + title + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorefrontAccessToken that = (StorefrontAccessToken) o;
    return Objects.equals(accessScopes, that.accessScopes) &&
        Objects.equals(accessToken, that.accessToken) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessScopes, accessToken, createdAt, id, title, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of permissions associated with the token.
     */
    private List<AccessScope> accessScopes;

    /**
     * The issued public access token.
     */
    private String accessToken;

    /**
     * The date and time when the public access token was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * An arbitrary title for each token determined by the developer, used for reference         purposes.
     */
    private String title;

    /**
     * The date and time when the storefront access token was updated.
     */
    private OffsetDateTime updatedAt;

    public StorefrontAccessToken build() {
      StorefrontAccessToken result = new StorefrontAccessToken();
      result.accessScopes = this.accessScopes;
      result.accessToken = this.accessToken;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * List of permissions associated with the token.
     */
    public Builder accessScopes(List<AccessScope> accessScopes) {
      this.accessScopes = accessScopes;
      return this;
    }

    /**
     * The issued public access token.
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * The date and time when the public access token was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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
     * An arbitrary title for each token determined by the developer, used for reference         purposes.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The date and time when the storefront access token was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
