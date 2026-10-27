package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionContractCalculationSuccessFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionContractCalculationSuccessFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationSuccess"));
  }

  public SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionCalculatedContractProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> calculatedContract(
      ) {
     SubscriptionCalculatedContractProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionCalculatedContractProjection<>(this, getRoot());
     getFields().put("calculatedContract", projection);
     return projection;
  }

  public SubscriptionContractCalculationDeliveryOptionProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> deliveryOptions(
      ) {
     SubscriptionContractCalculationDeliveryOptionProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationDeliveryOptionProjection<>(this, getRoot());
     getFields().put("deliveryOptions", projection);
     return projection;
  }

  public SubscriptionContractCalculationProjectedOrderTotalsProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> projectedOrderTotals(
      ) {
     SubscriptionContractCalculationProjectedOrderTotalsProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationProjectedOrderTotalsProjection<>(this, getRoot());
     getFields().put("projectedOrderTotals", projection);
     return projection;
  }

  public SubscriptionContractCalculationDiagnosticProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> warnings(
      ) {
     SubscriptionContractCalculationDiagnosticProjection<SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationDiagnosticProjection<>(this, getRoot());
     getFields().put("warnings", projection);
     return projection;
  }

  public SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionContractCalculationSuccessFragmentProjection<PARENT, ROOT> withMerchandiseCustomizations(
      ) {
    getFields().put("withMerchandiseCustomizations", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionContractCalculationSuccess {");
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
