package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsAddressBasicProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsAddressBasicProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsAddressBasic"));
  }

  public ShopifyPaymentsAddressBasicProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<PARENT, ROOT> addressLine1() {
    getFields().put("addressLine1", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<PARENT, ROOT> addressLine2() {
    getFields().put("addressLine2", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<PARENT, ROOT> postalCode() {
    getFields().put("postalCode", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<PARENT, ROOT> zone() {
    getFields().put("zone", null);
    return this;
  }
}
