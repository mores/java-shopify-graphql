package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.PriceListPriceOriginType;
import com.shopify.admin.types.QuantityRuleOriginType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PriceListProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceList"));
  }

  public PriceListProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> catalog(
      ) {
    CatalogProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new CatalogProjection<>(this, this);    
    getFields().put("catalog", projection);
    return projection;
  }

  public CurrencyCodeProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> currency(
      ) {
    CurrencyCodeProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currency", projection);
    return projection;
  }

  public PriceListParentProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> _parent(
      ) {
    PriceListParentProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new PriceListParentProjection<>(this, this);    
    getFields().put("parent", projection);
    return projection;
  }

  public PriceListPriceConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> prices(
      ) {
    PriceListPriceConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceConnectionProjection<>(this, this);    
    getFields().put("prices", projection);
    return projection;
  }

  public PriceListPriceConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> prices(
      PriceListPriceOriginType originType, Integer first, String after, Integer last, String before,
      Boolean reverse, String query) {
    PriceListPriceConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceConnectionProjection<>(this, this);    
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

  public PriceListPriceConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> pricesWithVariableReferences(
      String originTypeReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference,
      String queryReference) {
    PriceListPriceConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new PriceListPriceConnectionProjection<>(this, this);    
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

  public QuantityRuleConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> quantityRules(
      ) {
    QuantityRuleConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new QuantityRuleConnectionProjection<>(this, this);    
    getFields().put("quantityRules", projection);
    return projection;
  }

  public QuantityRuleConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> quantityRules(
      QuantityRuleOriginType originType, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    QuantityRuleConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new QuantityRuleConnectionProjection<>(this, this);    
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

  public QuantityRuleConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> quantityRulesWithVariableReferences(
      String originTypeReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    QuantityRuleConnectionProjection<PriceListProjectionRoot<PARENT, ROOT>, PriceListProjectionRoot<PARENT, ROOT>> projection = new QuantityRuleConnectionProjection<>(this, this);    
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

  public PriceListProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PriceListProjectionRoot<PARENT, ROOT> fixedPricesCount() {
    getFields().put("fixedPricesCount", null);
    return this;
  }

  public PriceListProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PriceListProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
