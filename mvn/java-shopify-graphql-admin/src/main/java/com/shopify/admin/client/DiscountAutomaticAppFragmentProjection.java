package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class DiscountAutomaticAppFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountAutomaticAppFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticApp"));
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> appDiscountType(
      ) {
     AppDiscountTypeProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountContextProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> context(
      ) {
     DiscountContextProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountContextProjection<>(this, getRoot());
     getFields().put("context", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     DiscountClassProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> discountClasses(
      ) {
     DiscountClassProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public FunctionsErrorHistoryProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> errorHistory(
      ) {
     FunctionsErrorHistoryProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new FunctionsErrorHistoryProjection<>(this, getRoot());
     getFields().put("errorHistory", projection);
     return projection;
  }

  public RolloutConnectionProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> rollouts(
      ) {
     RolloutConnectionProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutConnectionProjection<>(this, getRoot());
     getFields().put("rollouts", projection);
     return projection;
  }

  public RolloutConnectionProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> rollouts(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    RolloutConnectionProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutConnectionProjection<>(this, getRoot());    
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

  public RolloutConnectionProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> rolloutsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    RolloutConnectionProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutConnectionProjection<>(this, getRoot());    
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

  public DiscountStatusProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DiscountStatusProjection<DiscountAutomaticAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> appliesOnOneTimePurchase() {
    getFields().put("appliesOnOneTimePurchase", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> appliesOnSubscription() {
    getFields().put("appliesOnSubscription", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> discountId() {
    getFields().put("discountId", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountAutomaticApp {");
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
