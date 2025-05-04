package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsMerchantCategoryCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsMerchantCategoryCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsMerchantCategoryCode"));
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<PARENT, ROOT> category() {
    getFields().put("category", null);
    return this;
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<PARENT, ROOT> categoryLabel() {
    getFields().put("categoryLabel", null);
    return this;
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<PARENT, ROOT> subcategoryLabel() {
    getFields().put("subcategoryLabel", null);
    return this;
  }
}
