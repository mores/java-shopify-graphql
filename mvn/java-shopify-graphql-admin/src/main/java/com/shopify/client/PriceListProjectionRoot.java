package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.PriceListPriceOriginType;
import com.shopify.types.QuantityRuleOriginType;
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
    InputArgument originTypeArg = new InputArgument("originType", originType);
    getInputArguments().get("prices").add(originTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("prices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("prices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("prices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("prices").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("prices").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
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
    InputArgument originTypeArg = new InputArgument("originType", originType);
    getInputArguments().get("quantityRules").add(originTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("quantityRules").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("quantityRules").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("quantityRules").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("quantityRules").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("quantityRules").add(reverseArg);
    return projection;
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
