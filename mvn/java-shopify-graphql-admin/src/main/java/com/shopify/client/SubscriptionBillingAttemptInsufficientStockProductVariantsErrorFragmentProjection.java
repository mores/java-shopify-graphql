package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection(
      PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptInsufficientStockProductVariantsError"));
  }

  public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> insufficientStockProductVariants(
      ) {
     ProductVariantConnectionProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("insufficientStockProductVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> insufficientStockProductVariants(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("insufficientStockProductVariants", projection);
    getInputArguments().computeIfAbsent("insufficientStockProductVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("insufficientStockProductVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("insufficientStockProductVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("insufficientStockProductVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("insufficientStockProductVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("insufficientStockProductVariants").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT> message(
      ) {
    getFields().put("message", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingAttemptInsufficientStockProductVariantsError {");
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
