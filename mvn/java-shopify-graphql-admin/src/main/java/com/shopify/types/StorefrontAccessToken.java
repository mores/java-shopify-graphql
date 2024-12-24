package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class StorefrontAccessToken implements com.shopify.types.Node {
  
  private List<AccessScope> accessScopes;

  
  private String accessToken;

  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private String title;

  
  private OffsetDateTime updatedAt;

  public StorefrontAccessToken() {
  }

  
  public List<AccessScope> getAccessScopes() {
    return accessScopes;
  }

  public void setAccessScopes(List<AccessScope> accessScopes) {
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

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
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
    
    private List<AccessScope> accessScopes;

    
    private String accessToken;

    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private String title;

    
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

    
    public Builder accessScopes(List<AccessScope> accessScopes) {
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
