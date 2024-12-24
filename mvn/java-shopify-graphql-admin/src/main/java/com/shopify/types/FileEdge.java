package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FileEdge {
  
  private String cursor;

  
  private File node;

  public FileEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public File getNode() {
    return node;
  }

  public void setNode(File node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "FileEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileEdge that = (FileEdge) o;
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

    
    private File node;

    public FileEdge build() {
      FileEdge result = new FileEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(File node) {
      this.node = node;
      return this;
    }
  }
}
