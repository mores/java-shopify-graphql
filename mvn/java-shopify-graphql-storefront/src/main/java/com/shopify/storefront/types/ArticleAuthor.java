package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The author of an article.
 */
public class ArticleAuthor {
  /**
   * The author's bio.
   */
  private String bio;

  /**
   * The author’s email.
   */
  private String email;

  /**
   * The author's first name.
   */
  private String firstName;

  /**
   * The author's last name.
   */
  private String lastName;

  /**
   * The author's full name.
   */
  private String name;

  public ArticleAuthor() {
  }

  /**
   * The author's bio.
   */
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  /**
   * The author’s email.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The author's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The author's last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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

  @Override
  public String toString() {
    return "ArticleAuthor{bio='" + bio + "', email='" + email + "', firstName='" + firstName + "', lastName='" + lastName + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleAuthor that = (ArticleAuthor) o;
    return Objects.equals(bio, that.bio) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bio, email, firstName, lastName, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The author's bio.
     */
    private String bio;

    /**
     * The author’s email.
     */
    private String email;

    /**
     * The author's first name.
     */
    private String firstName;

    /**
     * The author's last name.
     */
    private String lastName;

    /**
     * The author's full name.
     */
    private String name;

    public ArticleAuthor build() {
      ArticleAuthor result = new ArticleAuthor();
      result.bio = this.bio;
      result.email = this.email;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.name = this.name;
      return result;
    }

    /**
     * The author's bio.
     */
    public Builder bio(String bio) {
      this.bio = bio;
      return this;
    }

    /**
     * The author’s email.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The author's first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The author's last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The author's full name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
