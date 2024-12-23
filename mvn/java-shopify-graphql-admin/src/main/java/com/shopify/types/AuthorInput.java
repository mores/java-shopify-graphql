package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an author. Either the `name` or `user_id` fields can be supplied, but never both.
 */
public class AuthorInput {
  /**
   * The author's full name.
   */
  private String name;

  /**
   * The ID of a staff member's account.
   */
  private String userId;

  public AuthorInput() {
  }

  /**
   * The author's full name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ID of a staff member's account.
   */
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "AuthorInput{name='" + name + "', userId='" + userId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuthorInput that = (AuthorInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, userId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The author's full name.
     */
    private String name;

    /**
     * The ID of a staff member's account.
     */
    private String userId;

    public AuthorInput build() {
      AuthorInput result = new AuthorInput();
      result.name = this.name;
      result.userId = this.userId;
      return result;
    }

    /**
     * The author's full name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The ID of a staff member's account.
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }
  }
}
