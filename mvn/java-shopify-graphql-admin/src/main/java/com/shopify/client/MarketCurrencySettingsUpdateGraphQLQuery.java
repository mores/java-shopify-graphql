package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketCurrencySettingsUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MarketCurrencySettingsUpdateGraphQLQuery extends GraphQLQuery {
  public MarketCurrencySettingsUpdateGraphQLQuery(String marketId,
      MarketCurrencySettingsUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketCurrencySettingsUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketCurrencySettingsUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String marketId;

    private MarketCurrencySettingsUpdateInput input;

    private String queryName;

    public MarketCurrencySettingsUpdateGraphQLQuery build() {
      return new MarketCurrencySettingsUpdateGraphQLQuery(marketId, input, queryName, fieldsSet);
               
    }

    
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      this.fieldsSet.add("marketId");
      return this;
    }

    
    public Builder input(MarketCurrencySettingsUpdateInput input) {
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
