package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeV2LineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeV2LineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeV2LineItem"));
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> discountedTotalSet() {
     MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public GiftCardProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> giftCards() {
     GiftCardProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("giftCards", projection);
     return projection;
  }

  public LineItemProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> originalTotalSet() {
     MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public ProductVariantProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<ExchangeV2LineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> giftCard() {
    getFields().put("giftCard", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public ExchangeV2LineItemProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
