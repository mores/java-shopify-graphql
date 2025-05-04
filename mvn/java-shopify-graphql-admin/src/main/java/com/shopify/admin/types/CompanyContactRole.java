package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The role for a [company contact](https://shopify.dev/api/admin-graphql/latest/objects/companycontact).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyContactRole implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of a role.
   * For example, `admin` or `buyer`.
   */
  private String name;

  /**
   * A note for the role.
   */
  private String note;

  public CompanyContactRole() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of a role.
   * For example, `admin` or `buyer`.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A note for the role.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  @Override
  public String toString() {
    return "CompanyContactRole{id='" + id + "', name='" + name + "', note='" + note + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactRole that = (CompanyContactRole) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, note);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of a role.
     * For example, `admin` or `buyer`.
     */
    private String name;

    /**
     * A note for the role.
     */
    private String note;

    public CompanyContactRole build() {
      CompanyContactRole result = new CompanyContactRole();
      result.id = this.id;
      result.name = this.name;
      result.note = this.note;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of a role.
     * For example, `admin` or `buyer`.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A note for the role.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }
  }
}
