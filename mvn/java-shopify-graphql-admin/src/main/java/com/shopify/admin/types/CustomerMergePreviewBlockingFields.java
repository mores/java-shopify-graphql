package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The blocking fields of a customer merge preview. These fields will block customer merge unless edited.
 */
public class CustomerMergePreviewBlockingFields {
  /**
   * The merged note resulting from a customer merge. The merged note is over the
   * 5000 character limit and will block customer merge.
   */
  private String note;

  /**
   * The merged tags resulting from a customer merge. The merged tags are over the 250 limit and will block customer merge.
   */
  private List<String> tags;

  public CustomerMergePreviewBlockingFields() {
  }

  /**
   * The merged note resulting from a customer merge. The merged note is over the
   * 5000 character limit and will block customer merge.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The merged tags resulting from a customer merge. The merged tags are over the 250 limit and will block customer merge.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "CustomerMergePreviewBlockingFields{note='" + note + "', tags='" + tags + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergePreviewBlockingFields that = (CustomerMergePreviewBlockingFields) o;
    return Objects.equals(note, that.note) &&
        Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, tags);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The merged note resulting from a customer merge. The merged note is over the
     * 5000 character limit and will block customer merge.
     */
    private String note;

    /**
     * The merged tags resulting from a customer merge. The merged tags are over the 250 limit and will block customer merge.
     */
    private List<String> tags;

    public CustomerMergePreviewBlockingFields build() {
      CustomerMergePreviewBlockingFields result = new CustomerMergePreviewBlockingFields();
      result.note = this.note;
      result.tags = this.tags;
      return result;
    }

    /**
     * The merged note resulting from a customer merge. The merged note is over the
     * 5000 character limit and will block customer merge.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The merged tags resulting from a customer merge. The merged tags are over the 250 limit and will block customer merge.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }
}
