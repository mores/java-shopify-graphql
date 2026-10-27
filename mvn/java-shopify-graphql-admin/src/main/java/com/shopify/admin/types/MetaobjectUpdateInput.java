package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a metaobject.
 */
public class MetaobjectUpdateInput {
  /**
   * A unique handle for the metaobject.
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

  /**
   * Whether to create a redirect for the metaobject.
   */
  private Boolean redirectNewHandle = false;

  /**
   * The field values for the metaobject as a JSON object, keyed by field
   * definition key. This is a full replacement — omitted keys are cleared on an
   * existing record. Cannot be used in conjunction with `fields`.
   */
  private String values;

  public MetaobjectUpdateInput() {
  }

  /**
   * A unique handle for the metaobject.
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

  /**
   * Whether to create a redirect for the metaobject.
   */
  public Boolean getRedirectNewHandle() {
    return redirectNewHandle;
  }

  public void setRedirectNewHandle(Boolean redirectNewHandle) {
    this.redirectNewHandle = redirectNewHandle;
  }

  /**
   * The field values for the metaobject as a JSON object, keyed by field
   * definition key. This is a full replacement — omitted keys are cleared on an
   * existing record. Cannot be used in conjunction with `fields`.
   */
  public String getValues() {
    return values;
  }

  public void setValues(String values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "MetaobjectUpdateInput{handle='" + handle + "', fields='" + fields + "', capabilities='" + capabilities + "', redirectNewHandle='" + redirectNewHandle + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectUpdateInput that = (MetaobjectUpdateInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(fields, that.fields) &&
        Objects.equals(capabilities, that.capabilities) &&
        Objects.equals(redirectNewHandle, that.redirectNewHandle) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, fields, capabilities, redirectNewHandle, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A unique handle for the metaobject.
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

    /**
     * Whether to create a redirect for the metaobject.
     */
    private Boolean redirectNewHandle = false;

    /**
     * The field values for the metaobject as a JSON object, keyed by field
     * definition key. This is a full replacement — omitted keys are cleared on an
     * existing record. Cannot be used in conjunction with `fields`.
     */
    private String values;

    public MetaobjectUpdateInput build() {
      MetaobjectUpdateInput result = new MetaobjectUpdateInput();
      result.handle = this.handle;
      result.fields = this.fields;
      result.capabilities = this.capabilities;
      result.redirectNewHandle = this.redirectNewHandle;
      result.values = this.values;
      return result;
    }

    /**
     * A unique handle for the metaobject.
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

    /**
     * Whether to create a redirect for the metaobject.
     */
    public Builder redirectNewHandle(Boolean redirectNewHandle) {
      this.redirectNewHandle = redirectNewHandle;
      return this;
    }

    /**
     * The field values for the metaobject as a JSON object, keyed by field
     * definition key. This is a full replacement — omitted keys are cleared on an
     * existing record. Cannot be used in conjunction with `fields`.
     */
    public Builder values(String values) {
      this.values = values;
      return this;
    }
  }
}
