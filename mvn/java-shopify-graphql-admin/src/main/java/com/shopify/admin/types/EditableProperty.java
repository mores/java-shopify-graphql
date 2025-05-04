package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The attribute editable information.
 */
public class EditableProperty {
  /**
   * Whether the attribute is locked for editing.
   */
  private boolean locked;

  /**
   * The reason the attribute is locked for editing.
   */
  private String reason;

  public EditableProperty() {
  }

  /**
   * Whether the attribute is locked for editing.
   */
  public boolean getLocked() {
    return locked;
  }

  public void setLocked(boolean locked) {
    this.locked = locked;
  }

  /**
   * The reason the attribute is locked for editing.
   */
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "EditableProperty{locked='" + locked + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EditableProperty that = (EditableProperty) o;
    return locked == that.locked &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locked, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the attribute is locked for editing.
     */
    private boolean locked;

    /**
     * The reason the attribute is locked for editing.
     */
    private String reason;

    public EditableProperty build() {
      EditableProperty result = new EditableProperty();
      result.locked = this.locked;
      result.reason = this.reason;
      return result;
    }

    /**
     * Whether the attribute is locked for editing.
     */
    public Builder locked(boolean locked) {
      this.locked = locked;
      return this;
    }

    /**
     * The reason the attribute is locked for editing.
     */
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }
  }
}
