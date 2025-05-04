package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying the information to be updated on an order when using the orderUpdate mutation.
 */
public class OrderInput {
  /**
   * The ID of the order to update.
   */
  private String id;

  /**
   * A new customer email address for the order. Overwrites the existing email address.
   */
  private String email;

  /**
   * The new contents for the note associated with the order. Overwrites the existing note.
   */
  private String note;

  /**
   * A new list of tags for the order. Overwrites the existing tags.
   */
  private List<String> tags;

  /**
   * The new shipping address for the order. Overwrites the existing shipping address.
   */
  private MailingAddressInput shippingAddress;

  /**
   * A new list of custom attributes for the order. Overwrites the existing custom attributes.
   */
  private List<AttributeInput> customAttributes;

  /**
   * A list of new metafields to add to the existing metafields for the order.
   */
  private List<MetafieldInput> metafields;

  /**
   * A list of new [localized
   * fields](https://shopify.dev/api/admin-graphql/latest/objects/localizedfield)
   * to add to the existing list of localized fields for the order.
   */
  private List<LocalizedFieldInput> localizedFields;

  /**
   * The new purchase order number for the order.
   */
  private String poNumber;

  public OrderInput() {
  }

  /**
   * The ID of the order to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A new customer email address for the order. Overwrites the existing email address.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The new contents for the note associated with the order. Overwrites the existing note.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * A new list of tags for the order. Overwrites the existing tags.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The new shipping address for the order. Overwrites the existing shipping address.
   */
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * A new list of custom attributes for the order. Overwrites the existing custom attributes.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * A list of new metafields to add to the existing metafields for the order.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * A list of new [localized
   * fields](https://shopify.dev/api/admin-graphql/latest/objects/localizedfield)
   * to add to the existing list of localized fields for the order.
   */
  public List<LocalizedFieldInput> getLocalizedFields() {
    return localizedFields;
  }

  public void setLocalizedFields(List<LocalizedFieldInput> localizedFields) {
    this.localizedFields = localizedFields;
  }

  /**
   * The new purchase order number for the order.
   */
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  @Override
  public String toString() {
    return "OrderInput{id='" + id + "', email='" + email + "', note='" + note + "', tags='" + tags + "', shippingAddress='" + shippingAddress + "', customAttributes='" + customAttributes + "', metafields='" + metafields + "', localizedFields='" + localizedFields + "', poNumber='" + poNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderInput that = (OrderInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(email, that.email) &&
        Objects.equals(note, that.note) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(localizedFields, that.localizedFields) &&
        Objects.equals(poNumber, that.poNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, note, tags, shippingAddress, customAttributes, metafields, localizedFields, poNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order to update.
     */
    private String id;

    /**
     * A new customer email address for the order. Overwrites the existing email address.
     */
    private String email;

    /**
     * The new contents for the note associated with the order. Overwrites the existing note.
     */
    private String note;

    /**
     * A new list of tags for the order. Overwrites the existing tags.
     */
    private List<String> tags;

    /**
     * The new shipping address for the order. Overwrites the existing shipping address.
     */
    private MailingAddressInput shippingAddress;

    /**
     * A new list of custom attributes for the order. Overwrites the existing custom attributes.
     */
    private List<AttributeInput> customAttributes;

    /**
     * A list of new metafields to add to the existing metafields for the order.
     */
    private List<MetafieldInput> metafields;

    /**
     * A list of new [localized
     * fields](https://shopify.dev/api/admin-graphql/latest/objects/localizedfield)
     * to add to the existing list of localized fields for the order.
     */
    private List<LocalizedFieldInput> localizedFields;

    /**
     * The new purchase order number for the order.
     */
    private String poNumber;

    public OrderInput build() {
      OrderInput result = new OrderInput();
      result.id = this.id;
      result.email = this.email;
      result.note = this.note;
      result.tags = this.tags;
      result.shippingAddress = this.shippingAddress;
      result.customAttributes = this.customAttributes;
      result.metafields = this.metafields;
      result.localizedFields = this.localizedFields;
      result.poNumber = this.poNumber;
      return result;
    }

    /**
     * The ID of the order to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A new customer email address for the order. Overwrites the existing email address.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The new contents for the note associated with the order. Overwrites the existing note.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * A new list of tags for the order. Overwrites the existing tags.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * The new shipping address for the order. Overwrites the existing shipping address.
     */
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * A new list of custom attributes for the order. Overwrites the existing custom attributes.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * A list of new metafields to add to the existing metafields for the order.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A list of new [localized
     * fields](https://shopify.dev/api/admin-graphql/latest/objects/localizedfield)
     * to add to the existing list of localized fields for the order.
     */
    public Builder localizedFields(List<LocalizedFieldInput> localizedFields) {
      this.localizedFields = localizedFields;
      return this;
    }

    /**
     * The new purchase order number for the order.
     */
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }
  }
}
