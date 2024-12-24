package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerMergePreviewBlockingFields {
  
  private String note;

  
  private List<String> tags;

  public CustomerMergePreviewBlockingFields() {
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
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
    
    private String note;

    
    private List<String> tags;

    public CustomerMergePreviewBlockingFields build() {
      CustomerMergePreviewBlockingFields result = new CustomerMergePreviewBlockingFields();
      result.note = this.note;
      result.tags = this.tags;
      return result;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }
}
