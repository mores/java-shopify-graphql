package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PublicationCreatePayload {
  
  private Publication publication;

  
  private List<PublicationUserError> userErrors;

  public PublicationCreatePayload() {
  }

  
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  
  public List<PublicationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PublicationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PublicationCreatePayload{publication='" + publication + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicationCreatePayload that = (PublicationCreatePayload) o;
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
    
    private Publication publication;

    
    private List<PublicationUserError> userErrors;

    public PublicationCreatePayload build() {
      PublicationCreatePayload result = new PublicationCreatePayload();
      result.publication = this.publication;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    
    public Builder userErrors(List<PublicationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
