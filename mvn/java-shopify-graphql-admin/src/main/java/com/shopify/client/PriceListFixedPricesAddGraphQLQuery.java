package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PriceListPriceInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PriceListFixedPricesAddGraphQLQuery extends GraphQLQuery {
  public PriceListFixedPricesAddGraphQLQuery(String priceListId, List<PriceListPriceInput> prices,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (prices != null || fieldsSet.contains("prices")) {
        getInput().put("prices", prices);
    }
  }

  public PriceListFixedPricesAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListFixedPricesAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private List<PriceListPriceInput> prices;

    private String queryName;

    public PriceListFixedPricesAddGraphQLQuery build() {
      return new PriceListFixedPricesAddGraphQLQuery(priceListId, prices, queryName, fieldsSet);
               
    }

    
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    
    public Builder prices(List<PriceListPriceInput> prices) {
      this.prices = prices;
      this.fieldsSet.add("prices");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
