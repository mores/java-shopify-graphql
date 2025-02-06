package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `publicationUpdate` mutation.
 */
public class PublicationUpdatePayload {
  /**
   * The publication that's been updated.
   */
  private Publication publication;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PublicationUserError> userErrors;

  public PublicationUpdatePayload() {
  }

  /**
   * The publication that's been updated.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PublicationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PublicationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PublicationUpdatePayload{publication='" + publication + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicationUpdatePayload that = (PublicationUpdatePayload) o;
    return Objects.equals(publication, that.publication) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publication, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The publication that's been updated.
     */
    private Publication publication;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PublicationUserError> userErrors;

    public PublicationUpdatePayload build() {
      PublicationUpdatePayload result = new PublicationUpdatePayload();
      result.publication = this.publication;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The publication that's been updated.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PublicationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
