package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedExchangeLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedExchangeLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedExchangeLineItem"));
  }

  public CalculatedExchangeLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedDiscountAllocationProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> calculatedDiscountAllocations(
      ) {
     CalculatedDiscountAllocationProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountAllocationProjection<>(this, getRoot());
     getFields().put("calculatedDiscountAllocations", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> subtotalSet(
      ) {
     MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> totalTaxSet(
      ) {
     MoneyBagProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public ProductVariantProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<CalculatedExchangeLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public CalculatedExchangeLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CalculatedExchangeLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
