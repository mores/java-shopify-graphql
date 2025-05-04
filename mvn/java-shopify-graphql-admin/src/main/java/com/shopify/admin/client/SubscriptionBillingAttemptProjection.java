package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingAttemptProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttempt"));
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> errorCode(
      ) {
     SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public OrderProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public SubscriptionBillingAttemptProcessingErrorProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> processingError(
      ) {
     SubscriptionBillingAttemptProcessingErrorProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProcessingErrorProjection<>(this, getRoot());
     getFields().put("processingError", projection);
     return projection;
  }

  public SubscriptionContractProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> subscriptionContract(
      ) {
     SubscriptionContractProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("subscriptionContract", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());    
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

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> errorMessage() {
    getFields().put("errorMessage", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> nextActionUrl() {
    getFields().put("nextActionUrl", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> originTime() {
    getFields().put("originTime", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> paymentGroupId() {
    getFields().put("paymentGroupId", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> paymentSessionId() {
    getFields().put("paymentSessionId", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> ready() {
    getFields().put("ready", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> respectInventoryPolicy() {
    getFields().put("respectInventoryPolicy", null);
    return this;
  }
}
