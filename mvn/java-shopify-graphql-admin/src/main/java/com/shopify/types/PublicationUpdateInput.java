package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a publication.
 */
public class PublicationUpdateInput {
  /**
   * A list of publishable IDs to add. The maximum number of publishables to update simultaneously is 50.
   */
  private List<String> publishablesToAdd = Collections.emptyList();

  /**
   * A list of publishable IDs to remove. The maximum number of publishables to update simultaneously is 50.
   */
  private List<String> publishablesToRemove = Collections.emptyList();

  /**
   * Whether new products should be automatically published to the publication.
   */
  private Boolean autoPublish;

  public PublicationUpdateInput() {
  }

  /**
   * A list of publishable IDs to add. The maximum number of publishables to update simultaneously is 50.
   */
  public List<String> getPublishablesToAdd() {
    return publishablesToAdd;
  }

  public void setPublishablesToAdd(List<String> publishablesToAdd) {
    this.publishablesToAdd = publishablesToAdd;
  }

  /**
   * A list of publishable IDs to remove. The maximum number of publishables to update simultaneously is 50.
   */
  public List<String> getPublishablesToRemove() {
    return publishablesToRemove;
  }

  public void setPublishablesToRemove(List<String> publishablesToRemove) {
    this.publishablesToRemove = publishablesToRemove;
  }

  /**
   * Whether new products should be automatically published to the publication.
   */
  public Boolean getAutoPublish() {
    return autoPublish;
  }

  public void setAutoPublish(Boolean autoPublish) {
    this.autoPublish = autoPublish;
  }

  @Override
  public String toString() {
    return "PublicationUpdateInput{publishablesToAdd='" + publishablesToAdd + "', publishablesToRemove='" + publishablesToRemove + "', autoPublish='" + autoPublish + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicationUpdateInput that = (PublicationUpdateInput) o;
    return Objects.equals(publishablesToAdd, that.publishablesToAdd) &&
        Objects.equals(publishablesToRemove, that.publishablesToRemove) &&
        Objects.equals(autoPublish, that.autoPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishablesToAdd, publishablesToRemove, autoPublish);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of publishable IDs to add. The maximum number of publishables to update simultaneously is 50.
     */
    private List<String> publishablesToAdd = Collections.emptyList();

    /**
     * A list of publishable IDs to remove. The maximum number of publishables to update simultaneously is 50.
     */
    private List<String> publishablesToRemove = Collections.emptyList();

    /**
     * Whether new products should be automatically published to the publication.
     */
    private Boolean autoPublish;

    public PublicationUpdateInput build() {
      PublicationUpdateInput result = new PublicationUpdateInput();
      result.publishablesToAdd = this.publishablesToAdd;
      result.publishablesToRemove = this.publishablesToRemove;
      result.autoPublish = this.autoPublish;
      return result;
    }

    /**
     * A list of publishable IDs to add. The maximum number of publishables to update simultaneously is 50.
     */
    public Builder publishablesToAdd(List<String> publishablesToAdd) {
      this.publishablesToAdd = publishablesToAdd;
      return this;
    }

    /**
     * A list of publishable IDs to remove. The maximum number of publishables to update simultaneously is 50.
     */
    public Builder publishablesToRemove(List<String> publishablesToRemove) {
      this.publishablesToRemove = publishablesToRemove;
      return this;
    }

    /**
     * Whether new products should be automatically published to the publication.
     */
    public Builder autoPublish(Boolean autoPublish) {
      this.autoPublish = autoPublish;
      return this;
    }
  }
}
