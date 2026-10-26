package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationShippingOption"));
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT>, ROOT> price(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT> description(
      ) {
    getFields().put("description", null);
    return this;
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT> phoneRequired(
      ) {
    getFields().put("phoneRequired", null);
    return this;
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT> presentmentTitle(
      ) {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionContractCalculationShippingOption {");
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
