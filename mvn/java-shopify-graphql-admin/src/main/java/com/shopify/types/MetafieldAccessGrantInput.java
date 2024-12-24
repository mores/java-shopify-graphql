package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldAccessGrantInput {
  
  private String grantee;

  
  private MetafieldGrantAccessLevel access;

  public MetafieldAccessGrantInput() {
  }

  
  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  
  public MetafieldGrantAccessLevel getAccess() {
    return access;
  }

  public void setAccess(MetafieldGrantAccessLevel access) {
    this.access = access;
  }

  @Override
  public String toString() {
    return "MetafieldAccessGrantInput{grantee='" + grantee + "', access='" + access + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessGrantInput that = (MetafieldAccessGrantInput) o;
    return Objects.equals(grantee, that.grantee) &&
        Objects.equals(access, that.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantee, access);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String grantee;

    
    private MetafieldGrantAccessLevel access;

    public MetafieldAccessGrantInput build() {
      MetafieldAccessGrantInput result = new MetafieldAccessGrantInput();
      result.grantee = this.grantee;
      result.access = this.access;
      return result;
    }

    
    public Builder grantee(String grantee) {
      this.grantee = grantee;
      return this;
    }

    
    public Builder access(MetafieldGrantAccessLevel access) {
      this.access = access;
      return this;
    }
  }
}
