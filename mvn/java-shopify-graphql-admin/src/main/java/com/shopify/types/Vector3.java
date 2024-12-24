package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Vector3 {
  
  private double x;

  
  private double y;

  
  private double z;

  public Vector3() {
  }

  
  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  
  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  
  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  @Override
  public String toString() {
    return "Vector3{x='" + x + "', y='" + y + "', z='" + z + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vector3 that = (Vector3) o;
    return x == that.x &&
        y == that.y &&
        z == that.z;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private double x;

    
    private double y;

    
    private double z;

    public Vector3 build() {
      Vector3 result = new Vector3();
      result.x = this.x;
      result.y = this.y;
      result.z = this.z;
      return result;
    }

    
    public Builder x(double x) {
      this.x = x;
      return this;
    }

    
    public Builder y(double y) {
      this.y = y;
      return this;
    }

    
    public Builder z(double z) {
      this.z = z;
      return this;
    }
  }
}
