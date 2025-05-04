package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for upserting a metaobject.
 */
public class MetaobjectUpsertInput {
  /**
   * The handle of the metaobject.
   */
  private String handle;

  /**
   * Values for fields. These are mapped by key to fields of the metaobject definition.
   */
  private List<MetaobjectFieldInput> fields;

  /**
   * Capabilities for the metaobject.
   */
  private MetaobjectCapabilityDataInput capabilities;

  public MetaobjectUpsertInput() {
  }

  /**
   * The handle of the metaobject.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Values for fields. These are mapped by key to fields of the metaobject definition.
   */
  public List<MetaobjectFieldInput> getFields() {
    return fields;
  }

  public void setFields(List<MetaobjectFieldInput> fields) {
    this.fields = fields;
  }

  /**
   * Capabilities for the metaobject.
   */
  public MetaobjectCapabilityDataInput getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityDataInput capabilities) {
    this.capabilities = capabilities;
  }

  @Override
  public String toString() {
    return "MetaobjectUpsertInput{handle='" + handle + "', fields='" + fields + "', capabilities='" + capabilities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectUpsertInput that = (MetaobjectUpsertInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(fields, that.fields) &&
        Objects.equals(capabilities, that.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, fields, capabilities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The handle of the metaobject.
     */
    private String handle;

    /**
     * Values for fields. These are mapped by key to fields of the metaobject definition.
     */
    private List<MetaobjectFieldInput> fields;

    /**
     * Capabilities for the metaobject.
     */
    private MetaobjectCapabilityDataInput capabilities;

    public MetaobjectUpsertInput build() {
      MetaobjectUpsertInput result = new MetaobjectUpsertInput();
      result.handle = this.handle;
      result.fields = this.fields;
      result.capabilities = this.capabilities;
      return result;
    }

    /**
     * The handle of the metaobject.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Values for fields. These are mapped by key to fields of the metaobject definition.
     */
    public Builder fields(List<MetaobjectFieldInput> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Capabilities for the metaobject.
     */
    public Builder capabilities(MetaobjectCapabilityDataInput capabilities) {
      this.capabilities = capabilities;
      return this;
    }
  }
}
