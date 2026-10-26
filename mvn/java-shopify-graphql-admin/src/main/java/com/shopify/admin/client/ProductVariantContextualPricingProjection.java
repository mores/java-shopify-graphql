package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.QuantityPriceBreakSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ProductVariantContextualPricingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantContextualPricingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantContextualPricing"));
  }

  public ProductVariantContextualPricingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PricingAuditTrailProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> auditTrail(
      ) {
     PricingAuditTrailProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new PricingAuditTrailProjection<>(this, getRoot());
     getFields().put("auditTrail", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> compareAtPrice(
      ) {
     MoneyV2Projection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      ) {
     QuantityPriceBreakConnectionProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());
     getFields().put("quantityPriceBreaks", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      Integer first, String after, Integer last, String before, Boolean reverse,
      QuantityPriceBreakSortKeys sortKey) {
    QuantityPriceBreakConnectionProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());    
    getFields().put("quantityPriceBreaks", projection);
    getInputArguments().computeIfAbsent("quantityPriceBreaks", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("quantityPriceBreaks").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("quantityPriceBreaks").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("quantityPriceBreaks").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("quantityPriceBreaks").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("quantityPriceBreaks").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("quantityPriceBreaks").add(sortKeyArg);
    return projection;
  }

  public QuantityPriceBreakConnectionProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> quantityPriceBreaksWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    QuantityPriceBreakConnectionProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());    
    getFields().put("quantityPriceBreaks", projection);
    getInputArguments().computeIfAbsent("quantityPriceBreaks", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("quantityPriceBreaks").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("quantityPriceBreaks").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("quantityPriceBreaks").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("quantityPriceBreaks").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("quantityPriceBreaks").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("QuantityPriceBreakSortKeys"));
    getInputArguments().get("quantityPriceBreaks").add(sortKeyArg);
    return projection;
  }

  public QuantityRuleProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> quantityRule(
      ) {
     QuantityRuleProjection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleProjection<>(this, getRoot());
     getFields().put("quantityRule", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> unitPrice(
      ) {
     MoneyV2Projection<ProductVariantContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitPrice", projection);
     return projection;
  }
}
