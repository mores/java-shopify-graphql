package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input for moving a single object to a specific position in a set.
 *
 * Provide this input only for objects whose position actually changed; do not send inputs for the entire set.
 *
 * - id: The ID (GID) of the object to move.
 * - newPosition: The zero-based index of the object's position within the set at the time this move is applied.
 *
 * Moves are applied sequentially, so `newPosition` for each move is evaluated after all prior moves in the same list.
 * If `newPosition` is greater than or equal to the number of objects, the object is moved to the end of the set.
 * Values do not have to be unique. Objects not included in the move list keep
 * their relative order, aside from any displacement caused by the moves.
 */
public class MoveInput {
  /**
   * The ID of the object to be moved.
   */
  private String id;

  /**
   * Zero-based index of the object's position at the time this move is applied. If
   * the value is >= the number of objects, the object is placed at the end.
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
   * Zero-based index of the object's position at the time this move is applied. If
   * the value is >= the number of objects, the object is placed at the end.
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
     * Zero-based index of the object's position at the time this move is applied. If
     * the value is >= the number of objects, the object is placed at the end.
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
     * Zero-based index of the object's position at the time this move is applied. If
     * the value is >= the number of objects, the object is placed at the end.
     */
    public Builder newPosition(String newPosition) {
      this.newPosition = newPosition;
      return this;
    }
  }
}
