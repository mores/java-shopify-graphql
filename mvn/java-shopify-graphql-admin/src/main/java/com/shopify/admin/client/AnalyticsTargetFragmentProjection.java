package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CurrencyCode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class AnalyticsTargetFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AnalyticsTargetFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsTarget"));
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> currencyCode(
      ) {
     CurrencyCodeProjection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public MoneyV2Projection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> presentmentExpectedValue(
      ) {
     MoneyV2Projection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("presentmentExpectedValue", projection);
     return projection;
  }

  public MoneyV2Projection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> presentmentExpectedValue(
      CurrencyCode currencyCode) {
    MoneyV2Projection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("presentmentExpectedValue", projection);
    getInputArguments().computeIfAbsent("presentmentExpectedValue", k -> new ArrayList<>());                      
    InputArgument currencyCodeArg = new InputArgument("currencyCode", currencyCode, false, null);
    getInputArguments().get("presentmentExpectedValue").add(currencyCodeArg);
    return projection;
  }

  public MoneyV2Projection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> presentmentExpectedValueWithVariableReferences(
      String currencyCodeReference) {
    MoneyV2Projection<AnalyticsTargetFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("presentmentExpectedValue", projection);
    getInputArguments().computeIfAbsent("presentmentExpectedValue", k -> new ArrayList<>());              
    InputArgument currencyCodeArg = new InputArgument("currencyCode", currencyCodeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("CurrencyCode")));
    getInputArguments().get("presentmentExpectedValue").add(currencyCodeArg);
    return projection;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> endDate() {
    getFields().put("endDate", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> expectedValue() {
    getFields().put("expectedValue", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> filters() {
    getFields().put("filters", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> metric() {
    getFields().put("metric", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> shopifyqlQuery() {
    getFields().put("shopifyqlQuery", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> startDate() {
    getFields().put("startDate", null);
    return this;
  }

  public AnalyticsTargetFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AnalyticsTarget {");
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
