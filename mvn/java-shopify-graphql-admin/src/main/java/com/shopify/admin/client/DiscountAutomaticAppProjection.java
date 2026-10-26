package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DiscountAutomaticAppProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticAppProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticApp"));
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> appDiscountType(
      ) {
     AppDiscountTypeProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountContextProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> context() {
     DiscountContextProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountContextProjection<>(this, getRoot());
     getFields().put("context", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> discountClasses(
      ) {
     DiscountClassProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public FunctionsErrorHistoryProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> errorHistory(
      ) {
     FunctionsErrorHistoryProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new FunctionsErrorHistoryProjection<>(this, getRoot());
     getFields().put("errorHistory", projection);
     return projection;
  }

  public RolloutConnectionProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> rollouts(
      ) {
     RolloutConnectionProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new RolloutConnectionProjection<>(this, getRoot());
     getFields().put("rollouts", projection);
     return projection;
  }

  public RolloutConnectionProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> rollouts(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    RolloutConnectionProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new RolloutConnectionProjection<>(this, getRoot());    
    getFields().put("rollouts", projection);
    getInputArguments().computeIfAbsent("rollouts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("rollouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("rollouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("rollouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("rollouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("rollouts").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("rollouts").add(queryArg);
    return projection;
  }

  public RolloutConnectionProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> rolloutsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    RolloutConnectionProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new RolloutConnectionProjection<>(this, getRoot());    
    getFields().put("rollouts", projection);
    getInputArguments().computeIfAbsent("rollouts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("rollouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("rollouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("rollouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("rollouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("rollouts").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("rollouts").add(queryArg);
    return projection;
  }

  public DiscountStatusProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> status() {
     DiscountStatusProjection<DiscountAutomaticAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> appliesOnOneTimePurchase() {
    getFields().put("appliesOnOneTimePurchase", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> appliesOnSubscription() {
    getFields().put("appliesOnSubscription", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> discountId() {
    getFields().put("discountId", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountAutomaticAppProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
