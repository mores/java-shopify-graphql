package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.PriceListPriceOriginType;
import com.shopify.admin.types.QuantityRuleOriginType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PriceListProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceList"));
  }

  public PriceListProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogProjection<PriceListProjection<PARENT, ROOT>, ROOT> catalog() {
     CatalogProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());
     getFields().put("catalog", projection);
     return projection;
  }

  public CurrencyCodeProjection<PriceListProjection<PARENT, ROOT>, ROOT> currency() {
     CurrencyCodeProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public PriceListParentProjection<PriceListProjection<PARENT, ROOT>, ROOT> _parent() {
     PriceListParentProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new PriceListParentProjection<>(this, getRoot());
     getFields().put("parent", projection);
     return projection;
  }

  public PriceListPriceConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> prices() {
     PriceListPriceConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceConnectionProjection<>(this, getRoot());
     getFields().put("prices", projection);
     return projection;
  }

  public PriceListPriceConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> prices(
      PriceListPriceOriginType originType, Integer first, String after, Integer last, String before,
      Boolean reverse, String query) {
    PriceListPriceConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceConnectionProjection<>(this, getRoot());    
    getFields().put("prices", projection);
    getInputArguments().computeIfAbsent("prices", k -> new ArrayList<>());                      
    InputArgument originTypeArg = new InputArgument("originType", originType, false, null);
    getInputArguments().get("prices").add(originTypeArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("prices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("prices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("prices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("prices").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("prices").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("prices").add(queryArg);
    return projection;
  }

  public PriceListPriceConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> pricesWithVariableReferences(
      String originTypeReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference,
      String queryReference) {
    PriceListPriceConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceConnectionProjection<>(this, getRoot());    
    getFields().put("prices", projection);
    getInputArguments().computeIfAbsent("prices", k -> new ArrayList<>());              
    InputArgument originTypeArg = new InputArgument("originType", originTypeReference, true, new graphql.language.TypeName("PriceListPriceOriginType"));
    getInputArguments().get("prices").add(originTypeArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("prices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("prices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("prices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("prices").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("prices").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("prices").add(queryArg);
    return projection;
  }

  public QuantityRuleConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> quantityRules() {
     QuantityRuleConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleConnectionProjection<>(this, getRoot());
     getFields().put("quantityRules", projection);
     return projection;
  }

  public QuantityRuleConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> quantityRules(
      QuantityRuleOriginType originType, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    QuantityRuleConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleConnectionProjection<>(this, getRoot());    
    getFields().put("quantityRules", projection);
    getInputArguments().computeIfAbsent("quantityRules", k -> new ArrayList<>());                      
    InputArgument originTypeArg = new InputArgument("originType", originType, false, null);
    getInputArguments().get("quantityRules").add(originTypeArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("quantityRules").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("quantityRules").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("quantityRules").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("quantityRules").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("quantityRules").add(reverseArg);
    return projection;
  }

  public QuantityRuleConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> quantityRulesWithVariableReferences(
      String originTypeReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    QuantityRuleConnectionProjection<PriceListProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleConnectionProjection<>(this, getRoot());    
    getFields().put("quantityRules", projection);
    getInputArguments().computeIfAbsent("quantityRules", k -> new ArrayList<>());              
    InputArgument originTypeArg = new InputArgument("originType", originTypeReference, true, new graphql.language.TypeName("QuantityRuleOriginType"));
    getInputArguments().get("quantityRules").add(originTypeArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("quantityRules").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("quantityRules").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("quantityRules").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("quantityRules").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("quantityRules").add(reverseArg);
    return projection;
  }

  public PriceListProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PriceListProjection<PARENT, ROOT> fixedPricesCount() {
    getFields().put("fixedPricesCount", null);
    return this;
  }

  public PriceListProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PriceListProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
