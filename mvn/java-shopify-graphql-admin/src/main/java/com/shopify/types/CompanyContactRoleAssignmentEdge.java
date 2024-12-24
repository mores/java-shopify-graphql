package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyContactRoleAssignmentEdge {
  
  private String cursor;

  
  private CompanyContactRoleAssignment node;

  public CompanyContactRoleAssignmentEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public CompanyContactRoleAssignment getNode() {
    return node;
  }

  public void setNode(CompanyContactRoleAssignment node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "CompanyContactRoleAssignmentEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactRoleAssignmentEdge that = (CompanyContactRoleAssignmentEdge) o;
    return Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, node);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String cursor;

    
    private CompanyContactRoleAssignment node;

    public CompanyContactRoleAssignmentEdge build() {
      CompanyContactRoleAssignmentEdge result = new CompanyContactRoleAssignmentEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(CompanyContactRoleAssignment node) {
      this.node = node;
      return this;
    }
  }
}
