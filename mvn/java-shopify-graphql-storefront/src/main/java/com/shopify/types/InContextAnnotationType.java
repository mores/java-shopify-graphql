package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * This gives information about the type of context that impacts a field. For
 * example, for a query with @inContext(language: "EN"), the type would point to
 * the name: LanguageCode and kind: ENUM.
 */
public class InContextAnnotationType {
  private String kind;

  private String name;

  public InContextAnnotationType() {
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "InContextAnnotationType{kind='" + kind + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InContextAnnotationType that = (InContextAnnotationType) o;
    return Objects.equals(kind, that.kind) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String kind;

    private String name;

    public InContextAnnotationType build() {
      InContextAnnotationType result = new InContextAnnotationType();
      result.kind = this.kind;
      result.name = this.name;
      return result;
    }

    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
