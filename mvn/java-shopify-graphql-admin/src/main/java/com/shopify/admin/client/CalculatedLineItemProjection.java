package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedLineItem"));
  }

  public CalculatedLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedDiscountAllocationProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> calculatedDiscountAllocations(
      ) {
     CalculatedDiscountAllocationProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountAllocationProjection<>(this, getRoot());
     getFields().put("calculatedDiscountAllocations", projection);
     return projection;
  }

  public AttributeProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountAllocationProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> editableSubtotalSet(
      ) {
     MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("editableSubtotalSet", projection);
     return projection;
  }

  public ImageProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public OrderStagedChangeProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> stagedChanges(
      ) {
     OrderStagedChangeProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new OrderStagedChangeProjection<>(this, getRoot());
     getFields().put("stagedChanges", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> uneditableSubtotalSet(
      ) {
     MoneyBagProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("uneditableSubtotalSet", projection);
     return projection;
  }

  public ProductVariantProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<CalculatedLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> editableQuantity() {
    getFields().put("editableQuantity", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> editableQuantityBeforeChanges() {
    getFields().put("editableQuantityBeforeChanges", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> hasStagedLineItemDiscount() {
    getFields().put("hasStagedLineItemDiscount", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> restockable() {
    getFields().put("restockable", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> restocking() {
    getFields().put("restocking", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CalculatedLineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }
}
