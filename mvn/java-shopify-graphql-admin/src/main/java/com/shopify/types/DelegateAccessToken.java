package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A token that delegates a set of scopes from the original permission.
 *
 * To learn more about creating delegate access tokens, refer to
 * [Delegate OAuth access tokens to subsystems](https://shopify.dev/docs/apps/build/authentication-authorization/access-tokens/use-delegate-tokens).
 */
public class DelegateAccessToken {
  
  private List<String> accessScopes;

  
  private String accessToken;

  
  private OffsetDateTime createdAt;

  public DelegateAccessToken() {
  }

  
  public List<String> getAccessScopes() {
    return accessScopes;
  }

  public void setAccessScopes(List<String> accessScopes) {
    this.accessScopes = accessScopes;
  }

  
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "DelegateAccessToken{accessScopes='" + accessScopes + "', accessToken='" + accessToken + "', createdAt='" + createdAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DelegateAccessToken that = (DelegateAccessToken) o;
    return Objects.equals(accessScopes, that.accessScopes) &&
        Objects.equals(accessToken, that.accessToken) &&
        Objects.equals(createdAt, that.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessScopes, accessToken, createdAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> accessScopes;

    
    private String accessToken;

    
    private OffsetDateTime createdAt;

    public DelegateAccessToken build() {
      DelegateAccessToken result = new DelegateAccessToken();
      result.accessScopes = this.accessScopes;
      result.accessToken = this.accessToken;
      result.createdAt = this.createdAt;
      return result;
    }

    
    public Builder accessScopes(List<String> accessScopes) {
      this.accessScopes = accessScopes;
      return this;
    }

    
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }
  }
}
