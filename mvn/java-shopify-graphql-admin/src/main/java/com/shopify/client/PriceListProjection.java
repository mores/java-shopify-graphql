package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.PriceListPriceOriginType;
import com.shopify.types.QuantityRuleOriginType;
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
