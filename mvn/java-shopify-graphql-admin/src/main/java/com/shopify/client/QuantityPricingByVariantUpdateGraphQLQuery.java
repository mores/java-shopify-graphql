package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.QuantityPricingByVariantUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class QuantityPricingByVariantUpdateGraphQLQuery extends GraphQLQuery {
  public QuantityPricingByVariantUpdateGraphQLQuery(String priceListId,
      QuantityPricingByVariantUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public QuantityPricingByVariantUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "quantityPricingByVariantUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private QuantityPricingByVariantUpdateInput input;

    private String queryName;

    public QuantityPricingByVariantUpdateGraphQLQuery build() {
      return new QuantityPricingByVariantUpdateGraphQLQuery(priceListId, input, queryName, fieldsSet);
               
    }

    
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    
    public Builder input(QuantityPricingByVariantUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
