package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldAccessGrantOperationInput {
  
  private MetafieldAccessGrantInput create;

  
  private MetafieldAccessGrantInput update;

  
  private MetafieldAccessGrantDeleteInput delete;

  public MetafieldAccessGrantOperationInput() {
  }

  
  public MetafieldAccessGrantInput getCreate() {
    return create;
  }

  public void setCreate(MetafieldAccessGrantInput create) {
    this.create = create;
  }

  
  public MetafieldAccessGrantInput getUpdate() {
    return update;
  }

  public void setUpdate(MetafieldAccessGrantInput update) {
    this.update = update;
  }

  
  public MetafieldAccessGrantDeleteInput getDelete() {
    return delete;
  }

  public void setDelete(MetafieldAccessGrantDeleteInput delete) {
    this.delete = delete;
  }

  @Override
  public String toString() {
    return "MetafieldAccessGrantOperationInput{create='" + create + "', update='" + update + "', delete='" + delete + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessGrantOperationInput that = (MetafieldAccessGrantOperationInput) o;
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
    
    private MetafieldAccessGrantInput create;

    
    private MetafieldAccessGrantInput update;

    
    private MetafieldAccessGrantDeleteInput delete;

    public MetafieldAccessGrantOperationInput build() {
      MetafieldAccessGrantOperationInput result = new MetafieldAccessGrantOperationInput();
      result.create = this.create;
      result.update = this.update;
      result.delete = this.delete;
      return result;
    }

    
    public Builder create(MetafieldAccessGrantInput create) {
      this.create = create;
      return this;
    }

    
    public Builder update(MetafieldAccessGrantInput update) {
      this.update = update;
      return this;
    }

    
    public Builder delete(MetafieldAccessGrantDeleteInput delete) {
      this.delete = delete;
      return this;
    }
  }
}
