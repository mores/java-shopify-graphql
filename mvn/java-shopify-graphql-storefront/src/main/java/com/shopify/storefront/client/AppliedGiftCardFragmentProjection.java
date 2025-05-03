package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppliedGiftCardFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppliedGiftCardFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppliedGiftCard"));
  }

  public AppliedGiftCardFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> amountUsed() {
     MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountUsed", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> amountUsedV2() {
     MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountUsedV2", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> balanceV2() {
     MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceV2", projection);
     return projection;
  }

  public MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> presentmentAmountUsed(
      ) {
     MoneyV2Projection<AppliedGiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("presentmentAmountUsed", projection);
     return projection;
  }

  public AppliedGiftCardFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppliedGiftCardFragmentProjection<PARENT, ROOT> lastCharacters() {
    getFields().put("lastCharacters", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppliedGiftCard {");
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
