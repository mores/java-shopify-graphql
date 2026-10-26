package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.QuantityPriceBreakSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PriceListPriceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListPriceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListPrice"));
  }

  public PriceListPriceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<PriceListPriceProjection<PARENT, ROOT>, ROOT> compareAtPrice() {
     MoneyV2Projection<PriceListPriceProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPrice", projection);
     return projection;
  }

  public PriceListPriceOriginTypeProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> originType(
      ) {
     PriceListPriceOriginTypeProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceOriginTypeProjection<>(this, getRoot());
     getFields().put("originType", projection);
     return projection;
  }

  public MoneyV2Projection<PriceListPriceProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<PriceListPriceProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      ) {
     QuantityPriceBreakConnectionProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());
     getFields().put("quantityPriceBreaks", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      Integer first, String after, Integer last, String before, Boolean reverse,
      QuantityPriceBreakSortKeys sortKey) {
    QuantityPriceBreakConnectionProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());    
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

  public QuantityPriceBreakConnectionProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> quantityPriceBreaksWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    QuantityPriceBreakConnectionProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());    
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

  public ProductVariantProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<PriceListPriceProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }
}
