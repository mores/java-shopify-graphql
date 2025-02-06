package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CountryCode;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the applicable market for a customer based on where they are in the world.
 */
public class MarketByGeographyGraphQLQuery extends GraphQLQuery {
  public MarketByGeographyGraphQLQuery(CountryCode countryCode, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (countryCode != null || fieldsSet.contains("countryCode")) {
        getInput().put("countryCode", countryCode);
    }
  }

  public MarketByGeographyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "marketByGeography";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CountryCode countryCode;

    private String queryName;

    public MarketByGeographyGraphQLQuery build() {
      return new MarketByGeographyGraphQLQuery(countryCode, queryName, fieldsSet);
               
    }

    /**
     * The code for the country where the customer is.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      this.fieldsSet.add("countryCode");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
