package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldAccessGrant {
  
  private MetafieldGrantAccessLevel access;

  
  private String grantee;

  public MetafieldAccessGrant() {
  }

  
  public MetafieldGrantAccessLevel getAccess() {
    return access;
  }

  public void setAccess(MetafieldGrantAccessLevel access) {
    this.access = access;
  }

  
  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  @Override
  public String toString() {
    return "MetafieldAccessGrant{access='" + access + "', grantee='" + grantee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessGrant that = (MetafieldAccessGrant) o;
    return Objects.equals(access, that.access) &&
        Objects.equals(grantee, that.grantee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, grantee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldGrantAccessLevel access;

    
    private String grantee;

    public MetafieldAccessGrant build() {
      MetafieldAccessGrant result = new MetafieldAccessGrant();
      result.access = this.access;
      result.grantee = this.grantee;
      return result;
    }

    
    public Builder access(MetafieldGrantAccessLevel access) {
      this.access = access;
      return this;
    }

    
    public Builder grantee(String grantee) {
      this.grantee = grantee;
      return this;
    }
  }
}
