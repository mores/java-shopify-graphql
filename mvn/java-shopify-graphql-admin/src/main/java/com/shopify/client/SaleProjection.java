package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SaleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SaleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Sale"));
  }

  public SaleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleActionTypeProjection<SaleProjection<PARENT, ROOT>, ROOT> actionType() {
     SaleActionTypeProjection<SaleProjection<PARENT, ROOT>, ROOT> projection = new SaleActionTypeProjection<>(this, getRoot());
     getFields().put("actionType", projection);
     return projection;
  }

  public SaleLineTypeProjection<SaleProjection<PARENT, ROOT>, ROOT> lineType() {
     SaleLineTypeProjection<SaleProjection<PARENT, ROOT>, ROOT> projection = new SaleLineTypeProjection<>(this, getRoot());
     getFields().put("lineType", projection);
     return projection;
  }

  public SaleTaxProjection<SaleProjection<PARENT, ROOT>, ROOT> taxes() {
     SaleTaxProjection<SaleProjection<PARENT, ROOT>, ROOT> projection = new SaleTaxProjection<>(this, getRoot());
     getFields().put("taxes", projection);
     return projection;
  }

  public MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> totalDiscountAmountAfterTaxes() {
     MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountAfterTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> totalDiscountAmountBeforeTaxes() {
     MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountAmountBeforeTaxes", projection);
     return projection;
  }

  public MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> totalTaxAmount() {
     MoneyBagProjection<SaleProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public SaleProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SaleProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public AdditionalFeeSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onAdditionalFeeSale(
      ) {
    AdditionalFeeSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new AdditionalFeeSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AdjustmentSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onAdjustmentSale() {
    AdjustmentSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new AdjustmentSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DutySaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onDutySale() {
    DutySaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new DutySaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FeeSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onFeeSale() {
    FeeSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new FeeSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onGiftCardSale() {
    GiftCardSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onProductSale() {
    ProductSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new ProductSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShippingLineSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onShippingLineSale(
      ) {
    ShippingLineSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new ShippingLineSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TipSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onTipSale() {
    TipSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new TipSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public UnknownSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> onUnknownSale() {
    UnknownSaleFragmentProjection<SaleProjection<PARENT, ROOT>, ROOT> fragment = new UnknownSaleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
