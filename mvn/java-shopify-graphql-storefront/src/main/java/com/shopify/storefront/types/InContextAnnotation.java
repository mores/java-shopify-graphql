package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provide details about the contexts influenced by the @inContext directive on a field.
 */
public class InContextAnnotation {
  private String description;

  private InContextAnnotationType type;

  public InContextAnnotation() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InContextAnnotationType getType() {
    return type;
  }

  public void setType(InContextAnnotationType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "InContextAnnotation{description='" + description + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InContextAnnotation that = (InContextAnnotation) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String description;

    private InContextAnnotationType type;

    public InContextAnnotation build() {
      InContextAnnotation result = new InContextAnnotation();
      result.description = this.description;
      result.type = this.type;
      return result;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder type(InContextAnnotationType type) {
      this.type = type;
      return this;
    }
  }
}
