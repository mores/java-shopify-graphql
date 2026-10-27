package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CurrencyCode;
import java.lang.String;
import java.util.ArrayList;

public class AnalyticsTargetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsTarget"));
  }

  public AnalyticsTargetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public MoneyV2Projection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> presentmentExpectedValue(
      ) {
     MoneyV2Projection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("presentmentExpectedValue", projection);
     return projection;
  }

  public MoneyV2Projection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> presentmentExpectedValue(
      CurrencyCode currencyCode) {
    MoneyV2Projection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("presentmentExpectedValue", projection);
    getInputArguments().computeIfAbsent("presentmentExpectedValue", k -> new ArrayList<>());                      
    InputArgument currencyCodeArg = new InputArgument("currencyCode", currencyCode, false, null);
    getInputArguments().get("presentmentExpectedValue").add(currencyCodeArg);
    return projection;
  }

  public MoneyV2Projection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> presentmentExpectedValueWithVariableReferences(
      String currencyCodeReference) {
    MoneyV2Projection<AnalyticsTargetProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("presentmentExpectedValue", projection);
    getInputArguments().computeIfAbsent("presentmentExpectedValue", k -> new ArrayList<>());              
    InputArgument currencyCodeArg = new InputArgument("currencyCode", currencyCodeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("CurrencyCode")));
    getInputArguments().get("presentmentExpectedValue").add(currencyCodeArg);
    return projection;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> endDate() {
    getFields().put("endDate", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> expectedValue() {
    getFields().put("expectedValue", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> filters() {
    getFields().put("filters", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> metric() {
    getFields().put("metric", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> shopifyqlQuery() {
    getFields().put("shopifyqlQuery", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> startDate() {
    getFields().put("startDate", null);
    return this;
  }

  public AnalyticsTargetProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
