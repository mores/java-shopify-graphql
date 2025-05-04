package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A checkout profile defines the branding settings and the UI extensions for a
 * store's checkout. A checkout profile could be published or draft. A store might
 * have at most one published checkout profile, which is used to render their live
 * checkout. The store could also have multiple draft profiles that were created,
 * previewed, and published using the admin checkout editor.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutProfile implements com.shopify.admin.types.Node {
  /**
   * The date and time when the checkout profile was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The date and time when the checkout profile was last edited.
   */
  private OffsetDateTime editedAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the checkout profile is published or not.
   */
  private boolean isPublished;

  /**
   * The profile name.
   */
  private String name;

  /**
   * Whether the checkout profile Thank You Page and Order Status Page are actively using extensibility or not.
   */
  private boolean typOspPagesActive;

  /**
   * The date and time when the checkout profile was last updated.
   */
  private OffsetDateTime updatedAt;

  public CheckoutProfile() {
  }

  /**
   * The date and time when the checkout profile was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The date and time when the checkout profile was last edited.
   */
  public OffsetDateTime getEditedAt() {
    return editedAt;
  }

  public void setEditedAt(OffsetDateTime editedAt) {
    this.editedAt = editedAt;
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
   * Whether the checkout profile is published or not.
   */
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * The profile name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether the checkout profile Thank You Page and Order Status Page are actively using extensibility or not.
   */
  public boolean getTypOspPagesActive() {
    return typOspPagesActive;
  }

  public void setTypOspPagesActive(boolean typOspPagesActive) {
    this.typOspPagesActive = typOspPagesActive;
  }

  /**
   * The date and time when the checkout profile was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CheckoutProfile{createdAt='" + createdAt + "', editedAt='" + editedAt + "', id='" + id + "', isPublished='" + isPublished + "', name='" + name + "', typOspPagesActive='" + typOspPagesActive + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutProfile that = (CheckoutProfile) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(editedAt, that.editedAt) &&
        Objects.equals(id, that.id) &&
        isPublished == that.isPublished &&
        Objects.equals(name, that.name) &&
        typOspPagesActive == that.typOspPagesActive &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, editedAt, id, isPublished, name, typOspPagesActive, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the checkout profile was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The date and time when the checkout profile was last edited.
     */
    private OffsetDateTime editedAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the checkout profile is published or not.
     */
    private boolean isPublished;

    /**
     * The profile name.
     */
    private String name;

    /**
     * Whether the checkout profile Thank You Page and Order Status Page are actively using extensibility or not.
     */
    private boolean typOspPagesActive;

    /**
     * The date and time when the checkout profile was last updated.
     */
    private OffsetDateTime updatedAt;

    public CheckoutProfile build() {
      CheckoutProfile result = new CheckoutProfile();
      result.createdAt = this.createdAt;
      result.editedAt = this.editedAt;
      result.id = this.id;
      result.isPublished = this.isPublished;
      result.name = this.name;
      result.typOspPagesActive = this.typOspPagesActive;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the checkout profile was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The date and time when the checkout profile was last edited.
     */
    public Builder editedAt(OffsetDateTime editedAt) {
      this.editedAt = editedAt;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the checkout profile is published or not.
     */
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * The profile name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Whether the checkout profile Thank You Page and Order Status Page are actively using extensibility or not.
     */
    public Builder typOspPagesActive(boolean typOspPagesActive) {
      this.typOspPagesActive = typOspPagesActive;
      return this;
    }

    /**
     * The date and time when the checkout profile was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
