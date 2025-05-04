package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsChargeStatementDescriptorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsChargeStatementDescriptorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsChargeStatementDescriptor"));
  }

  public ShopifyPaymentsChargeStatementDescriptorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsChargeStatementDescriptorProjection<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public ShopifyPaymentsChargeStatementDescriptorProjection<PARENT, ROOT> prefix() {
    getFields().put("prefix", null);
    return this;
  }

  public ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection<ShopifyPaymentsChargeStatementDescriptorProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsDefaultChargeStatementDescriptor(
      ) {
    ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection<ShopifyPaymentsChargeStatementDescriptorProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<ShopifyPaymentsChargeStatementDescriptorProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsJpChargeStatementDescriptor(
      ) {
    ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<ShopifyPaymentsChargeStatementDescriptorProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
