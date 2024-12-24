package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Model3dBoundingBox {
  
  private Vector3 size;

  public Model3dBoundingBox() {
  }

  
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
    
    private Vector3 size;

    public Model3dBoundingBox build() {
      Model3dBoundingBox result = new Model3dBoundingBox();
      result.size = this.size;
      return result;
    }

    
    public Builder size(Vector3 size) {
      this.size = size;
      return this;
    }
  }
}
