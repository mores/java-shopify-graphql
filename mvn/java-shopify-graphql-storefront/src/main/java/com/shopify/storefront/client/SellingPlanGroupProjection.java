package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SellingPlanGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanGroup"));
  }

  public SellingPlanGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupOptionProjection<SellingPlanGroupProjection<PARENT, ROOT>, ROOT> options(
      ) {
     SellingPlanGroupOptionProjection<SellingPlanGroupProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupOptionProjection<>(this, getRoot());
     getFields().put("options", projection);
     return projection;
  }

  public SellingPlanConnectionProjection<SellingPlanGroupProjection<PARENT, ROOT>, ROOT> sellingPlans(
      ) {
     SellingPlanConnectionProjection<SellingPlanGroupProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlans", projection);
     return projection;
  }

  public SellingPlanConnectionProjection<SellingPlanGroupProjection<PARENT, ROOT>, ROOT> sellingPlans(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanConnectionProjection<SellingPlanGroupProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlans", projection);
    getInputArguments().computeIfAbsent("sellingPlans", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlans").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlans").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlans").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlans").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlans").add(reverseArg);
    return projection;
  }

  public SellingPlanGroupProjection<PARENT, ROOT> appName() {
    getFields().put("appName", null);
    return this;
  }

  public SellingPlanGroupProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
