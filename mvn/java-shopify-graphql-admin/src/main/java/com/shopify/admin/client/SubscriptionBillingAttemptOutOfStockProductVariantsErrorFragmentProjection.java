package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptOutOfStockProductVariantsError"));
  }

  public SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> outOfStockProductVariants(
      ) {
     ProductVariantConnectionProjection<SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("outOfStockProductVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> outOfStockProductVariants(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("outOfStockProductVariants", projection);
    getInputArguments().computeIfAbsent("outOfStockProductVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("outOfStockProductVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("outOfStockProductVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("outOfStockProductVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("outOfStockProductVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("outOfStockProductVariants").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<PARENT, ROOT> message(
      ) {
    getFields().put("message", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingAttemptOutOfStockProductVariantsError {");
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
