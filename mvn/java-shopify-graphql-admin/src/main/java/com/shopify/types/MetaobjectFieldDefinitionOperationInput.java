package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectFieldDefinitionOperationInput {
  
  private MetaobjectFieldDefinitionCreateInput create;

  
  private MetaobjectFieldDefinitionUpdateInput update;

  
  private MetaobjectFieldDefinitionDeleteInput delete;

  public MetaobjectFieldDefinitionOperationInput() {
  }

  
  public MetaobjectFieldDefinitionCreateInput getCreate() {
    return create;
  }

  public void setCreate(MetaobjectFieldDefinitionCreateInput create) {
    this.create = create;
  }

  
  public MetaobjectFieldDefinitionUpdateInput getUpdate() {
    return update;
  }

  public void setUpdate(MetaobjectFieldDefinitionUpdateInput update) {
    this.update = update;
  }

  
  public MetaobjectFieldDefinitionDeleteInput getDelete() {
    return delete;
  }

  public void setDelete(MetaobjectFieldDefinitionDeleteInput delete) {
    this.delete = delete;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldDefinitionOperationInput{create='" + create + "', update='" + update + "', delete='" + delete + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldDefinitionOperationInput that = (MetaobjectFieldDefinitionOperationInput) o;
    return Objects.equals(create, that.create) &&
        Objects.equals(update, that.update) &&
        Objects.equals(delete, that.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, update, delete);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectFieldDefinitionCreateInput create;

    
    private MetaobjectFieldDefinitionUpdateInput update;

    
    private MetaobjectFieldDefinitionDeleteInput delete;

    public MetaobjectFieldDefinitionOperationInput build() {
      MetaobjectFieldDefinitionOperationInput result = new MetaobjectFieldDefinitionOperationInput();
      result.create = this.create;
      result.update = this.update;
      result.delete = this.delete;
      return result;
    }

    
    public Builder create(MetaobjectFieldDefinitionCreateInput create) {
      this.create = create;
      return this;
    }

    
    public Builder update(MetaobjectFieldDefinitionUpdateInput update) {
      this.update = update;
      return this;
    }

    
    public Builder delete(MetaobjectFieldDefinitionDeleteInput delete) {
      this.delete = delete;
      return this;
    }
  }
}
