package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MerchantApprovalSignalsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MerchantApprovalSignalsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MerchantApprovalSignals"));
  }

  public MerchantApprovalSignalsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MerchantApprovalSignalsProjection<PARENT, ROOT> identityVerified() {
    getFields().put("identityVerified", null);
    return this;
  }

  public MerchantApprovalSignalsProjection<PARENT, ROOT> verifiedByShopify() {
    getFields().put("verifiedByShopify", null);
    return this;
  }

  public MerchantApprovalSignalsProjection<PARENT, ROOT> verifiedByShopifyTier() {
    getFields().put("verifiedByShopifyTier", null);
    return this;
  }
}
