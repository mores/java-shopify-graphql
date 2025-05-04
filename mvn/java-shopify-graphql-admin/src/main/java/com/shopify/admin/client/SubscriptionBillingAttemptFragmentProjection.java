package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingAttemptFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingAttemptFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttempt"));
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> errorCode(
      ) {
     SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public OrderProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public SubscriptionBillingAttemptProcessingErrorProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> processingError(
      ) {
     SubscriptionBillingAttemptProcessingErrorProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProcessingErrorProjection<>(this, getRoot());
     getFields().put("processingError", projection);
     return projection;
  }

  public SubscriptionContractProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> subscriptionContract(
      ) {
     SubscriptionContractProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("subscriptionContract", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     OrderTransactionConnectionProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("transactions").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> errorMessage() {
    getFields().put("errorMessage", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> nextActionUrl() {
    getFields().put("nextActionUrl", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> originTime() {
    getFields().put("originTime", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> paymentGroupId() {
    getFields().put("paymentGroupId", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> paymentSessionId() {
    getFields().put("paymentSessionId", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> ready() {
    getFields().put("ready", null);
    return this;
  }

  public SubscriptionBillingAttemptFragmentProjection<PARENT, ROOT> respectInventoryPolicy() {
    getFields().put("respectInventoryPolicy", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingAttempt {");
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
