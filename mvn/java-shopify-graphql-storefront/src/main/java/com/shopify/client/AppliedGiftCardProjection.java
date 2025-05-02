package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppliedGiftCardProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppliedGiftCardProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppliedGiftCard"));
  }

  public AppliedGiftCardProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> amountUsed() {
     MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountUsed", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> amountUsedV2() {
     MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountUsedV2", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> balanceV2() {
     MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceV2", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> presentmentAmountUsed() {
     MoneyV2Projection<AppliedGiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("presentmentAmountUsed", projection);
     return projection;
  }

  public AppliedGiftCardProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppliedGiftCardProjection<PARENT, ROOT> lastCharacters() {
    getFields().put("lastCharacters", null);
    return this;
  }
}
