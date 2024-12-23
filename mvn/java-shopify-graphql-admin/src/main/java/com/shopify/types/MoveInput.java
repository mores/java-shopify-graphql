package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a single move of an object to a specific position in a set, using a zero-based index.
 */
public class MoveInput {
  /**
   * The ID of the object to be moved.
   */
  private String id;

  /**
   * The new position of the object in the set.
   */
  private String newPosition;

  public MoveInput() {
  }

  /**
   * The ID of the object to be moved.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The new position of the object in the set.
   */
  public String getNewPosition() {
    return newPosition;
  }

  public void setNewPosition(String newPosition) {
    this.newPosition = newPosition;
  }

  @Override
  public String toString() {
    return "MoveInput{id='" + id + "', newPosition='" + newPosition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MoveInput that = (MoveInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(newPosition, that.newPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newPosition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the object to be moved.
     */
    private String id;

    /**
     * The new position of the object in the set.
     */
    private String newPosition;

    public MoveInput build() {
      MoveInput result = new MoveInput();
      result.id = this.id;
      result.newPosition = this.newPosition;
      return result;
    }

    /**
     * The ID of the object to be moved.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The new position of the object in the set.
     */
    public Builder newPosition(String newPosition) {
      this.newPosition = newPosition;
      return this;
    }
  }
}
