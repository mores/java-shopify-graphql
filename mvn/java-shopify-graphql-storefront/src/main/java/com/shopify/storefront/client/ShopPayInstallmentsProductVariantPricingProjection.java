package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayInstallmentsProductVariantPricingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayInstallmentsProductVariantPricingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsProductVariantPricing"));
  }

  public ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT>, ROOT> fullPrice(
      ) {
     MoneyV2Projection<ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("fullPrice", projection);
     return projection;
  }

  public CountProjection<ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT>, ROOT> installmentsCount(
      ) {
     CountProjection<ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("installmentsCount", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT>, ROOT> pricePerTerm(
      ) {
     MoneyV2Projection<ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("pricePerTerm", projection);
     return projection;
  }

  public ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT> available() {
    getFields().put("available", null);
    return this;
  }

  public ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }

  public ShopPayInstallmentsProductVariantPricingProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
