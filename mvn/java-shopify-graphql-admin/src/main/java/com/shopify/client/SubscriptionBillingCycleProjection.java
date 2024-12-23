package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingCycleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycle"));
  }

  public SubscriptionBillingCycleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> billingAttempts(
      ) {
     SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());
     getFields().put("billingAttempts", projection);
     return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> billingAttempts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());    
    getFields().put("billingAttempts", projection);
    getInputArguments().computeIfAbsent("billingAttempts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("billingAttempts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("billingAttempts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("billingAttempts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("billingAttempts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("billingAttempts").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingCycleEditedContractProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> editedContract(
      ) {
     SubscriptionBillingCycleEditedContractProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleEditedContractProjection<>(this, getRoot());
     getFields().put("editedContract", projection);
     return projection;
  }

  public SubscriptionContractProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> sourceContract(
      ) {
     SubscriptionContractProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("sourceContract", projection);
     return projection;
  }

  public SubscriptionBillingCycleBillingCycleStatusProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> status(
      ) {
     SubscriptionBillingCycleBillingCycleStatusProjection<SubscriptionBillingCycleProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleBillingCycleStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SubscriptionBillingCycleProjection<PARENT, ROOT> billingAttemptExpectedDate() {
    getFields().put("billingAttemptExpectedDate", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<PARENT, ROOT> cycleEndAt() {
    getFields().put("cycleEndAt", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<PARENT, ROOT> cycleIndex() {
    getFields().put("cycleIndex", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<PARENT, ROOT> cycleStartAt() {
    getFields().put("cycleStartAt", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<PARENT, ROOT> edited() {
    getFields().put("edited", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<PARENT, ROOT> skipped() {
    getFields().put("skipped", null);
    return this;
  }
}
