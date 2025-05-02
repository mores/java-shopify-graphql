package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopPayInstallmentsProductVariantPricingFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsProductVariantPricing"));
  }

  public ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT>, ROOT> fullPrice(
      ) {
     MoneyV2Projection<ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("fullPrice", projection);
     return projection;
  }

  public CountProjection<ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT>, ROOT> installmentsCount(
      ) {
     CountProjection<ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("installmentsCount", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT>, ROOT> pricePerTerm(
      ) {
     MoneyV2Projection<ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("pricePerTerm", projection);
     return projection;
  }

  public ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT> available() {
    getFields().put("available", null);
    return this;
  }

  public ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }

  public ShopPayInstallmentsProductVariantPricingFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopPayInstallmentsProductVariantPricing {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
