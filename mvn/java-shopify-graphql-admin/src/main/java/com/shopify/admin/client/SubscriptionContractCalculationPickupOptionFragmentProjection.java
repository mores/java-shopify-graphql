package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationPickupOption"));
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> price(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT> phoneRequired(
      ) {
    getFields().put("phoneRequired", null);
    return this;
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT> pickupTime() {
    getFields().put("pickupTime", null);
    return this;
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT> presentmentTitle(
      ) {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionContractCalculationPickupOption {");
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
