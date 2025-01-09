package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Bounding box information of a 3d model.
 */
public class Model3dBoundingBox {
  /**
   * Size in meters of the smallest volume which contains the 3d model.
   */
  private Vector3 size;

  public Model3dBoundingBox() {
  }

  /**
   * Size in meters of the smallest volume which contains the 3d model.
   */
  public Vector3 getSize() {
    return size;
  }

  public void setSize(Vector3 size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "Model3dBoundingBox{size='" + size + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Model3dBoundingBox that = (Model3dBoundingBox) o;
    return Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Size in meters of the smallest volume which contains the 3d model.
     */
    private Vector3 size;

    public Model3dBoundingBox build() {
      Model3dBoundingBox result = new Model3dBoundingBox();
      result.size = this.size;
      return result;
    }

    /**
     * Size in meters of the smallest volume which contains the 3d model.
     */
    public Builder size(Vector3 size) {
      this.size = size;
      return this;
    }
  }
}
