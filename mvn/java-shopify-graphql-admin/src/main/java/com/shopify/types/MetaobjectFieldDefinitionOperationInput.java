package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for possible operations for modifying field definitions. Exactly one option is required.
 */
public class MetaobjectFieldDefinitionOperationInput {
  /**
   * The input fields for creating a metaobject field definition.
   */
  private MetaobjectFieldDefinitionCreateInput create;

  /**
   * The input fields for updating a metaobject field definition.
   */
  private MetaobjectFieldDefinitionUpdateInput update;

  /**
   * The input fields for deleting a metaobject field definition.
   */
  private MetaobjectFieldDefinitionDeleteInput delete;

  public MetaobjectFieldDefinitionOperationInput() {
  }

  /**
   * The input fields for creating a metaobject field definition.
   */
  public MetaobjectFieldDefinitionCreateInput getCreate() {
    return create;
  }

  public void setCreate(MetaobjectFieldDefinitionCreateInput create) {
    this.create = create;
  }

  /**
   * The input fields for updating a metaobject field definition.
   */
  public MetaobjectFieldDefinitionUpdateInput getUpdate() {
    return update;
  }

  public void setUpdate(MetaobjectFieldDefinitionUpdateInput update) {
    this.update = update;
  }

  /**
   * The input fields for deleting a metaobject field definition.
   */
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
    /**
     * The input fields for creating a metaobject field definition.
     */
    private MetaobjectFieldDefinitionCreateInput create;

    /**
     * The input fields for updating a metaobject field definition.
     */
    private MetaobjectFieldDefinitionUpdateInput update;

    /**
     * The input fields for deleting a metaobject field definition.
     */
    private MetaobjectFieldDefinitionDeleteInput delete;

    public MetaobjectFieldDefinitionOperationInput build() {
      MetaobjectFieldDefinitionOperationInput result = new MetaobjectFieldDefinitionOperationInput();
      result.create = this.create;
      result.update = this.update;
      result.delete = this.delete;
      return result;
    }

    /**
     * The input fields for creating a metaobject field definition.
     */
    public Builder create(MetaobjectFieldDefinitionCreateInput create) {
      this.create = create;
      return this;
    }

    /**
     * The input fields for updating a metaobject field definition.
     */
    public Builder update(MetaobjectFieldDefinitionUpdateInput update) {
      this.update = update;
      return this;
    }

    /**
     * The input fields for deleting a metaobject field definition.
     */
    public Builder delete(MetaobjectFieldDefinitionDeleteInput delete) {
      this.delete = delete;
      return this;
    }
  }
}
