package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectBulkDeleteWhereCondition {
  
  private String type;

  
  private List<String> ids;

  public MetaobjectBulkDeleteWhereCondition() {
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  @Override
  public String toString() {
    return "MetaobjectBulkDeleteWhereCondition{type='" + type + "', ids='" + ids + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectBulkDeleteWhereCondition that = (MetaobjectBulkDeleteWhereCondition) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(ids, that.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ids);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String type;

    
    private List<String> ids;

    public MetaobjectBulkDeleteWhereCondition build() {
      MetaobjectBulkDeleteWhereCondition result = new MetaobjectBulkDeleteWhereCondition();
      result.type = this.type;
      result.ids = this.ids;
      return result;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    
    public Builder ids(List<String> ids) {
      this.ids = ids;
      return this;
    }
  }
}
