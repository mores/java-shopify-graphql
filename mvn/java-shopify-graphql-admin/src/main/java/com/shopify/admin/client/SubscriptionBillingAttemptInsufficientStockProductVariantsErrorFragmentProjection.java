package com.shopify.admin.client;

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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("insufficientStockProductVariants").add(reverseArg);
    return projection;
  }

  public ProductVariantConnectionProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> insufficientStockProductVariantsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductVariantConnectionProjection<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("insufficientStockProductVariants", projection);
    getInputArguments().computeIfAbsent("insufficientStockProductVariants", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("insufficientStockProductVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("insufficientStockProductVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("insufficientStockProductVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("insufficientStockProductVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
