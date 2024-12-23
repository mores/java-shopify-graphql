package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DigitalWalletProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DigitalWalletProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DigitalWallet"));
  }

  public DigitalWalletProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
